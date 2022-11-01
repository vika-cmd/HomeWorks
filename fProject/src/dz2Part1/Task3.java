package dz2Part1;

import java.util.Scanner;

/**
 * Найти индекс
 * На вход подается число N — длина массива.
 * Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.
 * После этого вводится число X — элемент, который нужно добавить в массив, чтобы сортировка в массиве сохранилась.
 * Необходимо вывести на экран индекс элемента массива, куда нужно добавить X.
 * Если в массиве уже есть число равное X, то X нужно поставить после уже существующего.
 * Пример входных данных
 * 6
 * 10 20 30 40 45 60
 * 12
 * Пример выходных данных
 * 1
 */
public class Task3 {
    public static void main(String[] args) {
        int n,x;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int[] ai=new int[n+1];

        for (int i=0;i<n;i++){
            ai[i]=scanner.nextInt();
        }
        x=scanner.nextInt();

        for (int i=ai.length-1;i>0;i--){
            if(x<ai[i-1]){
                ai[i]=ai[i-1];
            }
            else {
                ai[i]=x;
                System.out.println(i);
                break;
            }
        }
//        for (int e:ai){
//            System.out.print(e+" ");
//        }

    }


}
