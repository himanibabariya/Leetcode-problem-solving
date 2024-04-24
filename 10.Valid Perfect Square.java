// 367. Valid Perfect Square

// Given a positive integer num, return true if num is a perfect square or false otherwise.

// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

// You must not use any built-in library function, such as sqrt.

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0){
            return false;
        }
        int start =0;
        int end = num;

        while(start<=end){
            int mid = start + (end - start) / 2;
            int square = mid * mid;
            if(num == square){
                return true;
            }
            else if(square < num){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }    
        return false;    
    }
}