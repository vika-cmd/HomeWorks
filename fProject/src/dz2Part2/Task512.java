package dz2Part2;

import java.util.Scanner;

/**
 * 5. ��������� ��������������  !!!  �� ������� ���������
 * �� ���� �������� ����� N � ���������� ����� � �������� �������.
 * ����� ���������� ���� �������, ��������� �� ����������� �����.
 * ���������� ������� true, ���� ��� �������� ������������ ������������ �������� ���������, false �����.
 * �������� ���������� ���������� ���������, ���������� �� �������� ������� ���� � ����� ������
 * ������ ������� ������
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * ������ �������� ������
 * False
 *  !!!!!!!!!!!!!!!!!!!!!              ������� �� ������� ��������� � ���� ��������
 */
public class Task512 {
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
        show(matrix);
        System.out.println("===");
        glPob(matrix);

//        int[][] matrixT=new int[n][n];
//        matrixT=transposeMatrix(matrix);
//        show(matrixT);


//        System.out.println("===");
//        int[][] matrixT1=new int[n][n];
//        matrixT1=transposeMatrix(matrixT);
//        show(matrixT1);
//        System.out.println(check(n, matrixT));
    }

    static int[][] transposeMatrix(int [][] m){
        int[][] temp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }

    static boolean check(int n, int[][] matrix) {
        boolean fl=true;
        for (int i = 1; i< n; i++){
            for (int j = 1; j< n; j++){
                if(i==j){
                    for(int k = 1; k<=j; k++) {
//                        System.out.print(matrix[i - k][j] +" "+matrix[i][j - k]);
//                        System.out.println();
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


    static void show(int[][] arr){
        int ln=arr.length;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
//                System.out.print(arr[i][j]);
//                if(j<ln-1) {
//                    System.out.print(" ");
//                }

            }
            System.out.println();
        }
    }

    static void glPob(int[][] a){
        int maxIdx = a.length - 1;

        // �������
        for (int i = maxIdx; i >= 0; i--) {
            System.out.print(a[i][i] + " ");
        }
        System.out.println();

        // ��������
        for (int i = maxIdx; i >= 0; i--) {
            System.out.print(a[i][maxIdx - i] + " ");
        }
        System.out.println();
    }
}
