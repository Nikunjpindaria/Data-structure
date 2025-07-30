public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Example: Find sum from index 1 to 3 (4+6+8 = 18)
        int left = 1, right = 3;
        int rangeSum = left == 0 ? prefixSum[right] : prefixSum[right] - prefixSum[left - 1];

        System.out.println("Sum from index " + left + " to " + right + ": " + rangeSum);
    }
}
