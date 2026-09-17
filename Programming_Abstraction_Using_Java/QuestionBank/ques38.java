// 38. Problem Statement  
// A student-result application uses a method to calculate the total marks of a student. The 
// method receives three marks and creates an integer array containing the marks. 
// Write a Java program that uses a separate method to calculate and print the total marks. The 
// program should demonstrate method-local variables and an array object created during 
// execution. 

// Input Format 
// The first line contains three subject marks. 

// Output Format 
// Print the total marks. 

// Code Constraints 
// 0 ≤ Marks ≤ 100 

// Sample Input 
// 75 82 90 

// Sample Output 
// 247
import java.util.*;
public class ques38 {
    static void total(int a,int b,int c){
        int[] marks = new int[3];
        marks[0]=a;
        marks[1]=b;
        marks[2]=c;
        int sum = marks[0]+marks[1]+marks[2];
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        total(a,b,c);
    }
}
