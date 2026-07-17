class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        
        int low=0;
        int high=0;
        for(int board:arr){
            low=Math.max(low,board);
            high+=board;
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            int painters=1;
            int time=0;
            for(int board:arr){
                if(board+time<=mid){
                    time+=board;
                }
                else{
                    painters++;
                    time=board;
                }
            }
            if(painters<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
