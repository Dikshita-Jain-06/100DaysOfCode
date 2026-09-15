// 9. Problem Statement 
// A hospital maintains the token numbers of patients waiting for registration using an 
// ArrayList. During registration, some token numbers are cancelled. 
// Write a Java program to store the token numbers in an ArrayList, remove all token numbers 
// that are divisible by a given cancellation number, and display the remaining token numbers 
// in their original order. 

// Input Format 
// The first line contains an integer N. 
// The second line contains N space-separated token numbers. 
// The third line contains the cancellation number. 

// Output Format 
// Print the remaining token numbers separated by a single space. 
// If no token remains, print -1. 

// Code Constraints 
// 1 ≤ N ≤ 1000 
// 1 ≤ Token Number ≤ 100000 
// 1 ≤ Cancellation Number ≤ 100 

// Sample Input 
// 8 
// 12 15 18 21 24 25 30 31 
// 3 

// Sample Output 
// 15 25 31
import java.util.*;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer> remaining = new ArrayList<>();
        int cancel = sc.nextInt();
        for(int x:list){
            if(x%cancel!=0){
                remaining.add(x);
            }
        }
        if(remaining.isEmpty()){
            System.out.println("-1");
        }
        else{
            for(int i=0;i<remaining.size();i++){
                System.out.println(remaining.get(i));
                if(i!=remaining.size()-1){
                    System.out.print(" ");
                }
            }
        }
    }
}
