class Solution {
    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        // code here
        List<List<Integer>> ans = new ArrayList<>();
        for(int x:arr){
            if(x>lower){
                ans.add(Arrays.asList(lower,x-1));
                
            }
            lower=x+1;
            
        }
        if(lower<=upper){
            ans.add(Arrays.asList(lower,upper));
        }
        return ans;
    }
}
