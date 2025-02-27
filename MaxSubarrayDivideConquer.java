package Array;

public class MaxSubarrayDivideConquer {
    public static int maxCrossingSum(int[] arr, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE, sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }

    public static int maxSubarraySum(int[] arr, int left, int right) {
        if (left == right) return arr[left];

        int mid = (left + right) / 2;

        return Math.max(
                Math.max(maxSubarraySum(arr, left, mid), maxSubarraySum(arr, mid + 1, right)),
                maxCrossingSum(arr, left, mid, right)
        );
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr, 0, arr.length - 1));
    }
}
