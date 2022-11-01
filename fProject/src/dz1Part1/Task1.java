package dz1Part1;

import java.util.Scanner;

/**
 * Вычислите и выведите на экран объем шара, получив его радиус r с консоли
 * V = 4/3 * pi * r^3  ,  0 < r < 100
 */
public class Task1 {
    public static void main(String[] args) {
        int rad;
        double v;

        Scanner scanner=new Scanner(System.in);
        rad=scanner.nextInt();
        v = (4D / 3) * Math.PI * Math.pow(rad, 3);
        System.out.println(v);
        //9 - 3053.6280592892786  25 - 65449.84694978735

    }
}
