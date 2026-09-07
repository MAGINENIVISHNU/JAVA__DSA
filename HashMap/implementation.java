package DSA.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
class implementation{
    public static void main(String[ ]args){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("india", 120);
        map.put("indu", 130);
        map.put("ind", 13);
        ArrayList<String>key=new ArrayList<>(map.keySet());
        for(int i=0;i<key.size();i++){
            System.out.println(key.get(i)+" "+map.get(key.get(i)));
        }
        map.remove("ind");
        System.out.println(map.get("ind"));
        
    }
}
class HashMapcode{
    static class HashMap<k,v>{
        private class Node{
            k key;
            v value;
            public Node(k key,v value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> bucket[];
        @SuppressWarnings("Unchecked")
        public HashMap(){
            this.N=4;
            this.bucket=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.bucket[i]=new LinkedList<>();
            }
        }
        private int hashfun(k key){
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }
        private int searchin(k key,int bi){
            LinkedList<Node> ll =bucket[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        public void put(k key, v value){
            int bi=hashfun(key);
            int di=searchin(key, bi);
            if(di==-1){
                bucket[bi].add(new Node(key, value));
                n++;
            }else{
                Node node=bucket[bi].get(di);
                node.value=value;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }
        public boolean containKey(k key){
            int bi=hashfun(key);
            int di=searchin(key, bi);
            if(di==-1){
                return false;
            }else{
                return true;
            }
        }
        @SuppressWarnings("Unchecked")
        private void rehash(){
            LinkedList<Node> oldbucket[]=bucket;
            bucket=new LinkedList[N*2];
            for(int i=0;i<N*2;i++){
                bucket[i]=new LinkedList<>();
            }
            for(int i=0;i<oldbucket.length;i++){
                LinkedList<Node>ll=oldbucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        //remove
        public v remove(k key){
            int bi=hashfun(key);
            int di=searchin(key, bi);
            if(di==-1){
                return null;
            }else{
                Node node=bucket[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public v get(k key){
            int bi=hashfun(key);
            int di=searchin(key, bi);
            if(di==-1){
                return null;
            }
            else{
                Node node=bucket[bi].get(di);
                return node.value;
            }
        }
        public ArrayList<k>keySet(){
            ArrayList<k>key=new ArrayList<>();
            for(int i=0;i<bucket.length;i++){
                LinkedList<Node>ll=bucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    key.add(node.key);
                }
            }
            return key;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }
}
