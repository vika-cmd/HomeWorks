package dz2Part2;

import java.util.Scanner;

/**
 * 2. Нарисовать прямоугольник
 * На вход подается число N — количество строк и столбцов матрицы.
 * Затем в последующих двух строках подаются координаты X (номер столбца) и Y (номер строки) точек, которые задают прямоугольник.
 * Необходимо отобразить прямоугольник с помощью символа 1 в матрице, заполненной нулями (см. пример) и вывести всю матрицу на экран.
 * Пример входных данных
 * 7
 * 1 2
 * 3 4
 * Пример выходных данных
 * 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0
 * 0 1 1 1 0 0 0
 * 0 1 0 1 0 0 0
 * 0 1 1 1 0 0 0
 * 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int y1=scanner.nextInt();
        int x1=scanner.nextInt();
        int y2=scanner.nextInt();
        int x2=scanner.nextInt();
//        System.out.print(n+" "+x1+" "+y1+" "+x2+" "+y2);
        int[][] matrix=new int[n][n];
        for (int rows=0;rows<n;rows++){
            for (int columns=0;columns<n;columns++){
                if(((rows==x1||rows==x2)&&(columns>=y1&&columns<=y2))||
                        (rows>x1&&rows<x2&&columns==y1)||(rows>x1&&rows<x2&&columns==y2)){
                    matrix[rows][columns]=1;
                }
                else {
                    matrix[rows][columns]=0;
                }
            }
        }

//        for (int[] e:matrix){
//            for (int ei:e){
//                System.out.print(ei+" ");
//            }
//            System.out.println();
//        }
        for (int rows=0;rows<n;rows++){
            for (int columns=0;columns<n;columns++){
                System.out.print(matrix[rows][columns]);
                if(columns<n-1){
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
