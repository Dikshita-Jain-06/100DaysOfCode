class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[n-1], arr[n-3]*arr[n-2]*arr[n-1]);
        
    }
}

