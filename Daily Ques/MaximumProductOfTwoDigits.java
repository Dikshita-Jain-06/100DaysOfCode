class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int prod=1;
        while(n>0){
            int last = n%10;
            if(last>max){
                sec=max;
                max = last;
            }
            else if(last>sec){
                sec = last;
            }
            n=n/10;
            prod = max*sec;
        }
        return prod;
    }
}
