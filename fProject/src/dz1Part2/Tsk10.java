package dz1Part2;

import java.util.Scanner;

/**
 * �������� ���������, ������� ���������, ��� log(e^n) == n ��� ������
 * ������������� n.
 * �����������:
 * -500 < n < 500
 * 1.0  12.34  -42.10  true
 */


public class Tsk10 {
    public static void main(String[] args) {
        double n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextDouble();
        //System.out.println(n);
        double formula=Math.log(Math.exp(n));
        System.out.println(formula-n<1e-15);

        //Math.exp(n);//e^n

    }
}
