package dz2Part2;

import java.util.Scanner;

/**
 * 5. Проверить симметричность
 * На вход подается число N — количество строк и столбцов матрицы.
 * Затем передается сама матрица, состоящая из натуральных чисел.
 * Необходимо вывести true, если она является симметричной относительно побочной диагонали, false иначе.
 * Побочной диагональю называется диагональ, проходящая из верхнего правого угла в левый нижний
 * Пример входных данных
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Пример выходных данных
 * False
 */
public class Task5 {
    //i 0  1     1-1  1    2  2-1 2
    //j 0  1     1  1-1    2  2   2-1
    //  1  5     2   4     9  6   8
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] matrix=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //show(matrix);
        System.out.println(check(n, matrix));
    }

    static boolean check(int n, int[][] matrix) {
        boolean fl=true;
        for (int i = 1; i< n; i++){
            for (int j = 1; j< n; j++){
                if(i==j){
                    for(int k = 1; k<=j; k++) {
                        System.out.print(matrix[i - k][j] +" "+matrix[i][j - k]);
                        System.out.println();
                        if (matrix[i - k][j] != matrix[i][j - k]) {
                            fl = false;
                            return fl;
                        }
                    }

                }
            }
        }
        return fl;
    }
        /*
    57 190 160 71 42
    141 79 187 19 71
    141 16 7 187 160
    100 42 16 79 190
    15 100 141 141 57

    i  4      3   3    4      2  2  3   2    4      1   1   2    1   3   1   4     0  0  1  0   2   0   3   0  4
    j  0      1   0    1      2  1  2   0    2      3   2   3    1   3   0   3     4  3  3  2   4   1   4   0  4
       15     42  100  100    7  16 16  141  141    19  187 187  79  79  141 141   42 71 71 160 160 190 190 57 57

     */


    static void show(int[][] arr){
        int ln=arr.length;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<ln;j++){
                System.out.print(arr[i][j]);
                if(j<ln-1) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
