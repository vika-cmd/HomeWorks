package dz1Part2;

import java.util.Scanner;

/**
 * � ������ ��, ��� ������������������ ��������� (sin^2(x)+
 * cos^2(x) - 1 == 0) ������-������ �����������?"
 * �������� ���������, ������� ���������, ��� ��� ����� x �� �����
 * ������������������ ��������� ����� ����������� (�� ���� ����� �������� true
 * ��� ����� x).
 * �����������:
 * -1000 < x < 1000
 *  90 0 200  true
 */
public class Tsk9 {
    public static void main(String[] args) {
        int x;
        //int x = 200;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        double formula = Math.sin(x)*Math.sin(x)+Math.cos(x)*Math.cos(x)-1;
        System.out.println(formula < 1e-15);

    }
}
