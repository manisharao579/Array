package Array;
import java.util.Scanner;

public class PrintArray {


    public static void main(String[] args) {
        int rollNo[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + i + " element: ");
            int element = sc.nextInt();
            rollNo[i] = element;
        }
        printArray1(rollNo);
    }


public static void printArray1 (int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
