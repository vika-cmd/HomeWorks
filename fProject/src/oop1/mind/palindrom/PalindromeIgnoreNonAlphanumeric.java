package oop1.mind.palindrom;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    /** ����� main */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // �������� (�� ������������) ������
        System.out.print("������� ������: ");
        String s = input.nextLine();

        // ���������� ���������
        System.out.println("��������� �� ��������-�������� �������, \n"
                + "�������� �� �" + s + "� �����������? " + isPalindrome(s));
    }

    /** ���������� true, ���� ������ �������� ����������� */
    public static boolean isPalindrome(String s) {
        // ������� ����� ������, ������ �� ��������-�������� �������
        String s1 = filter(s);

        // ������� ����� ������, ���������� �������� ������ s1
        String s2 = reverse(s1);

        // ��������, ��������� �� �������� ������ � ��������
        return s2.equals(s1);
    }

    /** ������� ����� ������, ������ �� ��������-�������� ������� */
    public static String filter(String s) {
        // ������� ������ ���� StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        // ��������� ������ ������ � ������ ��� �������� ��������-���������
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }

        // ������� ����� ��������������� ������
        return stringBuilder.toString();
    }

    /** ������� ����� ������, ���������� �������� ��������� */
    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse(); // �������� ����� reverse() ������ StringBuilder
        return stringBuilder.toString();
    }
}