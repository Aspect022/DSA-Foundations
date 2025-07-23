//Rotating the array can be either left or right rotation
//✅ 1. Left Rotation
//Each element moves one position to the left, and the first element goes to the end.
//Original:    [1, 2, 3, 4, 5]
//Left rotate: [2, 3, 4, 5, 1]
//If you rotate it left twice:
//[3, 4, 5, 1, 2]
//✅ 2. Right Rotation
//Each element moves one position to the right, and the last element moves to the front.
//Original:     [1, 2, 3, 4, 5]
//Right rotate: [5, 1, 2, 3, 4]
//Rotate right twice:
//[4, 5, 1, 2, 3]

// used in sliding window approach!
package datastructures.arrays;

import java.util.Arrays;

public class RotateArray {

    public static int[] leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k > n

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }

        return rotated;
    }

    public static int[] rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k > n

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // rotate left by 2

        int[] rotated_left = leftRotate(arr, k);
        int[] rotated_Right = rightRotate(arr, k);

        System.out.println("Left Rotated Array: " + Arrays.toString(rotated_left));
        System.out.println("Right Rotated Array: " + Arrays.toString(rotated_Right));

    }
}
