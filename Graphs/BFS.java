package Graphs;
import java.util.*;
public class BFS {
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
    public static void main(String [] args){
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[v];
        Create(graph);
        BFS(graph, v);
    }
}

