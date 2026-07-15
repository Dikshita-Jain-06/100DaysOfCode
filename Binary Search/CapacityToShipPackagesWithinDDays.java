class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights){
            low = Math.max(low,weight);
            high+=weight;
        }
        int ans=high;
        while(low<=high){
            int mid = low+(high-low)/2;
            int requireDays=1;
            int load=0;
            for(int weight:weights){
                if(load+weight<=mid){
                    load+=weight;
                }
                else{
                    requireDays++;
                    load=weight;
                }
            }
            if(requireDays<=days){
                ans = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}