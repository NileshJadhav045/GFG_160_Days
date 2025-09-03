
public class Day_21 {

    public static void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int heigh = n - 1;

        while (mid <= heigh) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, heigh);
                heigh--;
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}
