class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incCount = 1;
        int decCount = 1;
        int maxIncCount = 1;
        int maxDecCount = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) incCount++;
            else incCount=1;
            maxIncCount = Math.max(maxIncCount,incCount);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) decCount++;
            else decCount=1;
            maxDecCount = Math.max(maxDecCount,decCount);
        }
        return Math.max(maxIncCount,maxDecCount);
    }
}