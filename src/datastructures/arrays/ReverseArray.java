package datastructures.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int[] newArr = new int[arr.length];

        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            newArr[j++] = arr[i];
        }

        // Output
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(newArr));
    }
}
