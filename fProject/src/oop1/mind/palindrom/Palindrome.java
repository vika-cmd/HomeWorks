package oop1.mind.palindrom;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s;
        int low, high;
        boolean isPalindrome;

        Scanner input = new Scanner(System.in);

        // �������� ������
        System.out.print("������� ������ ��� ��������: ");
        s = input.nextLine();

        // ���������������� ������ ������ ������
        low = 0;

        // ���������������� ������ ����� ������
        high = s.length() - 1;

        // ��������� ������ �� ���������
        isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        // ����������, �������� �� ������ �����������
        if (isPalindrome)
            System.out.println(s + " �������� �����������");
        else
            System.out.println(s + " �� �������� �����������");
    }
}