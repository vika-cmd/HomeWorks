package dz1Part3;

import java.util.Scanner;

/**
 * ƒаны положительные натуральные числа m и n.
 * Ќайти остаток от делени€ m на n, не выполн€€ операцию вз€ти€ остатка
 */
public class Tsk5 {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner=new Scanner(System.in);
        m=scanner.nextInt();
        n=scanner.nextInt();
        System.out.println(m-(m/n)*n);

    }
}
