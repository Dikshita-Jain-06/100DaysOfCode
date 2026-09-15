// package Programming_Abstraction_Using_Java.short_5_Marks;
import java.util.*;
import java.util.stream.*;
public class ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> words = new ArrayList<>();
        for(int i=0;i<n;i++){
            words.add(sc.next());
        }
        words.sort((a,b)->{
            if(a.length()!=b.length()){
                return a.length()-b.length();
            }
            return a.compareTo(b);
        });
        for(String word:words){
            System.out.println(word);
        }
    }
}
