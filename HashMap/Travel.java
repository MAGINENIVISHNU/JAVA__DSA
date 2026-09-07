import java.util.*;
class Travel{
    public static String Starting(HashMap<String,String>s){
        HashMap<String,String>rev=new HashMap<>();
        for(String key:s.keySet()){
            rev.put(s.get(key), key);
        }
        for(String key:s.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String>s=new HashMap<>();
        s.put("chennai", "Bengalure");
        s.put("Goa","chennai");
        s.put("Delhi","Goa");
        s.put("Mumbai","Delhi");
       String  start=Starting(s);
       while(s.containsKey(start)){
        System.out.print(start+"->");
        start=s.get(start);
       }
       System.out.println(start);
    }
}