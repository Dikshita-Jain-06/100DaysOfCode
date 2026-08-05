class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        int n = s.length;
        int[][] meetings = new int[n][3];
        // meetings[i][0] = start
        // meetings[i][1] = finish
        // meetings[i][2] = index (1-based)
        for(int i=0;i<n;i++){
            meetings[i][0] = s[i];
            meetings[i][1] = f[i];
            meetings[i][2] = i+1;
        }
        Arrays.sort(meetings, (a,b) -> {
            if(a[1]==b[1]){
                return a[2]-b[2];
            }
            return a[1]-b[1];
        });
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meetings[0][2]);
        int lastFinish = meetings[0][1];
        for(int i=1;i<n;i++){
            if(meetings[i][0] > lastFinish){
                ans.add(meetings[i][2]);
                lastFinish = meetings[i][1];
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
