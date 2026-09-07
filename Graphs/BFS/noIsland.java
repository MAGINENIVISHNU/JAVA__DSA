package Graphs.BFS;
import java.util.*;;

class  noIsland{
    static class Pair{
        int row;
        int col;
        Pair(int r,int c){
            this.row=r;
            this.col=c;
        }
    }
        public static void Create(int [][] island,Scanner sc){
            for(int i=0;i<island.length;i++){
                for(int j=0;j<island[0].length;j++){
                    island[i][j]=sc.nextInt();
                }
            }
        }
        public static int no(int [][] island,boolean[][]visit){
            Queue<Pair>q=new LinkedList<>();
            int ans=0;
            int dr[]={-1,1,0,0};
            int dc[]={0,0,1,-1};
           
             for(int i=0;i<island.length;i++){
                    for(int j=0;j<island[0].length;j++){
                        if((!visit[i][j]) && (island[i][j]==1)){
                            q.offer(new Pair(i, j));
                            visit[i][j]=true;
                            ans++;
                            while (!q.isEmpty()) {
                                Pair cur=q.poll();
                                int r=cur.row;
                                int c=cur.col;
                                for(int k=0;k<4;k++){
                                    int nr=r+dr[k];
                                    int nc=c+dc[k];
                                    if(nr>=0 && nr<island.length && nc>=0 &&
                                         nc<island[0].length && 
                                         (!visit[nr][nc]) && 
                                         (island[nr][nc]==1)){
                                       visit[nr][nc]=true;
                                        q.offer(new Pair(nr, nc));
                                    }
                                }
                            }   
                        }
                    }
                
                }
            return ans;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int island[][]=new int[n][m];
            Create(island, sc);
            System.out.println(no(island, new boolean[n][m]));
        }
}
