// 5. Problem Statement 
// A shopping application stores information about a product using a Java class. Each product 
// has a product ID, product price, and available quantity. 
// Create a class named Product containing these attributes and a method named 
// calculateValue() that returns the total inventory value: 
// Total Value = Price × Quantity 
// Create a Product object using the input values and display the calculated inventory value. 

// Input Format 
// The first line contains the product ID. 
// The second line contains the product price. 
// The third line contains the available quantity. 

// Output Format 
// Print the total inventory value rounded to two decimal places. 

// Code Constraints 
// 1 ≤ Product ID ≤ 100000 
// 0 < Price ≤ 1000000 
// 0 ≤ Quantity ≤ 100000

// Sample Input 
// 105 
// 1250.50 
// 8 

// Sample Output 
// 10004.00



import java.util.*;
class Product{
    int Id;
    Double price;
    int quantity;
    Product(int Id, Double price, int quantity){
        this.Id = Id;
        this.price = price;
        this.quantity = quantity;
    }
    Double calculateValue(){
        Double totalValue = (Double) price*quantity;
        return totalValue;
    }

}
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Id = sc.nextInt();
        Double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Product p = new Product(Id, price, quantity);
        System.out.printf("%.2f",p.calculateValue());
    }
}
