package algorithms.searching;

import java.util.Scanner;

public class LinearSearch {
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
        //get the element to find
        System.out.print("Enter the element to find: ");
        int val = sc.nextInt();

        int ans = -1;

        for (int i =0 ;i< arr.length;i++){
            if (arr[i] == val) ans = i;
        }
        if (ans != -1) {
            System.out.println("The index of the element is: " + ans);
        }
        else
            System.out.println("Invalid number");
    }
}
