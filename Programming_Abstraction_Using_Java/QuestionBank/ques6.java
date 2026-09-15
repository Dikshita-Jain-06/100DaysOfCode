// 6. Problem Statement 
// A data processing system receives N integer values. The system needs to rearrange the array 
// so that all even numbers appear first, followed by all odd numbers, while preserving their 
// original order within each group. 
// Write a Java program to perform this rearrangement without using another array. 

// Input Format 
// The first line contains an integer N. 
// The second line contains N space-separated integers. 

// Output Format 
// Print all even values followed by all odd values, separated by a single space. 

// Code Constraints 
// 1 ≤ N ≤ 1000 
// −10000 ≤ Value ≤ 10000

// Sample Input 
// 8 
// 7 4 9 2 6 11 8 5 

// Sample Output 
// 4 2 6 8 7 9 11 5

import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int evenIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                int temp = arr[i];
                
            }
        }
    }
}
