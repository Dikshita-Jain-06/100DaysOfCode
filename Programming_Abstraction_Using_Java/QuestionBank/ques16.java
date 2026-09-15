// 16. Problem Statement 
// A software application needs a reusable container capable of storing values of different data 
// types. Create a generic class named Box<T> that stores a value and provides a method 
// getValue() to retrieve it. 
// The program receives an integer and a decimal value. Create appropriate generic objects 
// and display both values. 

// Input Format 
// The first line contains an integer. 
// The second line contains a decimal value. 

// Output Format 
// Print the integer on the first line and the decimal value rounded to two decimal places on 
// the second line. 

// Sample Input 
// 250 
// 45.75 

// Sample Output 
// 250 
// 45.75 
import java.util.*;
class Box<T>{
    private T value;
    Box(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
public class ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double decimal = sc.nextDouble();
        Box<Integer> intBox = new Box<>(n);
        Box<Double> doubleBox = new Box<>(decimal);
        System.out.println(intBox.getValue());
        System.out.printf("%.2f",doubleBox.getValue());
    }
}
