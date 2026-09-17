// 56. Problem Statement  
// A communication system has two threads that need to send messages through a shared 
// communication channel. The threads repeatedly give way to each other instead of 
// proceeding, which can result in a livelock. 
// Write a Java program that simulates a limited number of retry attempts. After the specified 
// number of attempts, the communication should proceed successfully. 

// Input Format 
// The first line contains the maximum number of retry attempts. 

// Output Format 
// Print: 
// Communication Started 
// For every unsuccessful retry, print: 
// Retrying 
// When communication succeeds, print: 
// Message Sent Successfully 
// Communication Completed 

// Code Constraints 
// 1 ≤ Attempts ≤ 10 

// Sample Input 
// 3 

// Sample Output 
// Communication Started 
// Retrying 
// Retrying 
// Message Sent Successfully 
// Communication Completed

import java.util.*;
public class ques56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = sc.nextInt();
        System.out.println("Communication Started");
        for(int i=1;i<=attemps;i++){
            if(i<attempts){
                System.out.println("Retrying");
            }
            else{
                System.out.println("Message Sent Successfully.");
            }
        }
    System.out.println("Communication Completed");
    }
}
