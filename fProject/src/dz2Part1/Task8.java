package dz2Part1;

import java.util.Scanner;

/**
 * 8. Найти ближайшее
 * На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов.
 * После этого передается число M.
 * Необходимо найти в массиве число, максимально близкое к M (т.е. такое число, для которого |ai - M| минимальное).
 * Если их несколько, то вывести максимальное число.
 *Пример входных данных
 * 6
 * -10 9 -5 -6 1 -3
 * -4
 * Пример выходных данных
 * -3
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ai=new int[n];
        for (int i=0;i<n;i++){
            ai[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();

        int minOffset=Math.abs(m), currentOffset, e=0;
        for (int i=0;i<n;i++){
            currentOffset=Math.abs(ai[i]-m);
            //System.out.println(currentOffset);
            if(currentOffset<=minOffset){
                minOffset=currentOffset;
                //System.out.println(minOffset);
                e=ai[i];
            }
        }
        System.out.println(e);


//        System.out.println(Math.abs(-11));



    }
}
