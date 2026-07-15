class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE;
        int high=0;
        if((long)m*k>bloomDay.length) return -1;
        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int bouqets = 0;
            int count = 0;
            for(int day : bloomDay){
                if(day<=mid){
                    count++;
                }
                else{
                    bouqets+=count/k;
                    count=0;
                }
            }
            bouqets+=count/k;
            if(bouqets>=m){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
