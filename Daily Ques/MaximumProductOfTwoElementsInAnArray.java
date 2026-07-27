class Solution {
    public int maxProduct(int[] nums) {
        int max = 1;
        int sec = 1;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                sec = max;
                max = nums[i];
            }
            else if(nums[i]>sec){
                sec=nums[i];
            }
        }
        prod = (sec-1)*(max-1);
        return prod;
    }
}