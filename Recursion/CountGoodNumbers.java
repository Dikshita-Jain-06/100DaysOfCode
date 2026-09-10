class Solution {
    final static long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even = findPower(5,(n+1)/2);
        long odd = findPower(4,n/2);
        return (int) ((even*odd)%MOD);
    }
    public long findPower(long a, long b){
        if(b==0) return 1;
        if(b%2==0) return findPower((a*a)%MOD,b/2);
        else return (a*findPower((a*a)%MOD,b/2))%MOD    ;
    }
}