import java.util.*;
public class Word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int lower=0;
        int upper=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)) lower++;
            else upper++;
        }
        if(lower>upper) System.out.println(s.toLowerCase());
        else if(upper==lower) System.out.println(s.toLowerCase());
        else System.out.println(s.toUpperCase());
    }
}