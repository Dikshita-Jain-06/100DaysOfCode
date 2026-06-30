class Solution {
     int MOD = 1000000007;
    public int numPrimeArrangements(int n) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        if(n>=0) prime[0]=false;
        if(n>=1) prime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int primeCount=0;
        for(int i=2;i<=n;i++){
            if(prime[i]) primeCount++;
        }
        int nonPrimeCount = n-primeCount;
        return (int)((factorial(primeCount)*factorial(nonPrimeCount))%MOD);
    }
    public long factorial(int n){
        long ans=1;
        for(int i=2;i<=n;i++){
            ans=(ans*i)%MOD;
        }
        return ans;
    }
}