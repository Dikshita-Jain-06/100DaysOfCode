// 37. Problem Statement  
// A Java application creates several local integer variables inside a method. The program must 
// demonstrate the difference between local variables and dynamically created objects. 
// Write a Java program containing a method that creates local primitive variables and an 
// integer array using the new keyword. Print the values of the variables and array elements. 
// The objective is to demonstrate that local variables are associated with method execution 
// while dynamically created objects are stored in heap memory. 

// Input Format 
// The first line contains three integers. 
// The second line contains three integers for the array. 

// Output Format 
// Print the three local values on the first line and the three array values on the second line. 

// Code Constraints 
// −10000 ≤ Value ≤ 10000 

// Sample Input 
// 10 20 30 
// 40 50 60 

// Sample Output 
// 10 20 30 
// 40 50 60

import java.util.*;
public class ques37 {
    static void display(int a, int b, int c,int[] arr){
        int x = a;
        int y = b;
        int z = c;
        System.out.println(x+" "+y+" "+z);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        display(a,b,c,arr);
    }
}
