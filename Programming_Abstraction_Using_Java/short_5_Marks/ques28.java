package Programming_Abstraction_Using_Java.short_5_Marks;
// Problem Statement
// Given N integers, write a Java program using the Stream API and Optional to find the maximum value safely. If the list is not empty, print the maximum in the format Max: value. Use Optional with reduce and orElse so the program never fails on missing values.
// Input Format
// The first line contains an integer N.
// The second line contains N space-separated integers.
// Output Format
// Print the maximum value in the following format:
// Max: value
// Code Constraints
// 1 ≤ N ≤ 100
// -100000 ≤ Each integer ≤ 100000


import java.util.*;
import java.util.stream.*;
public class ques28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Optional<Integer> max = list.stream().reduce(Integer::max);
        System.out.println("MAX: "+max.orElse(0));
        sc.close();
    }
}
