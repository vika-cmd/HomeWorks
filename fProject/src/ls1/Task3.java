package ls1;

import java.util.Scanner;

/**
 * Прочитайте из консоли имя пользователя и выведите в консоль строку:
 * Привет, <имя пользователя>!
 */
public class Task3 {
    public static void main(String[] args) {
        String userName;
        Scanner scanner=new Scanner(System.in);
        userName=scanner.nextLine();
        System.out.println("Привет, "+userName+"!");

    }

}
