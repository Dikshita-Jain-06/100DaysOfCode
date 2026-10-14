import java.util.*;
public class HelpfulMaths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int one=0;
        int two=0;
        int three=0;
        int plus=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='1') one++;
            else if(ch=='2') two++;
            else if(ch=='3') three++;
            else plus++;
        }
        while(one>0){
            sb.append("1+");
            one--;
        }
        while(two>0){
            sb.append("2+");
            two--;
        }
        while(three>0){
            sb.append("3+");
            three--;
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}