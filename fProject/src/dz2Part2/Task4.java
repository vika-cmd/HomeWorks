package dz2Part2;

import java.util.Scanner;

/**
 * 4. Удаление из матрицы
 * На вход подается число N — количество строк и столбцов матрицы.
 * Затем передается сама матрица, состоящая из натуральных чисел.
 * После этого передается натуральное число P.
 * Необходимо найти элемент P в матрице и удалить столбец и строку его содержащий (т.е. сохранить и вывести на экран
 * массив меньшей размерности).Гарантируется, что искомый элемент единственный в массиве.
 * Пример входных данных
 * 3
 * 1 2 3
 * 1 7 3
 * 1 2 3
 * 7
 * Пример выходных данных
 * 1 3
 * 1 3
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] matrix=new int[n][n];
        int[][] newM=new int[n-1][n-1];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        int p=scanner.nextInt();

        int row=0,column=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(matrix[i][j]==p){
                    row=i;
                    column=j;

                }
            }
        }

        for (int i=0,ni=0;i<n;i++){
            if(i!=row) {
                for (int j=0,nj=0;j<n;j++){
                    if(j!=column){
                        newM[ni][nj]=matrix[i][j];
                        nj++;
                    }
                }
                ni++;
            }
        }
        show(newM);
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
