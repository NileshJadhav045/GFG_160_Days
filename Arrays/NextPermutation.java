public class NextPermutation {
    static void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the pivot (first number from right which is smaller than its next)
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot found → array is in descending order, just reverse it to smallest
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element (from right side) to swap with pivot
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // Step 4: Reverse the suffix (pivot+1 to end) to get the next lexicographically
        // smallest arrangement
        reverse(arr, pivot + 1, n - 1);
    }

    // Helper function to reverse subarray from index s to e
    static void reverse(int arr[], int s, int e) {
        while (s < e) {
            swap(arr, s++, e--);
        }
    }

    // Helper function to swap two elements at indices s and e
    static void swap(int arr[], int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 7, 5, 0 };
        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
