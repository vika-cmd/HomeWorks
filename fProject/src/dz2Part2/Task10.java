package dz2Part2;

import java.util.Scanner;

/**
 * 10. �������� �������
 * �� ���� �������� ����� N.
 * ���������� ������� ����� ����� ������ ������.
 * ������ ������ ����� ����� ��������.
 * ������ ������� ������
 * 12374
 * ������ �������� ������
 * 4 7 3 2 1
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        f(n);
    }
    static void f(int n){
        if(n>0){
            System.out.print(n%10+" ");//4 3 2 1
            f(n/10);
        }
    }
}
