package dz2Part2;

import java.util.Scanner;

public class Task5Sanya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
//        show(matrix);
        boolean res=f(matrix);
        System.out.println(res);

//        System.out.println(f(matrix));
    }


    static boolean f(int[][] matrix){
        int n=matrix.length-1;
        // 0   0    0   1    0   2
        // 3-0 3-0  3-1 3-0  3-2 3-0
        //
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col < n - row; col++) { // тут с каждой строкой уменьшаем правую границу, чтобы обойти только половину матрицы
                if (matrix[row][col] != matrix[n - col][n - row])
                    return false;
            }
        }
        return true;
    }


    static void show(int[][] arr){
        int ln=arr.length;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}