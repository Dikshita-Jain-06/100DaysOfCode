// 39. Problem Statement  
// A document-processing application creates temporary String objects while processing 
// documents. After the objects are no longer required, the application requests the JVM to 
// perform garbage collection. 
// Write a Java program that creates a specified number of temporary objects, removes their 
// references, requests garbage collection using the appropriate JVM method, and finally prints 
// Garbage Collection Requested. 

// Input Format 
// The first line contains the number of temporary objects. 

// Output Format 
// Print: 
// Garbage Collection Requested 

// Code Constraints 
// 1 ≤ N ≤ 10000 

// Sample Input 
// 100 

// Sample Output 
// Garbage Collection Requested
import java.util.*;
public class ques39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] temp = new String[n];
        for(int i=0;i<n;i++){
            temp[i] = new String("Temporary Object");
        }
        temp=null;
        System.gc();
        System.out.println("Garbage Collection Requested");
    }
}
