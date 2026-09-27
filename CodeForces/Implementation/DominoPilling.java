import java.util.*;
public class DominoPilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mul = m*n;
        int ans = 0;
        if(mul%2==0){
            ans = mul/2;
        }
        else{
            ans = ((mul-1)/2);
        }
        System.out.println(ans);
    }
}
