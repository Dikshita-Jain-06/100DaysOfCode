// 26. Problem Statement 
// A library management system stores information about the books borrowed by each 
// member. Currently, all borrowed book names are stored together in a single field, separated 
// by commas. 

// For example: 
// 201 Java,Python,DBMS 
// This creates multiple values in one field and therefore violates the requirements of First 
// Normal Form (1NF). 
// To normalize the data, develop a Java program that converts each member's record into 1NF 
// format, where each record contains exactly one member and one borrowed book. 
// The program should: 
// • Separate the comma-separated book list into individual book names. 
// • Generate a separate record for every book borrowed by a member. 
// • Preserve the original order of members. 
// • Preserve the original order of books for each member. 
// The resulting records should have the structure: 
// MemberID Book 

// Input Format 
// • The first line contains an integer N, representing the number of member records. 
// • Each of the next N lines contains: 
// o 
// o 
// Member ID 
// Comma-separated list of borrowed books. 

// Constraints 
// • 1 ≤ N ≤ 50 
// • 1 ≤ number of books per member ≤ 5 
// • Member ID is a positive integer. 
// • Book names contain only alphabets. 
// • There are no spaces around commas. 

// Output Format 
// Print each book as an individual record in the following format: 
// MemberID Book 
// Maintain the same order as provided in the input. 

// Sample Input 
// 3 
// 201 Java,Python,DBMS 
// 202 HTML,CSS 
// 203 JavaScript,React 

// Sample Output 
// 201 Java 
// 201 Python 
// 201 DBMS 
// 202 HTML 
// 202 CSS 
// 203 JavaScript 
// 203 React

import java.util.*;
public class ques26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int memberId = sc.nextInt();
            String books = sc.next();
            String[] words = books.split(",");
            for(String book:words){
                System.out.println(memberId+" "+book);
            }
        }
    }
}
