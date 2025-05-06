package Array;

import java.util.Scanner;

public class Update {

    public static void main(String[] args) {
        int rollNo[] = new int[5];
        Scanner sc = new Scanner(System.in);

        // Input 5 elements
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element at index " + i + ": ");
            rollNo[i] = sc.nextInt();
        }

        // Print original array
        System.out.println("Original array:");
        printArray1(rollNo);

        // Update element at a valid position
        update(rollNo, 2, 99);  // Updates element at index 2 with value 99

        // Print updated array
        System.out.println("Updated array:");
        printArray1(rollNo);

        sc.close();
    }

    public static void update(int arr[], int pos, int element) {
        int size = arr.length;
        if (pos < 0 || pos >= size) {
            System.out.println("Wrong position");
            return;
        }
        arr[pos] = element;
    }

    public static void printArray1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
