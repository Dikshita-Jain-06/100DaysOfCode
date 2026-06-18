class Solution {
    public void nextPermutation(int[] nums) {
        int n =nums.length;
        int ind=-1;
        //step 1 find dip
        for(int i=n-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                ind=i;
                break;
            }
        }
        //step2 if no dip exists
        if(ind==-1){
            reverse(nums,0,n-1);
            return;
        }
        // step 3 find just greater element 
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        //step 4 reverse suffix
        reverse(nums,ind+1,n-1);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp; 
    }
    private void reverse(int[] nums, int l, int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
            
        }
    }
}