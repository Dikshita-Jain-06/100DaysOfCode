// 23. Problem Statement 
// A university maintains student marks and wants to prepare a summary using the Stream API. 
// Each mark must be classified into one of three categories: 
// • High → marks ≥ 75  
// • Medium → marks between 50 and 74  
// • Low → marks below 50  
// Use Collectors.groupingBy() to group the marks according to these categories and display 
// the number of students in each category. 

// Input Format 
// The first line contains N. 
// The second line contains N space-separated marks. 

// Output Format 
// Print: 
// High: count 
// Medium: count 
// Low: count 
// on separate lines. 

// Code Constraints 
// 1 ≤ N ≤ 1000 
// 0 ≤ Marks ≤ 100 

// Sample Input 
// 8 
// 82 45 67 91 38 75 54 49 

// Sample Output 
// High: 3 
// Medium: 2 
// Low: 3 
import java.util.*;
import java.util.stream.Collectors;
public class ques23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Map<String,Long> result = list.stream().collect(Collectors.groupingBy(x->{
                                                                                    if(x>=75) return "High";
                                                                                    else if(x>=50) return "Medium";
                                                                                    else return "Low";
        },
                                                Collectors.counting()

        ));
        System.out.println("High: " + result.getOrDefault("High", 0L));
        System.out.println("Medium: " + result.getOrDefault("Medium", 0L));
        System.out.println("Low: " + result.getOrDefault("Low", 0L));
    }
}
