package oop1.mind.palindrom;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s;
        int low, high;
        boolean isPalindrome;

        Scanner input = new Scanner(System.in);

        // ѕолучить строку
        System.out.print("¬ведите строку без пробелов: ");
        s = input.nextLine();

        // »нициализировать индекс начала строки
        low = 0;

        // »нициализировать индекс конца строки
        high = s.length() - 1;

        // ѕроверить строку на палиндром
        isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        // ќтобразить, €вл€етс€ ли строка палиндромом
        if (isPalindrome)
            System.out.println(s + " €вл€етс€ палиндромом");
        else
            System.out.println(s + " не €вл€етс€ палиндромом");
    }
}