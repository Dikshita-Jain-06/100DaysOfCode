class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] seat: reservedSeats){
            int row = seat[0];
            int col = seat[1];
            map.put(row,map.getOrDefault(row,0) | (1<<(10-col)));
        }
            //rows without any reserved seats can fit 2 families
        int ans = (n-map.size())*2;
        for(int row : map.keySet()){
            int mask = map.get(row);
            boolean left = (mask & 0b0000011110)==0;
            boolean right = (mask & 0b0111100000)==0;
            boolean middle = (mask & 0b0001111000)==0;
            if(left && right){
                ans+=2;
            }
            else if(left || middle || right){
                ans+=1;
            }
        }
        return ans;
    }
}