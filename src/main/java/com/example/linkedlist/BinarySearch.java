package com.example.linkedlist;

public class BinarySearch {

    int[] array = new int[]{2, 4, 5, 6};
    int[] array1 = new int[]{2,5,4,3};
    public int binarySearch(int k){

        int low = 0, high = array.length-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(array[mid] == k){
                return mid;
            }else if(array[mid] > k){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

}
