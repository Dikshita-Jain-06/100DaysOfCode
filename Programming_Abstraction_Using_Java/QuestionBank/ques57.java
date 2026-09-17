// 57. Problem Statement  
// An online examination system maintains a shared counter representing the number of 
// submitted answers. Multiple student threads may submit answers at the same time. 
// Write a Java program using a synchronized method to ensure that every submission is 
// counted correctly. 

// Input Format 
// The first line contains the number of submissions from the first group of students. 
// The second line contains the number of submissions from the second group. 
// Output Format 
// Print: 
// Total Submissions: <number>

// Code Constraints 
// 0 ≤ N ≤ 100000 

// Sample Input 
// 2500 
// 3500 

// Sample Output 
// Total Submissions: 6000

import java.util.*;
class Counter{
    int count;
    synchronized void submit(){
        count++;
    }
}
public class ques57 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Counter counting = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=0;i<n1;i++){
                counting.submit();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<n2;i++){
                counting.submit();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counting.count);
    }
}
