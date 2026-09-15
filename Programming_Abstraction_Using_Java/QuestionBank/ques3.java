// 3. Problem Statement 
// A digital security system receives a positive integer identification number. For verification, it 
// needs to calculate the sum of its even digits and the sum of its odd digits separately. 
// Write a Java program to process the number digit by digit using arithmetic and modulus 
// operations. Display the sum of even digits and the sum of odd digits. 

// Input Format 
// The input consists of a single positive integer N. 

// Output Format 
// Print the sum of even digits on the first line. 
// Print the sum of odd digits on the second line. 

// Code Constraints 
// 10 ≤ N ≤ 999999999 

// Sample Input 
// 583241 
// Sample Output 
// 6 
// 21 
import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even=0;
        while(n>0){
            int last = n%10;
            if(last%2==0){
                even+=last;
            }
            else odd+=last;
            n=n/10;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
