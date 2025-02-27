package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 38, 13, 10, 36, 1};

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        System.out.println(first);
        System.out.println(second);

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + (second == Integer.MIN_VALUE ? "No second largest element" : second));
    }
}
