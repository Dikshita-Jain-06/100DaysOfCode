package Programming_Abstraction_Using_Java.short_5_Marks;
// package PA;

// Problem Statement
// Given N students (name, grade), write a Java program using Lambda Expressions and Comparator.thenComparing to sort the students by grade in descending order; if two students have the same grade, break the tie by name in ascending order.

// Input Format
// The first line contains an integer N.
// Each of the next N lines contains a name (no spaces) and an integer grade, separated by a space.

// Output Format
// Print the sorted list, one student per line, in the format:
// name grade

// Code Constraints
// 1 ≤ N ≤ 100
// 0 ≤ grade ≤ 100

import java.util.*;
class Student{
    String name;
    int grade;
    Student(String name,int grade){
        this.name = name;
        this.grade = grade;
    }
}
public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.next();
            int grade = sc.nextInt();
            Student s = new Student(name,grade);
            list.add(s);
        }
        list.sort(Comparator.comparing((Student s) -> s.grade).reversed().thenComparing(s->s.name));
        for(Student s: list){
            System.out.println(s.name+" "+s.grade);
        }
        sc.close();
    }
}
