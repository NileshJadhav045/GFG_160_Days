public class ReversArray {
    /* Q). Reverse an Array
     * You are given an array of integers arr[]. You have to reverse the given array.
     * 
     * Note: Modify the array in place.
     */
    public static void reverseArray(int arr[]) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 6, 5 };
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
