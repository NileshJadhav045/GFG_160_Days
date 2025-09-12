
public class Day_30 {

    public static int findKey(int[] arr, int key) { // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int search(int[] arr, int key) { // O(log n)
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] >= arr[lo]) {
                if (key >= arr[lo] && key < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 7;
        System.out.println(findKey(arr, key));
        System.out.println(search(arr, key));
    }
}
