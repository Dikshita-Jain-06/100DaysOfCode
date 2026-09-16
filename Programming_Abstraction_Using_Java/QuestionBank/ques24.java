// 24. Problem Statement 
// A data analytics system receives N integer values. The system needs to calculate the sum of 
// the squares of only the even values. 
// Using the Stream API, filter the even numbers, transform each value into its square, and use 
// a reduction operation to calculate the final sum.

// Input Format 
// The first line contains N. 
// The second line contains N integers.

// Output Format 
// Print the sum of squares of all even values. 

// Code Constraints 
// 1 ≤ N ≤ 100 
// −1000 ≤ Value ≤ 1000 

// Sample Input 
// 6 
// 3 4 6 5 8 7 

// Sample Output 
// 116 

import java.util.*;
public class ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int sum = list.stream().filter(x->x%2==0).map(x->x*x).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
