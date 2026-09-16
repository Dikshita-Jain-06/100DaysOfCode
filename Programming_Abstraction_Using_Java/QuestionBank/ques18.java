// 18. Problem Statement 
// An online examination system accepts a student's score only when it is between 0 and 100. 
// Create a custom exception named InvalidScoreException. 
// Create a method validateScore(int score) that throws the custom exception when the score 
// is outside the valid range. 
// Write a Java program to validate the entered score and handle the exception. 

// Input Format 
// The input consists of a single integer representing the score. 

// Output Format 
// Print the score if it is valid. 
// Otherwise print: 
// Invalid Score

// Code Constraints 
// −100 ≤ Score ≤ 150 

// Sample Input 
// 85 

// Sample Output 
// 85


import java.util.*;
class InvalidScoreException extends Exception{
    InvalidScoreException(String message){
        super(message);
    }
}
public class ques18 {
    static void validateScore(int score) throws InvalidScoreException{
        if(score<0 || score>100){
            throw new InvalidScoreException("Invalid Score");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        try{
            validateScore(marks);
            System.out.println(marks);
        }
        catch(InvalidScoreException e){
            System.out.println(e.getMessage());
        }
    }
}
