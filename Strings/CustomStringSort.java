

/*

Custom Sorting of Strings
Difficulty: Medium
Problem Statement
Given a list of strings, sort them:
First by length (shorter first)
If two strings have the same length, sort them lexicographically.

Input Format
n
string1
string2
...
stringn

Output Format

Sorted strings, one per line.
Sample Input
5
apple
bat
banana
ant
cat

Sample Output
ant
bat
cat
apple
banana


import java.util. *;
class CustomStringSort{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<String>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextLine());
            
        }
        list.sort((a,b)->{
            if (a.length()==b.length())
            return a.compareTo(b);
            return a.length()-b.length();
            
        });
        for(String s:list){
            System.out.println(s);
        }
    }
}*/
import java.util.*;
class CustomStringSort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of names");
        int n=sc.nextInt();
        sc.nextLine();
        List<String> list=new ArrayList<>();
        for(int i=0; i<n;i++){
            list.add(sc.nextLine());
        }
        list.sort((a,b)->{
            if (a.length()==b.length())
            return a.compareTo(b);
            return a.length()-b.length();
        });
        for(String s: list){
            System.out.println(s);
        }
    }
}