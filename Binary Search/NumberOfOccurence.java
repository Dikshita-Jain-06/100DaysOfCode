class Solution {
    int countFreq(int[] arr, int target) {
        int firstIndex=first(arr,target);
        if(firstIndex==-1) return 0;
        int lastIndex = last(arr,target);
        return lastIndex-firstIndex+1;
    }
    int first(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    int last(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}

