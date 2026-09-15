
// 1. Problem Statement 
// A financial application calculates the final amount payable by a customer after applying a 
// discount and a service charge. The application receives the original amount as an integer 
// and the discount and service charge as decimal percentages. 
// The final amount is calculated as: 
// Final Amount = Original Amount − Discount + Service Charge 
// where: 
// Discount = Original Amount × Discount Percentage / 100 
// Service Charge = Amount after Discount × Service Charge Percentage / 100 
// Write a Java program to calculate and display the final amount rounded to two decimal 
// places. The program should use appropriate primitive data types to avoid loss of decimal 
// precision during the calculation. 
// Input Format 
// The first line contains an integer representing the original amount. 
// The second line contains a decimal value representing the discount percentage. 
// The third line contains a decimal value representing the service charge percentage. 
// Output Format 
// Print the final amount rounded to two decimal places. 
// Code Constraints 
// 1 ≤ Original Amount ≤ 1000000 

import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int org = sc.nextInt();
        Double  discountper = sc.nextDouble();
        Double serviceper = sc.nextDouble();
        Double discount = org*discountper/100;
        Double service = (org-discount)*serviceper/100;
        Double finalAmt = org-discount+service;
        System.out.printf("%.2f",finalAmt);
    }
}

