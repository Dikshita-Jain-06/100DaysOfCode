import java.util.*;
public class Tram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int maxSum=0;
        for(int i=0;i<n;i++){
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            sum = sum-exit+enter;
            maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}