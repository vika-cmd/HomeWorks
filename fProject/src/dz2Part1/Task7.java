package dz2Part1;

import java.util.Scanner;

/**
 * 7. Возведение в квадрат
 * На вход подается число N — длина массива.
 * Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.
 * Необходимо создать массив, полученный из исходного возведением в квадрат каждого элемента,
 * упорядочить элементы по возрастанию и вывести их на экран.
 *Пример входных данных
 * 6
 * -10 -5 1 3 3 8
 * Пример выходных данных
 * 1 9 9 25 64 100
 */
public class Task7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int[] ai=new int[n];
        for (int i=0;i<n;i++){
            int e=scanner.nextInt();
            ai[i]=e*e;
        }
        java.util.Arrays.sort(ai);
        for (int e:ai){
            System.out.print(e+" ");
        }

//        for (int i=0;i<n;i++){
//            System.out.print(ai[i]+" ");
//
//        }
//        System.out.println();





    }
}
