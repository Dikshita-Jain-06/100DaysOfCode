package Programming_Abstraction_Using_Java.short_5_Marks;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class ques25 {
    static List<Integer> filter(List<Integer> list, Predicate<Integer> p){
        List<Integer> result = new ArrayList<>();
        for(int x:list){
            if(p.test(x)){
                result.add(x);
            }
        }
        return result;
    } 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        String operation = sc.next();
        Predicate<Integer> p;
        if(operation.equals("positive")){
            p=x->x>0;
        }
        else if(operation.equals("negative")){
            p=x->x<0;
        }
        if(operation.equals("even")){
            p=x->x%2==0;
        }
        else{
            p=x->x%2!=0;
        }
        List<Integer> result = filter(list,p);
        if(result.isEmpty()){
            System.out.println("No match");
        }
        else{
            for(int x: result){
                System.out.print(x+" ");
            }
        }
    }
}
