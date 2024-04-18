// 35. Search Insert Position

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

class Solution {
    static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start) /2;
            if(arr[mid] > target){
                end = mid -1;
            } else if (arr[mid]<target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return start;
    }
}