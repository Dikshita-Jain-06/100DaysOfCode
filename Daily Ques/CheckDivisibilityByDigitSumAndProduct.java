class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int orig=n;
        int totalSum=0;
        int prod=1;
        while(n!=0){
            int last = n%10;
            sum+=last;
            prod*=last;
            n=n/10;
        }
        totalSum=sum+prod;
        if(orig%totalSum==0) return true;
        return false;
    }
}