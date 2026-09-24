class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            if(nums[i]>9){
                while(nums[i]>0){
                    int last = nums[i]%10;
                    sum+=last;
                    nums[i] = nums[i]/10;
                }
            }
            else sum=nums[i];
            if(sum==i) return i;
        }
        return -1;
    }
}
