// 35. Problem Statement  
// An employee management system searches for an employee name using an employee ID. If 
// the employee exists, the system should display the employee name. If the ID is not found, it 
// should display Employee Not Found. 
// Write a Java program using Optional to safely handle the possibility of a missing employee 
// without directly checking for a null value. 

// Input Format 
// The first line contains the number of employees. 
// The next N lines contain employee ID and employee name. 
// The last line contains the ID to search. 

// Output Format 
// Print the employee name if the ID exists. Otherwise, print Employee Not Found.

// Code Constraints 
// 1 ≤ N ≤ 100 
// 1 ≤ Employee ID ≤ 100000 

// Sample Input 
// 3 
// 101 Amit 
// 102 Neha 
// 103 Rahul 
// 102 

// Sample Output 
// Neha 
import java.util.*;
public class ques35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int id = sc.nextInt();
            String name = sc.next();
            map.put(id,name);
        }
        int searchId = sc.nextInt();
        Optional<String> result = Optional.ofNullable(map.get(searchId));
        if(result.isPresent()){
            System.out.println(result.get());
        }
        else{
            System.out.println("Employee not Found");
        }

    }
}
