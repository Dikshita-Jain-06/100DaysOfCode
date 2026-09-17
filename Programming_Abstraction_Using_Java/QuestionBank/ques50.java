// 50. Problem Statement  
// A food-delivery application processes customer orders in a separate thread. Each order has 
// an order ID, and the application must create a thread by extending the Thread class. 
// Write a Java program that creates a class extending Thread. The thread should process the 
// given order and print its order ID. 

// Input Format 
// The first line contains the order ID. 

// Output Format 
// Print: 
// Order <ID> Processing 
// Code Constraints 
// 1 ≤ Order ID ≤ 100000 

// Sample Input 
// 105 

// Sample Output 
// Order 105 Processing
import java.util.*;
class OrderThread extends Thread{
    int orderId;
    OrderThread(int orderId){
        this.orderId = orderId;
    }
    public void run(){
        System.out.println("Order " + orderId+ " Processing");
    }
}
public class ques50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orderId = sc.nextInt();
        OrderThread t = new OrderThread(orderId);
        t.start();
    }
}
