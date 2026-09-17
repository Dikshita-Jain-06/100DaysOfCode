// 48. Problem Statement 
// A warehouse system evaluates product quantities using different rules. One rule determines 
// whether a product quantity is greater than 50, while another calculates the quantity after 
// adding a safety stock of 10 units. 
// Write a Java program that uses functional interfaces and passes functions to separate 
// methods to perform these operations. 

// Input Format 
// The first line contains N. 
// The second line contains N product quantities. 

// Output Format 
// First print the number of products having quantity greater than 50. 
// On the second line, print the updated quantities after adding 10. 

// Code Constraints 
// 1 ≤ N ≤ 100 
// 0 ≤ Quantity ≤ 1000 

// Sample Input 
// 5 
// 20 60 45 80 100 

// Sample Output 
// 3 
// 30 70 55 90 110


import java.util.*;
public class ques48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int count=0;
        for(int x:list){
            if(x>50) count++;
        }
        System.out.println(count);
        for(int x:list){
            System.out.print(x+10+" ");
        }
    }

}
