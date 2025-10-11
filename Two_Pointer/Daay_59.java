
public class Daay_59 {

    public static int maxWater(int arr[]) {
        int n = arr.length;
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(maxWater(arr));
    }
}
