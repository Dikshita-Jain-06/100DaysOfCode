// package Programming_Abstraction_Using_Java.short_5_Marks;

// Problem Statement
// Write a Java program that simulates a print job queue using a LinkedList as a Queue (FIFO). Support ADD (enqueue a job), PROCESS (dequeue and process the oldest job), and SIZE (report current queue size) operations.

// Input Format
// The first line contains an integer N, the number of operations.
// Each of the next N lines contains one operation: "ADD name", "PROCESS", or "SIZE".

// Output Format
// For ADD, print nothing.
// For PROCESS, print "Processed: name" if a job existed, otherwise print "No Jobs".
// For SIZE, print "Size: count".

// Code Constraints
// 1 ≤ N ≤ 1000
// job names contain no spaces


import java.util.*;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> queue = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String operation = sc.next();
            if(operation.equals("ADD")){
                String name = sc.next();
                queue.addLast(name);
            }
            else if(operation.equals("PROCESS")){
                if(queue.isEmpty()){
                    System.out.println("No jobs");
                }
                else{
                    String name = queue.removeFirst();
                    System.out.println("Processed: "+name);
                }
            }
            else if(operation.equals("SIZE")){
                System.out.println("Size: "+queue.size());
            }

        }
        sc.close();
    }
}
