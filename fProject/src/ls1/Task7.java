package ls1;

import java.util.Scanner;

/**
 * На вход подается двузначное число n. Выведите число, полученное
 * перестановкой цифр в исходном числе n. Если после перестановки получается
 * ведущий 0, его также надо вывести
 */
public class Task7 {
    public static void main(String[] args) {
        //int a,b;
        String a,b,s;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        a= String.valueOf(s.charAt(0));
        b= String.valueOf(s.charAt(1));
        System.out.println(b+a);

    }
}
