package dsa;

import java.util.Arrays;

public class EasyMerge {
    public static void main(String[] args) {
        int[] nums = new int[]{37,28,43,21,90};
        int mid = nums.length/2;
        int[] leftHalf = new int[mid];
        System.out.println("Array before sort : "+ Arrays.toString(Arrays.stream(nums).toArray()));
        for(int i=0;i<mid;i++){
            leftHalf[i]=nums[i];
        }

        int[] rightHalf=new int[nums.length-mid];
        for(int i=mid;i< nums.length;i++){
            rightHalf[i-mid]=nums[i];
        }

        int i=0,j=0,k=0;

        while(i< leftHalf.length && j<rightHalf.length){
            if(leftHalf[i]<=rightHalf[j]){
                    nums[k]=leftHalf[i];
                    i++;
            }
            else{
                nums[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftHalf.length) {
            nums[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalf.length) {
            nums[k] = rightHalf[j];
            j++;
            k++;
        }

        System.out.println("Array after sort : "+ Arrays.toString(Arrays.stream(nums).toArray()));
    }
}
