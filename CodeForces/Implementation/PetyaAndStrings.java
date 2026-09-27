import java.util.*;
public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i) - s2.charAt(i)>0){
                System.out.println("1");
                return;
            }
            else if(s1.charAt(i) - s2.charAt(i)<0){
                System.out.println("-1");
                return;
            }
            i++;
        }
        System.out.println("0");
    }
}
