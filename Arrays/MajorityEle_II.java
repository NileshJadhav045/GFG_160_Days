import java.util.*;
/* Q). Majority Element - More Than n/3

 * Given an array arr[] consisting of n integers, the task is to 
 * find all the array elements which occurs more than floor(n/3) times.
 * Note: The returned array of majority elements should be sorted.
 * 
 * Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]
    Output: [1, 2]
    Explanation: The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).
 */

public class MajorityEle_II {
    public static ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            if (val > n / 3) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 3, 1, 3, 2, 1, 1 };
        System.out.println(findMajority(nums));
    }
}
