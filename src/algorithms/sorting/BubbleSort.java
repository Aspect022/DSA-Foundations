package algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {
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

        boolean swapped;

        for (int i = 0;i<n-1;i++){
            swapped = false;
            for (int j = 0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){               //  if (arr[j] < arr[j + 1])  // descending order

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        System.out.println("Sorted array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
