
// 204 Sneha Mathematics 
// 29. Problem Statement 
// A university classroom management system stores course allocation information in the 
// following structure: 
// CourseID FacultyID FacultyName RoomNo 
// A faculty member can teach multiple courses, and a room can be used for multiple courses. 
// The university has the following functional dependencies: 
// CourseID → FacultyID 
// FacultyID → FacultyName 
// RoomNo → FacultyID 
// The system wants to create a simplified faculty allocation summary by keeping only the first 
// occurrence of each FacultyID. 
// Develop a pure Java program using arrays and loops only to: 
// Read the given allocation records. 
// Identify whether a faculty member has already been processed using FacultyID. 
// Store each unique faculty member only once. 
// Store the corresponding FacultyName and RoomNo. 
// Ignore duplicate records for the same faculty. 
// Preserve the order in which faculty members first appear. 
// Display the unique faculty allocation records. 
// Input Format 
// The first line contains an integer N, representing the number of records. 
// Each of the next N lines contains: 
// CourseID FacultyID FacultyName RoomNo 
// Constraints 
// 1 ≤ N ≤ 50 
// Course ID, Faculty ID, and Room Number are positive integers. 
// Faculty names contain no spaces. 
// The same faculty may occur in multiple records. 
// Duplicate faculty records contain the same faculty name. 
// Output Format 
// For every unique faculty member, print: 
// FacultyID FacultyName RoomNo 
// Maintain the order of first appearance. 
// Sample Input 
// 7 
// 101 501 Sharma 201 
// 102 502 Mehta 202 
// 103 501 Sharma 201 
// 104 503 Gupta 203 
// 105 502 Mehta 202 
// 106 504 Singh 204 
// 107 501 Sharma 201 
// Sample Output 
// 501 Sharma 201 
// 502 Mehta 202 
// 503 Gupta 203 
// 504 Singh 204 

import java.util.*;
public class ques29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] id = new int[n];
        String[] name = new String[n];
        int[] room = new int[n];
        int unique = 0;
        for(int i=0;i<n;i++){
            int faceId = sc.nextInt();
            int currentId = sc.nextInt();
            String currentName = sc.next();
            int roomNo = sc.nextInt();
            boolean found=false;
            for(int j=0;j<unique;j++){
                if(id[j]==currentId){
                    found=true;
                    break;
                }
            }
            if(!found){
                id[unique] = currentId;
                name[unique] = currentName;
                room[unique] = roomNo;
                unique++;
            }
        }
        for(int i=0;i<unique;i++){
            System.out.println(id[i]+" "+name[i]+" "+room[i]);
        }
    }
}
