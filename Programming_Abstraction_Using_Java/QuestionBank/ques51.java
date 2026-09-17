// 51. Problem Statement  
// A hospital monitoring system receives heart-rate readings from a patient-monitoring device. 
// The readings must be processed by a separate thread created using the Runnable interface. 
// Write a Java program that implements Runnable and creates a thread to display each heart
// rate reading. 

// Input Format 
// The first line contains the number of readings. 
// The second line contains N heart-rate readings separated by spaces. 

// Output Format 
// For every reading, print: 
// Monitoring: <reading> 
// Each reading should be printed on a separate line. 

// Code Constraints 
// 1 ≤ N ≤ 100 
// 40 ≤ Reading ≤ 200
 
// Sample Input 
// 3 
// 72 80 76 

// Sample Output 
// Monitoring: 72 
// Monitoring: 80 
// Monitoring: 76 
import java.util.*;
class HeartRateMonitoring implements Runnable{
    int[] readings;
    HeartRateMonitoring(int[] readings){
        this.readings = readings;
    }
    public void run(){
        for(int reading:readings){
            System.out.println("Monitoring: "+reading);
        }
    }
}
public class ques51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HeartRateMonitoring monitor = new HeartRateMonitoring(arr);
        Thread t = new Thread(monitor);
        t.start();
    }
}
