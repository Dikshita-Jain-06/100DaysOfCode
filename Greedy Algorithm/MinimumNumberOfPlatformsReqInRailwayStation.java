class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=0;
        int max=0;
        int i=0;
        int j=0;
        while(i<n){
            if(arr[i]<=dep[j]){
                count++;
                max = Math.max(max,count);
                i++;
            }
            else if(arr[i]>dep[j]){
                count--;
                j++;
            }
        }
        return max;
    }
}
