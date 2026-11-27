class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a[0]==b[0]) return b[1] - a[1];
                return a[0]-b[0];
            }
        );
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
        }
        int[] arr = new int[nums.length];
        int idx=0;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int freq = curr[0];
            int val = curr[1];
            while(freq-->0){
                arr[idx++] = val;
            }
        }
        return arr;
    }
}
