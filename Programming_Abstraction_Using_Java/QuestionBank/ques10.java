// 10. Problem Statement 
// A logistics system maintains container IDs using a Vector. A new container is inserted after a 
// specified existing container ID. 
// Write a Java program to search for the specified container ID in the Vector. If the ID is found, 
// insert the new container ID immediately after it. If the ID is not found, print Container Not 
// Found. 

// Input Format 
// The first line contains an integer N. 
// The second line contains N space-separated container IDs. 
// The third line contains the existing container ID. 
// The fourth line contains the new container ID. 

// Output Format 
// Print the updated Vector if the existing ID is found. 
// Otherwise, print Container Not Found. 

// Code Constraints 
// 1 ≤ N ≤ 1000 
// 1 ≤ Container ID ≤ 1000000 

// Sample Input 
// 5 
// 201 305 410 512 620 
// 410 
// 999 

// Sample Output 
// 201 305 410 999 512 620 
import java.util.*;
public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> v = new Vector<>();
        for(int i=0;i<n;i++){
            v.add(sc.nextInt());
        }
        int existing = sc.nextInt();
        int newId = sc.nextInt();
        int index = v.indexOf(existing);
        if(index==-1){
            System.out.println("Container not found");
        }
        else{
            v.add(index+1,newId);
            System.out.println(v);
        }
    }
}
