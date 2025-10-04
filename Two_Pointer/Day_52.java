import java.util.Arrays;

public class Day_52 {
    static int countPairs(int arr[], int target) {
        int n=arr.length;
        int pairs=0;
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        while(left!=right){
            if(arr[left]+arr[right]<target){
                pairs+=right-left;
                left++;
            }else{
                right--;
            }
        }
        
        return pairs;
    }
    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 3};
        int target = 8;
        System.out.println(countPairs(arr, target));
    }
}
