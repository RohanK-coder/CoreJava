package dsa;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[8];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);
        System.out.println();

        mergeSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return; // Base case: already sorted
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        // Splitting array
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        System.out.println("Splitting: " + Arrays.toString(inputArray));
        System.out.println("  Left: " + Arrays.toString(leftHalf));
        System.out.println("  Right: " + Arrays.toString(rightHalf));

        // Recursively sort each half
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge sorted halves
        merge(inputArray, leftHalf, rightHalf);

        System.out.println("Merged into: " + Arrays.toString(inputArray));
        System.out.println();
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        // Compare elements from left and right and fill into inputArray
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        // Copy remaining elements from right
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
