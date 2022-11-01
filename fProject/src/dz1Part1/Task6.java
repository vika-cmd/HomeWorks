package dz1Part1;

import java.util.Scanner;

/**
 * На вход подается количество километров count. Переведите километры в мили
 * (1 миля = 1,60934 км) и выведите количество миль.
 * 7  - 4.349609156548647   143 - 88.85630134092237
 *
 */
public class Task6 {
    public static void main(String[] args) {
        int k;
        final double ML=1.60934;
        Scanner scanner=new Scanner(System.in);
        k=scanner.nextInt();
        System.out.println(k/ML);

    }
}
