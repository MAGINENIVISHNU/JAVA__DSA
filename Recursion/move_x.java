public class move_x {
     public static void movex(String s,int idx,String s2,int cnt){
    if(idx==s.length()){
      for(int i=0;i<cnt;i++){
        s2+='x';
      }
      System.out.println(s2);
      return;
    }
    char cur=s.charAt(idx);
    if(cur=='x'){
      cnt++;
      movex(s,idx+1,s2,cnt);
    }
    else{
      s2+=cur;
      movex(s,idx+1,s2,cnt );
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    movex(s,0,"",0);
  }
}
