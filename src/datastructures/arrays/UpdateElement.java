package datastructures.arrays;

import java.util.Arrays;

public class UpdateElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 31, 40, 50};
        int pos = 2; // position to update
        int val = 30; //value to update

        for (int i = 0; i < arr.length; i++) {
            if (i == pos) {
                arr[i] = val;
            }
        }

        // Output
        System.out.println("Original array: " + Arrays.toString(arr));
    }
}
