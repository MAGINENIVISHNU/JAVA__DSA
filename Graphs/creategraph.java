package Graphs;
import java.util.*;
public class creategraph {
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
    public static void BFS(ArrayList<Edge>graph[],int v){
        boolean visit[]=new boolean[v];
        for(int i=0;i<visit.length;i++){
            if(!visit[i]){
                Queue<Integer>q=new LinkedList<>();
                q.add(i);
                while (!q.isEmpty()) {
                    int cur=q.remove();
                    if(!visit[cur]){
                        System.out.print(cur+" ");
                        visit[cur]=true; 
                        for(int j=0;j<graph[cur].size();j++){
                            Edge e=graph[cur].get(j);
                            q.add(e.di);
                        }
                    }   
                }
            }
        }
        System.out.println();
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
    public static void Allpath(ArrayList<Edge>graph[],String path,boolean visit[],int tar,int cur){
        if(cur==tar){
            System.out.println(path+cur);
            return;
        }
        visit[cur]=true;
        for(int i=0;i<graph[cur].size();i++){
            Edge e=graph[cur].get(i);
            if(!visit[e.di]){
                Allpath(graph, path+cur+" -> ", visit, tar, e.di);
            }
        }
        visit[cur]=false;
    }
    public static void main(String [] args){
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[v];
        Create(graph);
        BFS(graph, v);
        DFS(graph, 0,new boolean[v]);
        Allpath(graph, "", new boolean[v], 3, 0);

    }
}
