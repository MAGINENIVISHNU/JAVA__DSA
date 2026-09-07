 
    /*
Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false
*/
import java.util.*;
class validpaternesis {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Stack<Character>n=new Stack<>();
        for(char ch : a.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                n.push(ch);
            }
            else{
               if(n.isEmpty()){
                System.out.println(false);
                return;
               }
               else{
                   char top=n.pop();
                   if(ch==')' &&top!='(' || ch=='}' && top!='{' || ch==']' && top!='['){
                       System.out.println(false);
                       return;
                   }
                   
                   
               }
                
           }
        
            
        }
        System.out.println(n.isEmpty());
    }
}

