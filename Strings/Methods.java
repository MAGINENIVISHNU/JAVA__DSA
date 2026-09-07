class Methods{
    public static void main(String [] args){
        String obj1="Vishnu_Yadav";
        System.out.println("Length of String:"+obj1);
        char arr[]={'k','m','c','e'};
        String obj3=new String(arr);
        //concat
        System.out.println("Concatenate of string and string arr"+obj1.concat(obj3));
        //touppercase
        System.out.println("Contents of string in upper case:"+obj1.toUpperCase());
        //to lowercase
        System.out.println("Conents of String in lower case:"+obj1.toLowerCase());
        //spliting 
        for(String res:obj1.split("-",2))
        System.out.println("Splitting the string "+obj1.contains("Vishnu"));
        //replace
        System.out.println("Replace function in string"+(obj1.replace('i','u')));
        //replaceall
        System.out.println("ReplaceAll function in string:"+(obj1.replaceAll("Yada","i")));
        //substring
        System.out.println("Substring of string :"+(obj1.substring(3,6)));
        //trim 
        String str="Vishnu_yadav";
        System.out.println("With out trim function in string :"+str);
        System.out.println("trim function in string :"+(str.trim()));
         String obj2="vishnu";
        //equal
        System.out.println("using equal function:"+(obj1.equals(obj2)));
        //equalignore
        System.out.println("using equalignore function:"+(obj1.equalsIgnoreCase(obj2)));
        //compare
        System.out.println("using compare function:"+(obj1.compareTo(obj2)));
        //compareignore
        System.out.println("using compareignore function:"+(obj1.compareToIgnoreCase(obj2)));
        //starts
        System.out.println("using starts with function:"+(obj1.startsWith("VI")));
        //ends
        System.out.println("using Ends with function:"+(obj1.endsWith("NU")));

        
        
    }
}
/*


Problem:Given a sentence, count the total number of words and print the average length of the words.
Input Format:A single line containing a sentence.
Output Format:
Two lines:
The total number of words
The average word length (rounded to 2 decimal places)
Example:
Input
Java is a powerful programming language
Output
6
5.33
*/
import java.util.*;
class Test{
    public static void main(String [] args){
        StringTokenizer st=new String(Tokenizer(String str )));
       String m=st.Length(st);
        System.out.println("Lenght"+m);

    
    }
}