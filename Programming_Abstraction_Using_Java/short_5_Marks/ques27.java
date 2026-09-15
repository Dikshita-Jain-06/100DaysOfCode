package Programming_Abstraction_Using_Java.short_5_Marks;

// Problem Statement
// Write a Java program that uses multithreading to compute the sum of N integers. Split the array into two halves, create two threads (using Runnable) where each thread computes the sum of one half, wait for both threads to finish using join(), and then print the combined total.
// Input Format
// The first line contains an integer N.
// The second line contains N space-separated integers.
// Output Format
// Print the total sum computed by the two threads in the following format:
// Total: value
// Code Constraints
// 1 ≤ N ≤ 1000
// -1000 ≤ Each integer ≤ 1000


import java.util.*;
public class ques27 {
    static int sum1 = 0;
    static int sum2 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int mid = n/2;
        Thread t1 = new Thread(()->{
            for(int i=0;i<mid;i++){
                sum1+=arr[i];
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=mid;i<n;i++){
                sum2+=arr[i];
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Total:"+(sum1+sum2));

    }
}
