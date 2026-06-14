class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        if(arr.size()<=2){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            int x = arr.get(i);
            if(x>max){
                third = sec;
                sec = max;
                max = x;
            }
            else if(x>sec ){
                third = sec;
                sec = x;
            }
            else if(x>third){
                third = x;
            }
        }
        if(third == Integer.MIN_VALUE) return -1;
        else return third;
    }
    
}