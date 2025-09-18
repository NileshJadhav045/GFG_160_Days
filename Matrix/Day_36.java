
import java.util.ArrayList;

public class Day_36 {

    public static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        int startRow = 0, startCol = 0, endRow = n - 1, endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                ans.add(mat[startRow][j]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                ans.add(mat[i][endCol]);
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                ans.add(mat[endRow][j]);
            }

            for (int j = endRow - 1; j > startRow; j--) {
                if (startCol == endCol) {
                    break;
                }
                ans.add(mat[j][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        ArrayList<Integer> res = spirallyTraverse(mat);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
