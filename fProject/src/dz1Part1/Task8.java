package dz1Part1;

import java.util.Scanner;

/**
 * На вход подается баланс счета в банке – n. Рассчитайте дневной бюджет на 30
 * дней
 */
public class Task8 {
    public static void main(String[] args) {
        int b;
        double res;
        Scanner scanner=new Scanner(System.in);
        b=scanner.nextInt();
        System.out.println((double) b/30);
    }
}
