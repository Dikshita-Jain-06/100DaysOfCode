// 8. Problem Statement 
// An examination system receives the marks of N students. A method named 
// calculateGrade(int marks) must be created to determine the grade of each student according 
// to the following rules: 
// 90–100 → A 
// 75–89 → B 
// 60–74 → C 
// 40–59 → D 
// Below 40 → F 

// Write a Java program that uses the method for every student's marks and displays the 
// corresponding grades in the same order. 

// Input Format 
// The first line contains an integer N. 
// The second line contains N space-separated marks. 

// Output Format 
// Print the grades separated by a single space. 

// Code Constraints 
// 1 ≤ N ≤ 100 
// 0 ≤ Marks ≤ 100 

// Sample Input 
// 6 
// 92 76 65 48 35 88 

// Sample Output 
// A B C D F B


import java.util.*;
public class ques8 {
    static char calculateGrade(int marks){
        if(marks>=90) return 'A';
        else if(marks>=75) return 'B';
        else if(marks>=60) return 'C';
        else if(marks>=40) return 'D';
        else return 'F';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int marks = sc.nextInt();
            System.out.print(calculateGrade(marks));
            if(i!=n-1){
                System.out.print(" ");
            }
        }
    }
}
