// package Programming_Abstraction_Using_Java.short_5_Marks;
import java.util.*;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> queue = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String operation = sc.next();
            if(operation.equals("ADD")){
                String name = sc.next();
                queue.addLast(name);
            }
            else if(operation.equals("PROCESS")){
                if(queue.isEmpty()){
                    System.out.println("No jobs");
                }
                else{
                    String name = queue.removeFirst();
                    System.out.println("Processed: "+name);
                }
            }
            else if(operation.equals("SIZE")){
                System.out.println("Size: "+queue.size());
            }

        }
        sc.close();
    }
}
