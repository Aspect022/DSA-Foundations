package datastructures.arrays;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2; // index to delete (deleting 30)

        // Step 1: Create a new array of size one less
        int[] newArr = new int[arr.length - 1];

        // Step 2: Copy elements, skipping the one at 'pos'
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != pos) {
                newArr[j++] = arr[i];
            }
        }

        // Output
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("After deleting index " + pos + ": " + Arrays.toString(newArr));
    }
}
