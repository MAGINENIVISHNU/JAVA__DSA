package Graphs.BFS;
import java.util.*;
class RottingOranges{
    /*static class Pair{
        int row;
        int col;
        int time;
        Pair(int r,int c,int t){
            this.row=r;
            this.col=c;
            this.time=t;
        }
    }*/
    public static void Create(int [][] graph,Scanner sc){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                graph[i][j]=sc.nextInt();
            }
        }
    }
  /*   public static int Rotting(int [][] graph){
        Queue<Pair>q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                if(graph[i][j]==2){
                    q.offer(new Pair(i, j, 0));
                }
                if(graph[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int ans=0;
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(!q.isEmpty()){
            Pair cur=q.poll();
            int r=cur.row;
            int c=cur.col;
            int t=cur.time;
            ans=Math.max(ans, t);
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nr<graph.length && nc>=0 && nc<graph[0].length && graph[nr][nc]==1){
                    graph[nr][nc]=2;
                    q.add(new Pair(nr, nc, t+1));
                    fresh--;
                }
            }
        }
        if(fresh!=0){
            return-1;
        }
        return ans;
    }*/
    public static int rott(int [][]graph){
        int fresh=0;
        Queue<int []>q=new LinkedList<>();

        int ans=0;
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                if(graph[i][j]==2){
                    q.offer(new int[]{i,j,0});
                }
                if(graph[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int dr[]={-1,1,0,0};
        int dc[]={0,0,1,-1};
        while(!q.isEmpty()){
            int cur[]=q.poll();
            int ro=cur[0];
            int co=cur[1];
            int ti=cur[2];
            ans=Math.max(ans, ti);
            
            for(int i=0;i<4;i++){
                int nr=ro+dr[i];
                int nc=co+dc[i];
                if(nr>=0 && nr<graph.length && nc>=0 && nc<graph[0].length && graph[nr][nc]==1){
                    graph[nr][nc]=2;
                    fresh--;
                    q.add(new int[]{nr,nc,ti+1});
                }
            }
        }
        if(fresh!=0){
            return -1;
        }
        return ans;

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]graph=new int[n][m];
        Create(graph, sc);
      //  System.out.println(Rotting(graph));
      System.out.println(rott(graph));
    }
}
