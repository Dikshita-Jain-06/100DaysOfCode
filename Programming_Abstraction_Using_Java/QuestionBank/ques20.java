// 20. Problem Statement 
// A delivery company records the distances travelled by its vehicles. Some distances may be 
// repeated because multiple vehicles travel the same distance. 
// Using the Stream API, remove duplicate distances, sort the remaining distances in 
// descending order, and display the top three distinct distances. If fewer than three distinct 
// distances exist, display all available distinct distances. 

// Input Format 
// The first line contains N. 
// The second line contains N space-separated distances. 

// Output Format 
// Print the top three distinct distances in descending order. 

// Code Constraints 
// 1 ≤ N ≤ 1000 
// 1 ≤ Distance ≤ 100000 

// Sample Input 
// 8 
// 120 450 300 450 700 120 550 700 

// Sample Output 
// 700 550 450
import java.util.*;
public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        list.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .limit(3)
            .forEach(x->System.out.print(x+" "));
    }
}
