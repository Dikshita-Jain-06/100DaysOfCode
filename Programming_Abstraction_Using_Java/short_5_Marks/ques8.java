// package Programming_Abstraction_Using_Java.short_5_Marks;
import java.util.*;
public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        int k = sc.nextInt();
        int size = set.size();
        if(k<1 || k>size){
            System.out.print("Invalid k");
        }
        else{
            int count = 0;
            int kthSmallest = 0;
            for(int x:set){
                count++;
                if(count==k){
                    kthSmallest = x;
                    break;
                }
            }
            count=0;
            int kthLargest = 0;
            // Iterator<Integer> it = set.descendingIterator();
            for(int x : set.descendingSet()){
                count++;
                if(count==k){
                    kthLargest = x;
                    break;
                }
            }
            System.out.println("Kth Smallest: " + kthSmallest);
            System.out.println("Kth Largest: " + kthLargest);

        }
        sc.close();
    }
}
