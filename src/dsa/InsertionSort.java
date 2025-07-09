package dsa;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] arr){
        for(int i = 1; i< arr.length; i++){
            while(i>0&& arr[i]< arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{31,41,59,26,41,58};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
