package dz1Part1;

import java.util.Scanner;

/**
 * На вход подается бюджет мероприятия – n тугриков. Бюджет на одного гостя – k
 * тугриков. Вычислите и выведите, сколько гостей можно пригласить на
 * мероприятие   14185 72 - 197    85177 89 - 957
 */
public class Task9 {
    public static void main(String[] args) {
        int n,k;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        k=scanner.nextInt();
        System.out.println(n/k);

    }
}
