class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        int low=0;
        long high=0;
        for(int pages:arr){
            low=Math.max(low,pages);
            high+=pages;
        }
        int ans=-1;
        while(low<=high){
            long mid = low+(high-low)/2;
            int students=1;
            int pages=0;
            for(int i=0;i<arr.length;i++){
                if((long)pages+arr[i]<=mid){
                    pages+=arr[i];
                }
                else{
                    students++;
                    pages=arr[i];
                }
            }
            if(students<=k){
                ans=(int)mid;
                high=mid-1;
            }
            else{
                low=(int)mid+1;
            }
        }
        return ans;
    }
}