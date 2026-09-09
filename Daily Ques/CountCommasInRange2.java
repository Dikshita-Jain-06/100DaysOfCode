class Solution {
    public long countCommas(long n) {
        // if(n<=999) return 0;
        // long totalCommas = 0;
        // long start = 1000;
        // while(start<=n){
        //     totalCommas+=n-start+1;
        //     start*=1000;
        // }
        // return totalCommas;


        //M2
        long result=0;
        long lower=1000;
        long commas=1;
        while(lower<=n){
            long upper = lower*1000-1;
            if(upper>n) upper = n;
            long countNumbers = upper-lower+1;
            result+= (countNumbers*commas);
            lower*=1000;
            commas++;
        }
        return result;
    }
}
