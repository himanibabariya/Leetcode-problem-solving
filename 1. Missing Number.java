// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class Solution {
    static int missingNumber(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i];
            if(arr[i] <arr.length && arr[i] != arr[correct]){
                swap(arr,i, correct);
            }
            else {
                i++;
            }
        }
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
         return arr.length;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

 