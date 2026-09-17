// 40. Problem Statement  
// A payroll application calculates the salary of an employee using a simple arithmetic 
// expression. Java source code is compiled into bytecode, which is executed by the JVM. 
// Write a Java program that reads the basic salary, allowance, and deduction and calculates 
// the final salary. 
// Final Salary = Basic Salary + Allowance − Deduction 

// Input Format 
// The first line contains the basic salary. 
// The second line contains the allowance. 
// The third line contains the deduction. 

// Output Format 
// Print the final salary.

// Code Constraints 
// 0 ≤ Basic Salary ≤ 1000000 
// 0 ≤ Allowance ≤ 500000 
// 0 ≤ Deduction ≤ 500000 

// Sample Input 
// 30000 
// 5000 
// 2000 

// Sample Output 
// 33000 
import java.util.*;
public class ques40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basicSalary = sc.nextInt();
        int allowance = sc.nextInt();
        int deduction = sc.nextInt();
        int finalSalary = basicSalary+allowance+deduction;
        System.out.println(finalSalary);


    }
}
