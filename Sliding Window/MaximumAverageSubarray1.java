class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int count=0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            count++;
            while(count>k){
                sum-=nums[left];
                left++;
                count--;
            }
            if(count==k){
                double avg = (double)sum/k;
                maxAvg = Math.max(maxAvg,avg);
            }
        }
        return maxAvg;
    }
}