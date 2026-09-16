// 22. Problem Statement 
// An online store maintains product prices. The store wants to apply a category-based 
// transformation to its prices using the Stream API. 
// For every price: 
// • If the price is at least 1000, apply a 15% discount.  
// • Otherwise, apply a 5% discount.  
// Use Stream API mapping operations to generate the final prices and display them rounded 
// to the nearest integer. 

// Input Format 
// The first line contains N. 
// The second line contains N integer prices. 

// Output Format 
// Print the updated prices separated by a single space. 

// Code Constraints 
// 1 ≤ N ≤ 100 
// 100 ≤ Price ≤ 100000 

// Sample Input 
// 6 
// 500 1200 800 2000 1500 900 
// Sample Output 
// 475 1020 760 1700 1275 855 
import java.util.*;
public class ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        list.stream().map(x->{
                        if(x>=1000){
                            return Math.round(x*0.85);
                        }
                        else{
                            return Math.round(x*0.95);
                        }
        })
        .forEach(x->System.out.print(x+" "));
    }
}
