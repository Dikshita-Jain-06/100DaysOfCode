class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int maxOnes=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int firstOne = lowerBound(arr[i]);
            int ones = arr[i].length-firstOne;
            if(ones>maxOnes){
                maxOnes = ones;
                index = i;
            }
        }
        return index;
    }
    public int lowerBound(int[] row){
        int low=0;
        int high=row.length-1;
        int ans=row.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(row[mid]==1){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
};
