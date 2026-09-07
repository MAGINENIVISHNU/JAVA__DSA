package Graphs.Bellmanfordalg;
import java.util.*;

class implemen{
    static class Edge{
        int sr;
        int de;
        int wt;
        Edge(int s,int w,int d){
            this.sr=s;
            this.de=d;
            this.wt=w;
        }
    }
    public static void Create(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,4, 2));
        graph[0].add(new Edge(0,2, 1));
        graph[1].add(new Edge(1,-4, 2));
        graph[2].add(new Edge(2,2, 3));
        graph[3].add(new Edge(3,4, 4));
        graph[4].add(new Edge(4,-1, 1));
    }
    //BellmanFord
    public static void Bellman(ArrayList<Edge>graph[],int sr,int n){
        int dis[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=sr){
                dis[i]=Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<n-1;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e=graph[i].get(j);
                    int u=e.sr;
                    int v=e.de;
                    if(dis[u]!=Integer.MAX_VALUE && dis[u]+e.wt<dis[v]){
                        dis[v]=dis[u]+e.wt;
                    }
                }
            }
        }
        for(int i:dis){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        @SuppressWarnings({"rawtypes", "unchecked"})
        ArrayList<Edge> graph[]=new ArrayList[n];
        Create(graph);
        Bellman(graph, 0, n);
    }
}