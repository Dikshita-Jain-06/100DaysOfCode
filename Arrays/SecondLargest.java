class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec = max;
                max = arr[i];
            }
            else if(arr[i]>sec && arr[i]!=max){
                sec = arr[i];
            }
        }
        if(sec==Integer.MIN_VALUE) return -1;
        else return sec;
        
    }
}