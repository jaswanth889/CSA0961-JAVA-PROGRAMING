import java.util.*;
class GOAT {
    public static void main(String args[]) {
        int r1 = 2, c1 = 2,i,j,k;
        int r2 = 2, c2 = 2;
        int[][] a = { {1, 2}, {5, 3}};
        int[][] b = { {2, 3}, {4, 1}};

        int[][] c= new int[r1][c2];
        for(i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                    c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Multiplication of two matrices is: ");
        for(i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(c[i][j] + "    ");
            }
            System.out.println();
        }
    }
}