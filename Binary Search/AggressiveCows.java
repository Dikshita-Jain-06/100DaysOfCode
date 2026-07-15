class Solution {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int low=1;
        int high=arr[n-1]-arr[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPlace(arr,k,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    static boolean canPlace(int[] arr,int k, int distance){
        int cow=1;
        int last = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=distance){
                cow++;
                last=arr[i];
                if(cow==k){
                    return true;
                }
            }
        }
        return false;
    }
}
