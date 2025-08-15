// Day - 1
public class SecondLar {
    /* GFG -> Second Largest
        Time Complexity: O(n)
        Auxiliary Space: O(1)
     * Given an array of positive integers arr[], return the second largest element
     * from the array. If the second largest element doesn't exist then return -1.
     * 
     * Note: The second largest element should not be equal to the largest element.
     */
    public static int getSecondLargest(int nums[]) {
        int largest = -1;
        int secondLargest = -1;
        int n = nums.length;
        if (n < 2)
            return -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && largest != nums[i]) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        System.out.println("Second Largest Element in Array: " + getSecondLargest(arr));
    }
}
