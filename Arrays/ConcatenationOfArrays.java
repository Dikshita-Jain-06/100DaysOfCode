class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length+nums.length];
        for(int i=0;i<2*nums.length;i++){
            ans[i] = nums[i%n];
        }
        return ans;
    }
}
