// 15. Problem Statement 
// A service center assigns a priority number to each service request. A smaller number 
// represents a higher priority. However, requests having the same priority must also be 
// processed. 
// Using a PriorityQueue, process all requests and calculate the sum of the first K priorities that 
// are processed. 

// Input Format 
// The first line contains N. 
// The second line contains N priority numbers. 
// The third line contains K. 

// Output Format 
// Print the sum of the first K priorities removed from the PriorityQueue. 

// Code Constraints 
// 1 ≤ K ≤ N ≤ 1000 
// 1 ≤ Priority ≤ 100000 

// Sample Input 
// 7 
// 18 5 12 30 9 25 3 
// 3 

// Sample Output 
// 17 
import java.util.*;
public class ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
        }
        int k = sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=pq.poll();
        }
        System.out.println(sum);
    }
}
