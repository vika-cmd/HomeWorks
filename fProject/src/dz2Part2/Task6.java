package dz2Part2;

import java.util.Scanner;

/**
 * 6. Подсчет калорий
 * Петя хочет каждый день записывать сколько белков, жиров, углеводов и калорий он съел, а в конце недели приложение должно его уведомлять, вписался ли он в свою норму или нет.
 * На вход подаются числа A — недельная норма белков, B — недельная норма жиров, C — недельная норма углеводов и K — недельная норма калорий.
 * Затем передаются 7 строк, в которых в том же порядке указаны сколько было съедено Петей нутриентов в каждый день недели.
 * Если за неделю в сумме по каждому нутриенту не превышена недельная норма, то вывести “Отлично”, иначе вывести “Нужно есть поменьше”.
 * Пример входных данных
 * 882 595 1232 17500
 * 116 85 76 2300
 * 100 98 124 2500
 * 182 70 154 2750
 * 114 85 74 1900
 * 96 77 60 1890
 * 110 96 98 2500
 * 155 67 124 2500
 * Пример выходных данных
 * Отлично
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arrTotal=new int[4];
        for(int i=0;i<4;i++){
            arrTotal[i]=scanner.nextInt();
        }

        int rows=8-1,columns=4;
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
        for (int i=0;i<4;i++) {
            int total=0;
            for (int j = 0; j < 7; j++) {
                total=total+matrixT[i][j];
            }
//            System.out.print("i total "+arrTotal[i]+" "+total);
//            System.out.println();
            if(arrTotal[i]<total){
                System.out.println("Нужно есть поменьше");
//                break;
                return;
            }
        }
        System.out.println("Отлично");

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
//                System.out.print(arr[i][j]);
//                if(j<ln-1) {
//                    System.out.print(" ");
//                }
            }
            System.out.println();
        }
    }
}
