class Solution {
    public int numPrimeArrangements(int n) {
        int MOD = 1_000_000_007;
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j] = false;
                }
            }
        }
        int p = 0;
        for(int i=2;i<=n;i++){
            if(prime[i]) p++;
        }
        long ans = 1;
        for(int i=2;i<=p;i++){
            ans = (ans*i)%MOD;
        }
        for(int i=2;i<=n-p;i++){
            ans = (ans*i)%MOD;
        }
        return (int)ans;
    }
}
