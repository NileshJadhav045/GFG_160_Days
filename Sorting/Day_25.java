
import java.util.ArrayList;
import java.util.Arrays;

public class Day_25 {

    public static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);

            i++;
        }
        ans.add(newInterval);

        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int intervals[][] = {{1, 3}, {4, 5}, {6, 7}, {8, 10}};
        int newInterval[] = {5, 6};
        ArrayList<int[]> ans = insertInterval(intervals, newInterval);
        for (int i[] : ans) {
            System.out.println(Arrays.toString(i));
        }
    }
}
