package Graphs;
import java.util.*;
public class  DFS  {
    static class Edge{
        int sr;
        int di;
        Edge(int s,int d){
            this.sr=s;
            this.di=d;
        }
    }
    static void Create(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
    }
    public static void DFS(ArrayList<Edge>graph[],int cur,boolean visit[]){
        if(visit[cur]){
            return;
        }
        System.out.println(cur+" ");
        visit[cur]=true;
        for(int i=0;i<graph[cur].size();i++){
            Edge e=graph[cur].get(i);
            DFS(graph, e.di, visit);
        }
    }
    
    public static void main(String [] args){
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[v];
        Create(graph);
        DFS(graph, 0,new boolean[v]);
       
    }
}
