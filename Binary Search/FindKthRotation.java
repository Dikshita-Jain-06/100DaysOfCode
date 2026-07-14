class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    ans=arr[low];
                    index=low;
                }
            }
            int mid = low+(high-low)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ans=arr[low];
                    index=low;
                }
                low=mid+1;
            }
            else{
                if(arr[mid]<ans){
                    ans=arr[mid];
                    index = mid;
                }
                high=mid-1;
            }
        }
        return index;
        
    }
}
