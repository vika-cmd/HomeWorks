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
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        f(n);
    }
    static void f(int n){
        if(n>10){
            f(n/10);
            System.out.print(n);
        }
        else{
            f(n%10);
            System.out.println(n);
        }

    }

}
