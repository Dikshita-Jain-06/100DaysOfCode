import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='o'||ch=='y'||ch=='e'||ch=='u'||ch=='i'){
                continue;
            }
            else{
                sb.append("."+s.charAt(i));
            }

        }
        System.out.println(sb.toString());
    }
}
