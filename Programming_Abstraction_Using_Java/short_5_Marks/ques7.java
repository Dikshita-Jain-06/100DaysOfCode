// package Programming_Abstraction_Using_Java.short_5_Marks;
import java.util.*;
class Task{
    String name;
    int priority;
    int order;
    Task(String name, int priority, int order){
        this.name = name;
        this.priority = priority;
        this.order = order;
    }
}
public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // PriorityQueue<Task> pq = new PriorityQueue<>((a,b)->{
        //     if(a.priority!=b.priority) return a.priority - b.priority;
        //     return a.order-b.order;
        // });
        PriorityQueue<Task> pq = new PriorityQueue<>(Comparator.comparing((Task t)->t.priority).thenComparing(t->t.order));
        for(int i=0;i<n;i++){
            String name = sc.next();
            int priority = sc.nextInt();
            Task t = new Task(name,priority,i);
            pq.add(t);
        }
        while(!pq.isEmpty()){
            System.out.print(pq.poll().name);
            if(!pq.isEmpty()){
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
