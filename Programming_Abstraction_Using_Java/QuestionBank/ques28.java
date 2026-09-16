
// 28. Problem Statement 
// A college administration system maintains student enrollment records containing student 
// and department information in the following structure: 
// StudentID StudentName DepartmentID DepartmentName 
// During database analysis, it is observed that the DepartmentName is determined by the 
// DepartmentID, rather than directly by the StudentID. Therefore, the dependencies can be 
// represented as: 
// StudentID → StudentName, DepartmentID 
// DepartmentID → DepartmentName 
// This creates a transitive dependency, which is addressed by Third Normal Form (3NF). 
// For this programming task, the college wants to generate a simplified student summary in 
// which duplicate student records are removed. 
// Develop a Java program using arrays and loops only to: 
// Identify whether a student has already been processed using the StudentID. 
// Store each unique student only once. 
// Associate the student with the corresponding department name. 
// Preserve the order in which unique students first appear in the input. 
// Ignore duplicate records for an already processed student.

// Input Format 
// The first line contains an integer N, representing the number of enrollment records. 
// Each of the next N lines contains: 
// Student ID 
// Student Name 
// Department ID 
// Department Name 

// Constraints 
// 1 ≤ N ≤ 50 
// Student IDs and Department IDs are positive integers. 
// Student names and department names contain no spaces. 
// The same student may occur more than once. 
// Repeated records for the same student contain the same department information. 

// Output Format 
// For every unique student, print: 
// StudentID StudentName DepartmentName 
// Maintain the order in which the students first appear in the input. 

// Sample Input 
// 6 
// 201 Arjun 10 ComputerScience 
// 202 Priya 20 Commerce 
// 203 Karan 10 ComputerScience 
// 201 Arjun 10 ComputerScience 
// 204 Sneha 30 Mathematics 
// 202 Priya 20 Commerce 

// Sample Output 
// 201 Arjun ComputerScience 
// 202 Priya Commerce 
// 203 Karan ComputerScience 
// 204 Sneha Mathematics
import java.util.*;
public class ques28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] id = new int[n];
        String[] name = new String[n];
        String[] dept = new String[n];
        int unique=0;
        for(int i=0;i<n;i++){
            int currentId = sc.nextInt();
            String currentName = sc.next();
            int deptId = sc.nextInt();
            String deptName = sc.next();
            boolean found = false;
            for(int j=0;j<n;j++){
                if(id[j]==currentId){
                    found=true;
                    break;
                }
            }
            if(!found){
                id[unique] = currentId;
                name[unique] = currentName;
                dept[unique] = deptName;
                unique++;
            }
        }
        for(int i=0;i<unique;i++){
            System.out.println(id[i]+" "+name[i]+" "+dept[i]);
        }
    }
}
