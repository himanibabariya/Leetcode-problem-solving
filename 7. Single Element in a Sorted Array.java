// 540. Single Element in a Sorted Array

// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start +(end - start) /2;

            if(mid % 2 == 1){
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
}