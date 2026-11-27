class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            max.offer(arr[i]);
            if(max.size()>k){
                max.poll();
            }
        }
        return max.peek();
    }
}
