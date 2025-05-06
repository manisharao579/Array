package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertIn2DArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int my2dArray[][] = new int[3][];
            int customSize = 4;
            for (int i=0;i<my2dArray.length;i++)
            {
                my2dArray[i] = new int[customSize];
                for (int j=0; j < my2dArray[i].length;j++){
                    System.out.println("Enter "+j+" element: ");
                    int element = sc.nextInt();
                    my2dArray[i][j] = element;
                }
                customSize --;
            }

            print2dArray(my2dArray);
            insert2dArray(my2dArray,0,0,5);
            print2dArray(my2dArray);
        }

        public static void print2dArray(int arr[][]){
            for(int i=0;i<arr.length;i++){
                System.out.println("For "+ i+" index");
                printArray1(arr[i]);
            }
        }
        public static void insert2dArray(int arr[][], int pos1, int pos2, int element){
            insert(arr[pos1], pos2, element);
        }
    public static void insert(int arr[], int pos, int element) {

        int size = arr.length;
        if (pos < 0 || pos > size - 1) {
            System.out.println("Wrong position");
            return;
        }
        // shifting towards the end
        for (int i = size - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
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
