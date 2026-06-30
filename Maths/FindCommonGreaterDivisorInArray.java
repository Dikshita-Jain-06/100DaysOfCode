class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            else if(nums[i]<min){
                min = nums[i];
            }
        }
        //METHOD 1 BRUTE FORCE
        // for(int i=min;i>=1;i--){
        //     if(min%i==0 && max%i==0){
        //         return i;
        //     }
        // }
        // return 1;



        //METHOD 2
        return gcd(min,max);
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
