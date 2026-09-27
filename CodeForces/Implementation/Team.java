import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<3;j++){
               int num = sc.nextInt();
               if(num==1) count++;
            }
            if(count>=2) number++;
        }
        System.out.println(number);
    }
}
