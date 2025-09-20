
public class Day_38 {

    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n = mat.length;
        int m = mat[0].length;
        int i = 0;
        int j = m - 1;

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(mat[i][j]==x){
        //             return true;
        //         }
        //     }
        // }
        while (i < n && j >= 0) {
            if (x > mat[i][j]) {
                i++;
            } else if (x < mat[i][j]) {
                j--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int mat[][] = {{3, 30, 38}, {20, 52, 54}, {35, 60, 69}};
        int x = 69;

        System.out.println(matSearch(mat, x));
    }
}
