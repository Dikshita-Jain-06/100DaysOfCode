import java.util.*;
public class NearlyLuckyNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            int last = n%10;
            if(last==4 || last==7) count++;
            n = n/10;
        }
        if(count==4 || count==7) System.out.println("Yes");
        else System.out.println("No");
    }
}