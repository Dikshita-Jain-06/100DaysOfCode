// 12. Problem Statement 
// A university receives registration records from different departments. The same student may 
// register more than once due to repeated attempts. 
// Using a HashSet, determine whether the number of unique student IDs is greater than half 
// of the total number of registration records. 
// Print High Unique Registration if the condition is satisfied; otherwise print Low Unique 
// Registration. 

// Input Format 
// The first line contains an integer N. 
// The second line contains N student IDs. 

// Output Format 
// Print the appropriate message. 

// Code Constraints 
// 1 ≤ N ≤ 1000 
// 1 ≤ Student ID ≤ 1000000 

// Sample Input 
// 8 
// 101 102 103 101 104 105 106 102 

// Sample Output 
// High Unique Registration 
import java.util.*;
public class ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        if(n/2<set.size()){
            System.out.println("High Unique Registration");
        }
        else{
            System.out.println("Low Unique Registration");
        }
    }
}
