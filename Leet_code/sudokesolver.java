import java.util.Scanner;

public class sudokesolver {
     public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char board[][]=new char[n][n];
    helper(board,0,0);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(board[i][j]+" ");
        }
    }
 }
 public static Boolean helper(char[][] board,int row,int col){
    if(row==board.length)
    {
        return true;
    }
    int nrow=0;
    int ncol=0;
    if(col==board.length-1){
       nrow=row+1;
       ncol=0;
    }
    else{
        ncol=col+1;;
        nrow=row;
    }
    if(board[row][col]=='.'){
        if(helper(board, row, col)){

            return true;
        }
    }
    else{
        for(int i=1;i<=9;i++){
           if(safe(board,row,col,i)){
            board[row][col]=(char)(i+'0');
            if(helper(board,nrow, ncol)){
                return true;
            }else{
                board[row][col]='.';
            }
           }
        }
    }
    return false;
  }
  public static boolean safe(char[][] board,int nrow,int ncol,int no ){
    //row
    for(int i=nrow;i<board.length;i++){
        if(board[i][ncol]==no){

            return false;
        }
    }
    //col
    for(int i=ncol;i<board.length;i++){
        if(board[nrow][i]==no){
            return false;
        }
    }
    //grid
    int sr=(nrow/3)*3;
    int sc=(ncol/3)*3;
    for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
            if(board[i][j]==no){
                return false;
            }
        }
    }
    return true;

  }
}
