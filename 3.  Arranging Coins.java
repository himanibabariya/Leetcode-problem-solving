// 441. Arranging Coins
// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

// Given the integer n, return the number of complete rows of the staircase you will build.

class Solution {
    public int arrangeCoins(int n) {
        int start =0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long midCoin = (long) mid * (mid + 1) / 2; 

            if (midCoin == n) {
                return mid;
            } else if (midCoin > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int) end;
    }
}