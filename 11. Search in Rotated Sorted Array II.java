// 81. Search in Rotated Sorted Array II

// There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

// Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

// Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

// You must decrease the overall operation steps as much as possible.

class Solution {
    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if(nums[pivot] == target){
            return true;
        }
        if(target > nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        else {
            return binarySearch(nums,target,pivot+1, nums.length-1);
        }
    }
    static boolean binarySearch(int[] nums, int target, int start, int end ){
        while (start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] > target){
                end = mid-1;
            } else if (nums[mid]<target) {
                start = mid+1;
            }
            else {
                return true;
            }
        }
        return false;
    }
    static int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
            return mid;
        } else if (mid > start && nums[mid] < nums[mid - 1]) {
            return mid - 1;
        }

        
        if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
            
            if (nums[start] > nums[start + 1]) {
                return start;
            }
            start++;
            end--;
        } else if (nums[start] <= nums[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
                   }
        return -1;
    }
}