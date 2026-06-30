class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
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
        //find primes
        //METHOD 1
        for(int x=2;x<=n/2;x++){
            int y=n-x;
            if(prime[x] && prime[y]){
                ans.add(Arrays.asList(x,y));
            }
        }
        return ans;

        

        //METHOD 2
        // List<Integer> p = new ArrayList<>();
        // for(int i=2;i<=n;i++){
        //     if(prime[i]){
        //         p.add(i);
        //     }
        // }
        // int left=0;
        // int right =p.size()-1;
        // while(left<=right){
        //     int a = p.get(left);
        //     int b = p.get(right);
        //     if(a+b==n){
        //         List<Integer> t = new ArrayList<>();
        //         t.add(a);
        //         t.add(b);
        //         ans.add(t);
        //         left++;
        //         right--;
        //     }
        //     else if(a+b>n){
        //         right--;
        //     }
        //     else left++;
        // }
        // return ans;

    }
}