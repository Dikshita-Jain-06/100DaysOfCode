class Solution {
    public int smallestNumber(int n, int t) {
        while(divisible(n)%t!=0){
            n++;
        }
        return n;
        
    }
    public int divisible(int n){
        int prod=1;
        boolean isDivisible = false;
        while(n!=0){
            int last = n%10;
            n=n/10;
            prod*=last;
        }
        return prod;
    }
}