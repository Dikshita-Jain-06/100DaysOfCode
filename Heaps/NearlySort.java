class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int index = 0;
        for(int i=0;i<=k;i++){
            min.offer(arr[i]);
        }
        for(int i=k+1;i<arr.length;i++){
            arr[index++] = min.poll();
            min.offer(arr[i]);
        }
        while(!min.isEmpty()){
            arr[index++] = min.poll();
        }
    }
}
