
public class Day_60 {

    public static int maxWater(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int res = 0;
        while (left < right) {
            int water = Math.min(arr[left], arr[right]) * (right - left);

            res = Math.max(res, water);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 3};
        System.out.println(maxWater(arr));
    }
}
