class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {
                int d1 = Math.abs(a-x);
                int d2 = Math.abs(b-x);
                if(d1==d2) return b-a;
                return d2-d1;
        });
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        Collections.sort(ans);
        return ans;
    }
}
