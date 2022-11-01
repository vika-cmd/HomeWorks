package dz2Part1;


import java.util.Arrays;
import java.util.Scanner;


/**
 * На вход подается число N — длина массива.
 * Затем передается массив целых чисел (ai) из N элементов.
 * После этого аналогично передается второй массив (aj) длины M.
 * Необходимо вывести на экран true, если два массива одинаковы (то есть содержат одинаковое количество элементов
 * и для каждого i == j элемент ai == aj). Иначе вывести false.
 * Пример входных данных
 * 7
 * 1 2 3 4 5 6 7
 * 7
 * 1 2 3 4 5 6 7
 * Пример выходных данных
 * True
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] ai1,ai2;
        ai1 =createArray(scanner);
        ai2 =createArray(scanner);
        System.out.println(Arrays.equals(ai1,ai2));
    }

    private static int[] createArray(Scanner scanner) {
        int[] ai;
        int n;
        n= scanner.nextInt();
        ai=new int[n];
        for(int j=0;j<n;j++){
            ai[j]= scanner.nextInt();
        }
        return ai;
    }

}
