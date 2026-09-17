// 42. Problem Statement  
// A competitive-programming system receives a large number of integer values. The program 
// must efficiently read all values and calculate their sum. 
// Write a Java program using buffered input to efficiently read N integers and calculate their 
// sum. 

// Input Format 
// The first line contains N. 
// The second line contains N integers separated by spaces. 

// Output Format 
// Print the sum of all integers.

// Code Constraints 
// 1 ≤ N ≤ 100000 
// 0 ≤ Value ≤ 100000 

// Sample Input 
// 5 
// 10 20 30 40 50 

// Sample Output 
// 150
import java.util.*;
import java.io.*;
public class ques42 {
    public static void main(String[] args) {
        String file = "input.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        int n = Integer.parseInt(br.readLine());
        String[] values = br.readLine().split(" ");
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=Integer.parseInt(values[i]);
        }
        System.out.println(sum);
        br.close();
    }
}
