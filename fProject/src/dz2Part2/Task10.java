package dz2Part2;

import java.util.Scanner;

/**
 * 10. Обратный порядок
 * На вход подается число N.
 * Необходимо вывести цифры числа справа налево.
 * Решить задачу нужно через рекурсию.
 * Пример входных данных
 * 12374
 * Пример выходных данных
 * 4 7 3 2 1
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        f(n);
    }
    static void f(int n){
        if(n>0){
            System.out.print(n%10+" ");//4 3 2 1
            f(n/10);
        }
    }
}
