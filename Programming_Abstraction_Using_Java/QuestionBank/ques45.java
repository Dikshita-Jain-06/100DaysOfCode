// 45. Problem Statement  
// A parking-management system calculates the parking fee based on the number of hours a 
// vehicle stays in the parking area. 
// The fee rules are: 
// 0 hours → 0 
// 1 to 2 hours → 20 per hour 
// More than 2 hours → 40 per hour 
// Write a Java program that correctly handles normal cases as well as the edge cases of zero 
// hours and exactly two hours. 

// Input Format 
// The first line contains the number of parking hours.

// Output Format 
// Print the parking fee. 

// Code Constraints 
// 0 ≤ Hours ≤ 100 

// Sample Input 
// 2 

// Sample Output 
// 40

import java.util.*;
public class ques45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total=0;
        if(n==0) total=0;
        else if(n<=2){
            total=n*20;
        }
        else total=n*40;
        System.out.println(total);
    }
}
