package dz2Part2;

import java.util.Scanner;

public class Transponir {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
        int rows=8,columns=4;
        int[][] matrix=new int[rows][columns];
        for (int i=0;i<rows;i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        show(matrix);
        System.out.println("===");
        int[][] matrixT=new int[columns][rows];
        matrixT=transposeMatrix(matrix);
        show(matrixT);

        for (int i=0;i<columns;i++) {
            int total=0;
            for (int j = 1; j < rows; j++) {
                total=total+matrixT[i][j];

            }
        }


    }
    /*
    882 116 100 182 114 96 110 155
    595 85 98 70 85 77 96 67
    1232 76 124 154 74 60 98 124
    17500 2300 2500 2750 1900 1890 2500 2500
     */
    static double[][] transposeMatrixDbl(double [][] m){
        double[][] temp = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
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
        for (int i=0;i<ln;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
//                if(j<ln-1) {
//                    System.out.print(" ");
//                }

            }
            System.out.println();
        }
    }
}
