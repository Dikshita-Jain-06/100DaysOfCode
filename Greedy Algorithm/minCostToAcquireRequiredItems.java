class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long min = Integer.MIN_VALUE;
        long res1 = (long)cost1*need1 + (long)cost2*need2;
        long ans=0;
        if(need1>need2){
            ans = (long) costBoth*Math.min(need1,need2) + (long)(need1-need2)*Math.min(cost1,costBoth);
        }
        else{
            ans = (long) costBoth*Math.min(need1,need2) + (long)(need2-need1)*Math.min(cost2,costBoth);
        }
        min = Math.min(res1,ans);
        return min;
    }
}