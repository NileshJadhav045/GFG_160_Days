
public class Day_54 {

    static int countPairs(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        int ans = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                if (arr[left] == arr[right]) {
                    int temp = right - left;
                    ans += (temp * (temp + 1)) / 2;
                    break;
                } else {
                    int r = 1, l = 1;
                    while (left < right && arr[left] == arr[left + 1]) {
                        l++;
                        left++;
                    }
                    while (left < right && arr[right] == arr[right - 1]) {
                        r++;
                        right--;
                    }
                    ans += (l * r);
                    left++;
                    right--;
                }
            } else if (sum < target) {
                left++; 
            }else {
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 1, 5, 5, 7};
        int target = 6;
        System.out.println(countPairs(arr, target));
    }
}
