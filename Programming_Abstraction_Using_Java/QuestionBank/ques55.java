// 55. Problem Statement  
// A manufacturing system has two shared resources required by two processing threads. If the 
// threads acquire the resources in different orders, they may wait indefinitely for each other, 
// resulting in a deadlock. 
// Write a Java program that uses two shared resources and ensures that both threads acquire 
// the resources in the same order. This prevents deadlock and allows both operations to 
// complete successfully. 

// Input Format 
// The first line contains the number of units processed by Thread 1. 
// The second line contains the number of units processed by Thread 2. 

// Output Format 
// Print: 
// Thread 1 Completed 
// Thread 2 Completed 
// Production Completed 

// Code Constraints 
// 1 ≤ N ≤ 1000 

// Sample Input 
// 10 
// 20 

// Sample Output 
// Thread 1 Completed 
// Thread 2 Completed 
// Production Completed

import java.util.*;
class Production{
    private final Object resource1 = new Object();
    private final Object resource2 = new Object();
    void process(int units,int threadnumber){
        synchronized(resource1){
            synchronized(resource2){
                for(int i=0;i<units;i++){

                }
                System.out.println("Thread "+ threadnumber+ " Completed" )
            }
        }
    }
}
public class ques55 {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int units1 = sc.nextInt();
        int units2 = sc.nextInt();

        Production production = new Production();

        Thread t1 = new Thread(() -> {
            production.process(units1, 1);
        });

        Thread t2 = new Thread(() -> {
            production.process(units2, 2);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Production Completed");
    }
}
