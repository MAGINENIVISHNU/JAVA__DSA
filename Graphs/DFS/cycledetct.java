package Graphs.DFS;
import java.util.*;
class cycledetct{
    static class Edge{
        int sr;
        int de;
        Edge(int s,int d){
            this.sr=s;
            this.de=d;
        }
    }
    public static void create(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[0].add(new Edge(0, 2));
    }
    public static boolean cycle(ArrayList<Edge>graph[],boolean []visit,
        boolean res[],int cur){
            res[cur]=true;
            visit[cur]=true;
            for(int i=0;i<graph[cur].size();i++){
                Edge e=graph[cur].get(i);
                if(!visit[e.de]){
                    if(cycle(graph, visit, res, e.de)){
                        return true;
                    }
                }
                else if(res[cur]){
                    return true;
                }
            }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Edge>graph[]=new ArrayList[n];
        create(graph);
        System.out.println(cycle(graph, new boolean[n], new boolean[n], 0));
    }
}
