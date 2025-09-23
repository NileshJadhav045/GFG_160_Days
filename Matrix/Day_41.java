
public class Day_41 {

    public static void setMatrixZeroes(int[][] mat) {

        int n = mat.length, m = mat[0].length;

        int col = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;

                    if (j == 0) {
                        col = 0;
                    } else {
                        mat[0][j] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        if (mat[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                mat[0][j] = 0;
            }
        }

        if (col == 0) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {{1, -1, 1},
        {-1, 0, 1},
        {1, -1, 1}};
        setMatrixZeroes(mat);
        int n = mat.length, m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
