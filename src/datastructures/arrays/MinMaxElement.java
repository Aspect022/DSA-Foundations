package datastructures.arrays;

import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Declare array of size n
        int[] arr = new int[n];

        // Take input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
