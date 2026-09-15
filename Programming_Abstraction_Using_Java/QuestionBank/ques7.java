// 7. Problem Statement 
// A text-processing application receives a sentence and needs to determine whether the 
// sentence is a palindrome after ignoring spaces and differences between uppercase and 
// lowercase letters. 
// For example, "Never Odd Or Even" should be considered a palindrome. 
// Write a Java program to perform the required string processing and print Palindrome if the 
// sentence satisfies the condition; otherwise print Not Palindrome. 

// Input Format 
// The input consists of a single line containing a sentence. 

// Output Format 
// Print Palindrome or Not Palindrome. 

// Code Constraints 
// 1 ≤ Length of sentence ≤ 200 
// The sentence may contain uppercase letters, lowercase letters, and spaces.

// Sample Input 
// Never Odd Or Even 

// Sample Output 
// Palindrome 
import java.util.*;
public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace(" ","").toLowerCase();
        int left=0;
        int right=s.length()-1;
        boolean palindrome = true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(palindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
