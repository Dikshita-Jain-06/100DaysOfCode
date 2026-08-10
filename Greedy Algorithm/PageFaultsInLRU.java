class Solution {
    public int pageFaults(int[] pages, int c) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int faults = 0;
        for(int i=0;i<pages.length;i++){
            if(!set.contains(pages[i])){
                faults++;
                //if memory full -> remove LRU
                if(set.size()==c){
                    int removed = queue.poll();
                    set.remove(removed);
                }
                set.add(pages[i]);
                queue.offer(pages[i]);
            }
            else{
                //if already present -> update LRU position
                queue.remove(pages[i]);
                queue.offer(pages[i]);
            }
        }
        return faults;
    }
}