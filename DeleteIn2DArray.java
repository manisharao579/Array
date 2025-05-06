package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteIn2DArray {
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
        delete2dArray(my2dArray,0,0);
        print2dArray(my2dArray);
    }

    public static void print2dArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            System.out.println("For "+ i+" index");
            printArray1(arr[i]);
        }
    }
    public static void delete2dArray(int arr[][], int pos1, int pos2){
        delete(arr[pos1], pos2);
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
