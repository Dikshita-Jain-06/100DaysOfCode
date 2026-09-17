// 53. Problem Statement  
// A movie-ticket booking system maintains a shared number of available tickets. Two booking 
// threads attempt to reserve tickets simultaneously. 
// Write a Java program that uses a synchronized block to protect the critical section where 
// tickets are booked. 
// Each successful booking decreases the available ticket count by one. If there are not enough 
// tickets, no additional tickets should be booked. 

// Input Format 
// The first line contains the initial number of tickets. 
// The second line contains the number of booking requests. 

// Output Format 
// Print: 
// Tickets Remaining: <number>

// Code Constraints 
// 0 ≤ Tickets ≤ 10000 
// 0 ≤ Requests ≤ 10000 

// Sample Input 
// 10 
// 6 

// Sample Output 
// Tickets Remaining: 4
import java.util.*;
class Ticketcount{
    int total;
    Ticketcount(int total){
        this.total = total;
    }
    void tickets(int book){
        synchronized(this){
            if(total>0){
                total--;
            }
        }
    }
}

public class ques53 {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int init = sc.nextInt();
        int req = sc.nextInt();
        Ticketcount count = new Ticketcount(init);
        Thread t1 = new Thread(()->{
            for(int i=0;i<req-req/2;i++){
                count.tickets(1);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<req-req/2;i++){
                count.tickets(1);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Tickets Remaining: "+count.total);
    }
}
