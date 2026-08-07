class Solution {
    public boolean canJump(int[] nums) {
        //we can do by both ways taking 0 base and 1 based indexing
        int finalPosition = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i>=finalPosition){
                finalPosition=i;
            }
        }
        if(finalPosition==0) return true;
        return false;
    }
}
