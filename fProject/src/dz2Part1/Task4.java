package dz2Part1;

import java.util.Scanner;

/**
 * Количество различных элементов
 * На вход подается число N — длина массива.
 * Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.
 *
 * Необходимо вывести на экран построчно сколько встретилось различных элементов.
 * Каждая строка должна содержать количество элементов и сам элемент через пробел.
 * Пример входных данных
 * 6
 * 7 7 7 10 26 26
 * Пример выходных данных
 * 3 7
 * 1 10
 * 2 26
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ai=new int[n];
        for (int i=0;i<n;i++){
            ai[i]=scanner.nextInt();
        }

        int count;
        for (int i=0;i<n;i++){
            if(ai[i]==0){
                continue;
            }
            count=1;
            for (int j=i+1;j<n;j++){
                if(ai[j]==ai[i]){
                    count++;
                    ai[j]=0;
                }
            }
            System.out.println(count+ " "+ai[i]);
        }
    }
}
