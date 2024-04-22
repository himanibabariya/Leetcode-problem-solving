// 1351. Count Negative Numbers in a Sorted Matrix

// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

class Solution {
    public int countNegatives(int[][] grid) {
       int count =0;
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                if(grid[row][col]<0){
                    count++;
                }
            }
        }
        return count;
}
}