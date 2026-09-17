// 41. Problem Statement  
// A data-analysis application receives a large number of integers. To reduce unnecessary 
// output operations, the application must first calculate all results and then print them 
// together. 
// Write a Java program that reads N integers, calculates the square of every integer, stores the 
// results in a StringBuilder, and prints all results at once. 
// Input Format 
// The first line contains N. 
// The second line contains N integers. 
// Output Format 
// Print the squares separated by spaces. 
// Code Constraints 
// 1 ≤ N ≤ 100000 
// −1000 ≤ Value ≤ 1000 
// Sample Input 
// 5 
// 2 3 4 5 6 
// Sample Output 
// 4 9 16 25 36 

import java.util.*;
public class ques41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            sb.append(num*num);
            if(i!=n-1){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
