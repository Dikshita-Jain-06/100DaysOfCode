// package Programming_Abstraction_Using_Java.short_5_Marks;

// Problem Statement
// Write a Java program that demonstrates Multithreading with synchronization. Two threads must each increment a shared counter N times using a synchronized method to prevent race conditions. After both threads finish (using join), print the final counter value.

// Input Format
// The input consists of a single integer N, the number of increments each thread performs.

// Output Format
// Print the final counter value in the format:
// Final Counter: value


import java.util.*;
class Counter{
    int count = 0;
    synchronized void increment(){
        count++;
    }
}
public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Counter counter = new Counter();
        // Thread t1 = new Thread(()->{
        //     for(int i=0;i<n;i++){
        //         counter.increment();
        //     }
        // });
        // Thread t2 = new Thread(()->{
        //     for(int i=0;i<n;i++){
        //         counter.increment();
        //     }
        // });
        Runnable task = ()->{
            for(int i=0;i<n;i++){
                counter.increment();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final counter: "+counter);
        sc.close();
    }
}
