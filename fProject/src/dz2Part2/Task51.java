package dz2Part2;

import java.util.Scanner;

/**
 * 5. Проверить симметричность  !!!  ПО ГЛАВНОЙ ДИАГОНАЛИ
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
 *  !!!!!!!!!!!!!!!!!!!!!              СДЕЛАЛА ПО ГЛАВНОЙ ДИАГОНАЛИ А НАДО ПОБОЧНОЙ
 */
public class Task51 {
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

    static int[][] transposeMatrix(int [][] m){
        int[][] temp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }


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
