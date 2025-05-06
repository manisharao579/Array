package Array;
import java.util.Scanner;

public class Delete {


    public static void main(String[] args) {
        int rollNo[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + i + " element: ");
            int element = sc.nextInt();
            rollNo[i] = element;
        }
        printArray1(rollNo);
        delete(rollNo,1);
        printArray1(rollNo);
    }

    public static void delete(int arr[], int pos){

        // shifting towards starting index
        for(int i = pos;i<=arr.length-2;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
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