// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                Vector<Integer> ans = new Vector<>();
                for(int x:arr){
                    ans.add(x);
                }
                return ans;
            }
            //if digit is 9 make it zero
            arr[i]=0;
        }
        Vector<Integer> ans = new Vector<>();
        ans.add(1);
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        return ans;
        
    }
}
