// 1539. Kth Missing Positive Number

// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Return the kth positive integer that is missing from this array.

class Solution {
    static int findKthPositive(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            int midBedoreMissing = arr[mid] - (mid+1);

            if(midBedoreMissing<k){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start + k;
    }

}