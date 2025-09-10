
public class Day_28 {

    static int countFreq(int[] arr, int target) {
        // code here
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        System.out.println(countFreq(arr, target));
    }
}
