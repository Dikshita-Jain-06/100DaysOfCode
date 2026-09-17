// 54. Problem Statement  
// A website maintains a shared visitor counter. Two threads represent two groups of visitors, 
// and each thread increments the same counter. 
// Without proper synchronization, simultaneous updates can cause a race condition and 
// produce an incorrect count. 
// Write a Java program that safely updates the shared counter using synchronization so that 
// every visitor is counted. 

// Input Format 
// The first line contains the number of visitors handled by the first thread. 
// The second line contains the number of visitors handled by the second thread. 

// Output Format 
// Print: 
// Total Visitors: <number> 

// Code Constraints 
// 0 ≤ N ≤ 100000 

// Sample Input 
// 5000 
// 7000 

// Sample Output 
// Total Visitors: 12000 

import java.util.*;
class Counter{
    int total;
    synchronized void increment(){
        total++;
    }
}
public class ques54 {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Counter count = new Counter();
        Thread t1 = new Thread(()-> {
            for(int i=0;i<n1;i++){
                count.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<n2;i++){
                count.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.total);
    }
}
