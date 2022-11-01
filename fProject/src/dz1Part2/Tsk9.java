package dz1Part2;

import java.util.Scanner;

/**
 * ј правда ли, что тригонометрическое тождество (sin^2(x)+
 * cos^2(x) - 1 == 0) всегда-всегда выполн€етс€?"
 * Ќапишите программу, котора€ провер€ет, что при любом x на входе
 * тригонометрическое тождество будет выполн€тьс€ (то есть будет выводить true
 * при любом x).
 * ќграничени€:
 * -1000 < x < 1000
 *  90 0 200  true
 */
public class Tsk9 {
    public static void main(String[] args) {
        int x;
        //int x = 200;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        double formula = Math.sin(x)*Math.sin(x)+Math.cos(x)*Math.cos(x)-1;
        System.out.println(formula < 1e-15);

    }
}
