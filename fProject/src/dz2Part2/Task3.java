package dz2Part2;

import java.util.Scanner;

/**
 * Шахматы
 * На вход подается число N — количество строк и столбцов матрицы. Затем передаются координаты X и Y расположения коня на шахматной доске.
 * Необходимо заполнить матрицу размера NxN нулями, местоположение коня отметить символом K, а позиции, которые он может бить, символом X.
 * Пример входных данных
 * 5
 * //0 5
 * 0 4        2 2
 * Пример выходных данных
 * 0 0 0 0 0
 * 0 0 0 0 0
 * 0 X 0 0 0
 * 0 0 X 0 0
 * K 0 0 0 0
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        char[][] arr=new char[n][n];
        for(int rows=0;rows<n;rows++){
            for (int columns=0;columns<n;columns++){
                if(rows==y && columns==x){
                    arr[rows][columns]='K';
                }
                else if((rows==y-1 && columns==x+2)||(rows==y-1 && columns==x-2)
                        ||(rows==y+1 && columns==x+2)||(rows==y+1 && columns==x-2)
                        ||(rows==y-2 && columns==x+1)||(rows==y-2 && columns==x-1)
                        ||(rows==y+2 && columns==x+1)||(rows==y+2 && columns==x-1)
                            ){
                    arr[rows][columns]='X';
                }
                else {
                    arr[rows][columns]='0';
                }
            }
        }

        for(int rows=0;rows<n;rows++) {
            for (int columns = 0; columns < n; columns++) {
                System.out.print(arr[rows][columns]);
                if(columns<n-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
