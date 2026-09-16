// 33. Problem Statement  
// A delivery company assigns a priority score to packages based on their weight. A package 
// receives a priority score equal to its weight multiplied by 2 and increased by 10. 
// Write a Java program using a Lambda Expression to calculate the priority score of every 
// package. 

// Input Format 
// The first line contains the number of packages. 
// The second line contains the package weights separated by spaces. 

// Output Format 
// Print the priority score of each package separated by spaces. 

// Code Constraints 
// 1 ≤ N ≤ 100 
// 1 ≤ Weight ≤ 1000 

// Sample Input 
// 3 
// 10 25 40 

// Sample Output 
// 30 60 90 
import java.util.*;
public class ques33 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        list.stream().map(x->x*2+10).forEach(x->System.out.print(x+" "));
   }
    
}
