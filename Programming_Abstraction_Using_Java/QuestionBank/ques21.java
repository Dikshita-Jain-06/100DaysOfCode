// 21. Problem Statement 
// A company's payroll system stores the salaries of its employees. The management wants to 
// calculate the total salary of employees whose salary is greater than a specified threshold. 
// Using the Stream API, filter the qualifying salaries and use a reduction operation to calculate 
// their total. 

// Input Format 
// The first line contains N. 
// The second line contains N salary values. 
// The third line contains the salary threshold. 

// Output Format 
// Print the total salary of all employees whose salary is strictly greater than the threshold. 

// Code Constraints 
// 1 ≤ N ≤ 1000 
// 10000 ≤ Salary ≤ 1000000 
// 10000 ≤ Threshold ≤ 1000000 

// Sample Input 
// 6 
// 35000 52000 48000 75000 42000 90000 
// 50000 

// Sample Output 
// 217000 


import java.util.*;
public class ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int threshold = sc.nextInt();
        int total = list.stream().filter(x->x>threshold).reduce(0,(a,b)->a+b);
        System.out.println(total);

    }
}
