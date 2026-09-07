package TRIE;
import java.util.*;
class implenation{
    public class Trie{
        static class Node{
            Node child[]=new Node[26];
            Boolean eod=false;
           public  Node(){
                for(int i=0;i<26;i++){
                    child[i]=null;
                }
            }

        }
        public static Node root = new Trie.Node();
        public static void  insert(String word){
            int len=word.length();
            int idx=0;
            Node cur=root;
            for(int i=0;i<len;i++){
                idx=word.charAt(i)-'a';
                if(cur.child[idx]==null){
                    cur.child[idx]=new Node();
                }
                cur=cur.child[idx];
            }
            cur.child[idx].eod=true;
        }
        public static boolean search(String key){
            int len=key.length();
            int idx=0;
            Node cur=root;
            for(int i=0;i<len;i++){
                idx=key.charAt(i)-'a';
                if(cur.child[idx]==null){
                    return false;
                }
                cur=cur.child[idx];
            }
            return cur.eod==true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the required words");
        int n=sc.nextInt();
        String words[]=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
       for(String word:words){
        Trie.insert(word);
        System.out.println("Inserted"+word);
       }
        System.out.println(Trie.search(sc.next()));
    }
}
