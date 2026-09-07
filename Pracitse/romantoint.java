import java.util.*;
class romantoint{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(roman(s,0));
    }
    
    public static int roman(String s,int a){
        HashMap<Character,Integer>v=new HashMap<>();
        v.put('I',1);
        v.put('V',5);
        v.put('X',10);
        v.put('L',50);
        v.put('C',100);
        v.put('D',500);
        v.put('M',1000);
        for(int i=0;i<s.length();i++){
            int cur=v.get(s.charAt(i));
            if(i<s.length()-1){
                int next=v.get(s.charAt(i+1));
                if(cur<next){
                    a-=cur;
                }else{
                    a+=cur;
                }
            }else{
                a+=cur;
            }
        }
        return a;
    }
}