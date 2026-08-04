class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int greed=0;
        int size=0;
        while(greed<g.length && size<s.length){
            if(g[greed]<=s[size]){
                greed=greed+1;
            }
            size=size+1;
        }
        return greed;
    }
}
