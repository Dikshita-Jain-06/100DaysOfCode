// 2. Problem Statement 
// A manufacturing system records the number of products produced during N shifts. To 
// identify production performance, the system calculates the total production, average 
// production, and the difference between the highest and lowest production values. 
// Write a Java program to read the production values into an integer array and calculate these 
// three values. The average production should be displayed as a decimal value rounded to two 
// decimal places. 

// Input Format 
// The first line contains an integer N. 
// The second line contains N space-separated integers representing production quantities. 

// Output Format 
// Print the total production on the first line. 
// Print the average production on the second line. 
// Print the difference between the maximum and minimum production on the third line. 

// Code Constraints 
// 1 ≤ N ≤ 1000 
// 0 ≤ Production Quantity ≤ 100000
import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            total+=arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        double average = (double) total/n;
        System.out.println(total);
        System.out.printf("%.2f\n",average);
        System.out.println(max-min);
    }
}
