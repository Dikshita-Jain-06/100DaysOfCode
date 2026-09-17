// 34. Problem Statement  
// A quality-control system checks the temperature of machines. A machine is considered safe 
// when its temperature is between 20 and 80 degrees Celsius, inclusive. 
// Create a Java program using a functional interface to determine whether each machine 
// temperature is safe or unsafe. 

// Input Format 
// The first line contains the number of machines. 
// The second line contains the temperatures separated by spaces. 

// Output Format 
// Print Safe or Unsafe for each temperature, separated by spaces.

// Code Constraints 
// 1 ≤ N ≤ 100 
// −100 ≤ Temperature ≤ 200 

// Sample Input 
// 5 
// 25 80 90 15 50 

// Sample Output 
// Safe Safe Unsafe Unsafe Safe 
import java.util.*;
@FunctionalInterface
interface TemperatureCheck{
    boolean check(int temperature);
}
public class ques34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        TemperatureCheck check = temperature -> temperature>=20 && temperature<=80;
        list.forEach(temperature -> {
            if(check.check(temperature)){
                System.out.print("Safe");
            }
            else{
                System.out.print("Unsafe");
            }
        });
    }
}
