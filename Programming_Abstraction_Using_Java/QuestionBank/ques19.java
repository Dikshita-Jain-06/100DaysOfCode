// 19. Problem Statement 
// An examination portal stores marks obtained by students. The faculty wants to identify the 
// marks that are above the class average. 
// Using the Stream API, calculate the average marks and then display only the marks strictly 
// greater than the average, preserving their original order. 
// If no mark is greater than the average, print -1. 

// Input Format 
// The first line contains N. 
// The second line contains N space-separated marks. 

// Output Format 
// Print the qualifying marks separated by a single space. 

// Code Constraints 
// 1 ≤ N ≤ 100 
// 0 ≤ Marks ≤ 100 

// Sample Input 
// 6 
// 40 55 70 80 65 50 

// Sample Output 
// 70 80 65
import java.util.*;
import java.util.stream.*;
public class ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        double average = list.stream().mapToInt(x->x).average().orElse(0);
        List<Integer> result = list.stream().filter(x->x>average).collect(Collectors.toList());
        if(result.isEmpty()){
            System.out.println("-1");
        }
        else{
            for(int x: result){
                System.out.println(x+" ");
            }
        }
    }
}
