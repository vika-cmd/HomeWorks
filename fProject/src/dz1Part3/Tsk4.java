package dz1Part3;

import java.util.Scanner;

/**
 * Дано натуральное число n. Вывести его цифры в "столбик".
 */
public class Tsk4 {
    public static void main(String[] args) {
        String n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextLine();
        for (int i=0;i<n.length();i++){
            System.out.println(n.charAt(i));
        }
    }
}
