// 32. Problem Statement  
// A smart electricity monitoring system receives the power consumption of several devices. 
// The system needs to process the readings using a functional programming approach. 
// For every reading, calculate the adjusted consumption using: 
// Adjusted Consumption = Reading × 1.10 
// Write a Java program that stores the readings in a list and uses a functional approach to 
// process each reading and display the adjusted consumption rounded to two decimal places. 

// Input Format 
// The first line contains the number of devices. 
// The second line contains the power consumption readings separated by spaces. 

// Output Format 
// Print the adjusted consumption of each device separated by a space, with each value 
// displayed up to two decimal places. 

// Code Constraints 
// 1 ≤ N ≤ 100 
// 0 ≤ Reading ≤ 10000 

// Sample Input 
// 4 
// 100 200 300 400 

// Sample Output 
// 110.00 220.00 330.00 440.00 
import java.util.*;
public class ques32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            double result = (double)x*1.10;
            list.add(result);
        }
        for(double m:list){
            System.out.printf("%.2f",m);
            System.out.print(" ");
        }
    }
}


//m2
// import java.util.*;

// public class ques32 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         ArrayList<Double> list = new ArrayList<>();

//         for(int i = 0; i < n; i++) {
//             list.add(sc.nextDouble());
//         }

//         list.forEach(x -> System.out.printf("%.2f ", x * 1.10));
//     }
// }
