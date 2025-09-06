
import java.util.ArrayList;
import java.util.Arrays;

public class Day_24 {

    public static ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();

        list.add(new int[]{arr[0][0], arr[0][1]});

        for (int i = 1; i < n; i++) {
            int last[] = list.get(list.size() - 1);
            int curr[] = arr[i];

            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                list.add(new int[]{curr[0], curr[1]});
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        ArrayList<int[]> ans = mergeOverlap(arr);
        for(int i[]: ans){
            System.out.println(Arrays.toString(i));
        }
    }
}
