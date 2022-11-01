package dz2Part1;

import java.util.Scanner;

/**
 * 1. Посчитать среднее арифметическое
 * На вход подается число N — длина массива.
 * Затем передается массив вещественных чисел (ai) из N элементов.
 *
 *
 * Необходимо реализовать метод, который принимает на вход полученный массив и возвращает среднее арифметическое всех чисел массива.
 * Вывести среднее арифметическое на экран.
 * Пример входных данных
 * 3
 * 1.5 2.7 3.14
 * Пример выходных данных
 * 2.4466666666666668
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int ln=scanner.nextInt();
        double sum=0;
        int count=0;
        double[] ai=new double[ln];
        for (int i=0;i<ln;i++){
            ai[i]=scanner.nextDouble();
            sum+=ai[i];
            count++;
        }
        System.out.println(sum/count);
    }
}
