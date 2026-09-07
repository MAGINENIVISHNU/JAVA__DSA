package Graphs.Dijkstra;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class implementation {
    static class Edge{
        int sr;
        int de;
        int wt;
        Edge(int s,int d,int w){
            this.sr=s;
            this.de=d;
            this.wt=w;
        }
    }
    public static void Create(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    //dijkstr
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair(int n,int d){
            this.node=n;
            this.dist=d;
        }
        @Override
        public int compareTo(Pair p2){
            return this.dist-p2.dist;
        }
    }
    public static void dijkstra(ArrayList<Edge>graph[],int se,int n){
        PriorityQueue<Pair>q=new PriorityQueue<>();
        int dis[]=new int[n];
        for(int i=0;i<n;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[se]=0;
        boolean vis[]=new boolean[n];
        q.add(new Pair(se, 0));
        while(!q.isEmpty()){
            Pair cur=q.remove();
            if(!vis[cur.node]){
                vis[cur.node]=true;
                for(int i=0;i<graph[cur.node].size();i++){
                    Edge e=graph[cur.node].get(i);
                    int u=e.sr;
                    int v=e.de;
                    if(dis[u]+e.wt<dis[v]){
                        dis[v]=dis[u]+e.wt;
                        q.add(new Pair(v, dis[v]));
                    }
                }
            }
        }
        for(int i=0;i<dis.length;i++){
            System.out.print(dis[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int n=6;
        ArrayList<Edge>graph[]=new ArrayList[n];
        Create(graph);
        dijkstra(graph, 0, n);
    }
}
