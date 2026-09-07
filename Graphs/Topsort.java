package Graphs;
import java.util.*;
class Topsort{
    static class Edge{
        int sr;
        int de;
        Edge(int s,int d){
            this.sr=s;
            this.de=d;
        }
    }
    public static void Create(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 1));
    }
    public static void topsort(ArrayList<Edge>graph[],int cur, boolean visit[],Stack s){
        visit[cur]=true;
        for(int i=0;i<graph[cur].size();i++){
            Edge e=graph[cur].get(i);
            if(!visit[e.de]){
                topsort(graph,e.de,visit,s);
            }
        }
        s.push(cur);
    }
    public static void top(ArrayList<Edge>graph[],int n){
        boolean visit[]=new boolean[n];
        Stack s=new Stack();
        for(int i=0;i<n;i++){
            if(!visit[i]){
                topsort(graph, i, visit, s);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Edge>graph[]=new ArrayList[n];
        Create(graph);
        top(graph, n);
    }
}
