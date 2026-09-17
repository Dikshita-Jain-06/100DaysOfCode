// 36. Problem Statement  
// A university examination system stores the examination date and needs to determine the 
// number of days remaining until another specified date. 
// Write a Java program using the Java Date-Time API to calculate the number of days between 
// two given dates. 

// Input Format 
// The first line contains the starting date in the format YYYY-MM-DD. 
// The second line contains the ending date in the format YYYY-MM-DD. 

// Output Format 
// Print the number of days between the two dates. 

// Code Constraints 
// Both dates are valid dates. 
// The ending date is not earlier than the starting date. 

// Sample Input 
// 2026-09-01 
// 2026-09-15 

// Sample Output 
// 14

import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class ques36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String starting = sc.next();
        String ending = sc.next();
        LocalDate start = LocalDate.parse(starting);
        LocalDate end = LocalDate.parse(ending);
        long days = ChronoUnit.DAYS.between(start,end);
        System.out.println(days);

    }
}
