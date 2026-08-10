class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int currentTime = 0;
        int totalTime=0;
        for(int i=0;i<bt.length;i++){
            totalTime+=currentTime;
            currentTime+=bt[i];
        }
        return totalTime/bt.length;
    }
}

