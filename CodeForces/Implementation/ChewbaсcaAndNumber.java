import java.util.*;
public class ChewbaсcaAndNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int digit = ch-'0';
            int inv = 9-digit;
            // we not have to make first digit 0
            if(i==0 && inv==0){
                ans.append(digit);
            }
            else{
                ans.append(Math.min(digit,inv));
            }

        }
        System.out.println(ans.toString());
    }
}