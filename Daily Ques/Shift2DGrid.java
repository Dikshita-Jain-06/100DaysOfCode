class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int n = rows*cols;
        k=k%n;
        if(k==0) return convert(grid);
        reverse(grid,0,n-1,cols);
        reverse(grid,0,k-1,cols);
        reverse(grid,k,n-1,cols);
        return convert(grid);
    }
    private void reverse(int[][] grid, int left, int right, int cols){
        while(left<right){
            int r1 = left/cols;
            int c1 = left%cols;
            int r2 = right/cols;
            int c2 = right%cols;
            int temp = grid[r1][c1];
            grid[r1][c1] = grid[r2][c2];
            grid[r2][c2] = temp;
            right--;
            left++;
        }
    }
    private List<List<Integer>> convert(int[][] grid){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                list.add(grid[i][j]);
            }
            ans.add(list);
        }
        return ans;
    }
}