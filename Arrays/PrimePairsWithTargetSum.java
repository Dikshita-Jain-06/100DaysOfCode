class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        for(int i=2;i*i<n;i++){
            if(prime[i]){
                for(int j=i*i;j<n;j+=i){
                    prime[j]=false;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i=2;i<n;i++){
            if(prime[i]){
                int check = n-i;
                if(i<=check && prime[check]){
                    result.add(Arrays.asList(i,check));
                }
            }
        }
        return result;
    }
}
