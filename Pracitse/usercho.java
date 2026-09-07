import java.util.Scanner;
public class usercho {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int m=sc.nextInt();
        int z=0,p=0;
        int v=0;
        choice(m,z,p,v,sc);
        
    }
    public static void choice(int m,int z,int p,int v,Scanner sc){
        for(int i=1;i<=m;i++){
            int us=sc.nextInt();
            if (us==0){
                z+=1;
            }
            else if(us>0){
                p+=1;
            }
            else{
                v+=1;
            }


        }
       System.out.println("No of Zeroes"+z+"\n No of postive"+p+"\n No of negtive"+v);
    }
}
