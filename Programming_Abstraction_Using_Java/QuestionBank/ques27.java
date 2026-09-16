// 27. Problem Statement 
// A hospital management system maintains patient treatment information in a single table 
// containing both patient details and treatment-specific information: 
// PatientID PatientName TreatmentID TreatmentName DoctorName 
// Since a patient may receive multiple treatments, the patient's ID and name are repeated for 
// every treatment record. This causes unnecessary duplication of patient information. 
// To restructure the data according to the principles of Second Normal Form (2NF), the 
// hospital wants to create a patient-level summary in which each patient appears only once. 
// Develop a Java program using arrays and loops to process the given treatment records and: 
// Identify each unique patient using the Patient ID. 
// Store the patient's name only once in the summary. 
// Count the total number of different treatment records associated with each patient. 
// Preserve the order in which patients first appear in the input. 
// Display the patient ID, patient name, and total treatment count. 

// Input Format 
// The first line contains an integer N, representing the number of treatment records. 
// Each of the next N lines contains: 
// Patient ID 
// Patient Name 
// Treatment ID 
// Treatment Name 
// Doctor Name 

// Constraints 
// 1 ≤ N ≤ 50 
// Patient ID and Treatment ID are positive integers. 
// Patient and doctor names contain no spaces. 
// The same patient-treatment combination does not occur more than once. 

// Output Format 
// For each unique patient, print: 
// PatientID PatientName TreatmentCount 
// Maintain the order of the patient's first appearance in the input. 

// Sample Input 
// 6 
// 501 Rahul 301 Checkup DrKumar 
// 502 Neha 302 XRay DrSharma 
// 501 Rahul 303 BloodTest DrMehta 
// 503 Aman 301 Checkup DrKumar 
// 502 Neha 304 MRI DrSingh 
// 501 Rahul 305 ECG DrPatel 
// Sample Output 
// 501 Rahul 3 
// 502 Neha 2 
// 503 Aman 1
import java.util.*;
public class ques27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] id = new int[n];
        String[] name = new String[n];
        int[] count = new int[n];
        int unique=0;
        for(int i=0;i<n;i++){
            int pid = sc.nextInt();
            String pname = sc.next();
            int tid = sc.nextInt();
            String tname = sc.next();
            String dname = sc.next(); 
            boolean found = false;
            for(int j=0;j<unique;j++){
                if(id[j]==pid){
                    count[j]++;
                    found = true;
                    break;
                }
            }
            if(!found){
                id[unique] = pid;
                name[unique] = pname;
                count[unique] = 1;
                unique++;
            }
        }
        for(int i=0;i<unique;i++){
            System.out.println(id[i]+" "+name[i]+" "+count[i]);
        }
    }
}
