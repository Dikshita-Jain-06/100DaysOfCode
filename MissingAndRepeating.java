class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int[] freq = new int[n+1];
        for(int x:arr){
            freq[x]++;
        }
        int repeating=-1;
        int missing=-1;
        for(int i=1;i<=n;i++){
            if(freq[i]==2){
                repeating=i;
            }
            if(freq[i]==0){
                missing=i;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeating);
        res.add(missing);
        return res;
    }
}
