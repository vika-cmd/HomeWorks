package dz2Part2;

import java.util.Scanner;

/**
 * ������� �����
 * �� ���� �������� ����� N.
 * ���������� ������� ����� ����� ����� �������.
 * ������ ������ ����� ����� ��������.
 * ������ ������� ������
 * 12374
 * ������ �������� ������
 * 1 2 3 7 4
 */
public class Task91 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        f(n);
    }
    static void f(int n){
        //n      123  12  1
        //prn     3   2   1
        //stak n= 123  12  1   12   123
        //                 1   2     1
        //System.out.print(n%10+" ");
        if (n > 10) {
            f(n/10);
        }
        System.out.print(n%10+" ");
    }
}
