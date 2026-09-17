// 52. Problem Statement  
// A bank account is accessed by two withdrawal requests running in separate threads. Both 
// requests operate on the same account balance. 
// Write a Java program using a synchronized withdrawal method so that only one thread can 
// modify the account balance at a time. 
// If sufficient balance is available, the amount should be withdrawn. Otherwise, print 
// Insufficient Balance.

// Input Format 
// The first line contains the initial account balance. 
// The second line contains the withdrawal amount requested by the first thread. 
// The third line contains the withdrawal amount requested by the second thread. 

// Output Format 
// If a withdrawal cannot be completed, print Insufficient Balance. 
// After both threads finish, print: 
// Final Balance: <balance> 

// Code Constraints 
// 0 ≤ Balance ≤ 1000000 
// 0 ≤ Withdrawal Amount ≤ 1000000 '

// Sample Input 
// 10000 
// 3000 
// 4000 

// Sample Output 
// Final Balance: 3000 
// 53. Problem Statement

import java.util.*;
class BankAccount{
    int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    synchronized void withdraw(int amount){
        if(amount<=balance){
            balance-=amount;
        }
        else System.out.println("Insufficient Balance");
    }
}
public class ques52 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int initBalance = sc.nextInt();
        int withdraw1 = sc.nextInt();
        int withdraw2 = sc.nextInt();
        BankAccount account = new BankAccount(initBalance);
        Thread t1 = new Thread(()->account.withdraw(withdraw1));
        Thread t2 = new Thread(()-> account.withdraw(withdraw2));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Balance: "+account.balance);
    }
}
