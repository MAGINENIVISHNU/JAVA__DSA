/*
Check if the Sentence Is Pangram:
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:

Input: sentence = "leetcode"
Output: false

*/
import java.util.Scanner;
class pangram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.next().toLowerCase();
        int arr[]=new int[26];
        for(int i=0;i<n.length();i++){
            arr[n.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        // int c=0;
        // for(int i=0;i<n.length();i++){
        //     for(int j=1;j<n.length();j++){
        //         if(n.charAt(i)==n.charAt(j)){
        //             c++;
        //             break;
             
        //         }
        //     }
        // }
        // if(c==n.length())
        // {
        //     System.out.println(true);
        // }else{
        // System.out.println(false);
    //}
    }
}