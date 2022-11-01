package dz1Part3;

import java.util.Scanner;

/**
 * �� ���� �������� ��� ������������� ����� m � n.
 * ���������� ��������� m^1 + m^2 + ... + m^n
 *   m2 n=2 2^1+2^2=6
 * �����������:
 * 0 < m, n < 10
 */
public class Tsk3 {

    public static void main(String[] args) {
        double n,m,total=0;
        Scanner scanner=new Scanner(System.in);
        m=scanner.nextDouble();
        n=scanner.nextDouble();

        for (int i=1;i<=n;i++){
            total+=Math.pow(m,i);
        }
        System.out.println((int)total);

    }
}
