
public class MaxProductSubArr {

    static int maxProduct(int[] arr) {
        // Initialize the maximum product as the smallest possible integer
        int maxProd = Integer.MIN_VALUE;

        // 'left' will track the product from left to right
        // 'right' will track the product from right to left
        int left = 1;
        int right = 1;
        int n = arr.length;

        // Traverse the array once from both ends simultaneously
        for (int i = 0; i < n; i++) {
            // If product becomes 0, reset it to 1 (since 0 breaks multiplication chain)
            if (left == 0) {
                left = 1;
            }
            if (right == 0) {
                right = 1;
            }

            // Multiply current element to left product
            left *= arr[i];

            // Multiply from the right side
            int j = n - i - 1;   // index from the right
            right *= arr[j];

            // Update max product seen so far
            maxProd = Math.max(left, Math.max(maxProd, right));
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }
}
