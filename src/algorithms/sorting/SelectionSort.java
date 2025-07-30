package algorithms.sorting;

import java.util.Scanner;

public class SelectionSort {
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
        for (int i = 0;i< n-1;i++){
            int minIndex = i;
            for (int j = i+1;j<n;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp =arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }

    }
}
