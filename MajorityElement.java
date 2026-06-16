class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        // int ans;
        int n = nums.length;
        // int count=1;
        // for(int i=1;i<n;i++){
        //     if(nums[i]==nums[i-1]){
        //         count++;
        //     }
        //     else{
        //         count=1;
        //     }
        //     if(count>n/2){
        //         return nums[i];
        //     }
        // }
        return nums[n/2];
        
    }
}