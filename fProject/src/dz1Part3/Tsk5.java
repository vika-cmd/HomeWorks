package dz1Part3;

import java.util.Scanner;

/**
 * ���� ������������� ����������� ����� m � n.
 * ����� ������� �� ������� m �� n, �� �������� �������� ������ �������
 */
public class Tsk5 {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner=new Scanner(System.in);
        m=scanner.nextInt();
        n=scanner.nextInt();
        System.out.println(m-(m/n)*n);

    }
}
