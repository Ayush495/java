import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maxMatrix {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        while (q-- > 0) {
            int n = scanner.nextInt();
            int[][] matrix = new int[2 * n][2 * n];
            for (int i = 0; i < 2 * n; i++)
                for (int j = 0; j < 2 * n; j++)
                    matrix[i][j] = scanner.nextInt();
            int sum =  getMax(n, matrix);
            System.out.println(sum);
        }
    }

    private static int getMax(int n, int[][] matrix) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ii = 2*n-1-i;
                int jj = 2*n-1-j;
                int best = matrix[i][j];
                if (matrix[ii][j]>best) best = matrix[ii][j];
                if (matrix[i][jj]>best) best = matrix[i][jj];
                if (matrix[ii][jj]>best) best = matrix[ii][jj];
                //System.out.print("best"+matrix[ii][j]+","+matrix[i][jj]+","+matrix[ii][jj]);
                max += best;
            }
        }
        return max;
    }
}