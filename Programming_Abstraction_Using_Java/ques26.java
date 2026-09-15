package Programming_Abstraction_Using_Java;
import java.util.*;
import java.util.stream.*;
public class ques26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        } 
        Map<Boolean,Long> result = list.stream().collect(Collectors.partitioningBy(x->x%2==0,Collectors.counting()));
        System.out.println("Even:"+ result.get(true));
        System.out.println("Even:"+ result.get(false));
    }
    
}
