package dz1Part1;

import java.util.Scanner;
/**
 * ���������� ����� � ���������� (1 ���� = 2,54 �����������). �� ����
 * �������� ���������� ������, �������� ���������� �����������
 * (0 < count < 1000)
 */
public class Task5 {
    public static void main(String[] args) {
        int d;
        double s;
        Scanner scanner=new Scanner(System.in);
        d=scanner.nextInt();
        s=d*2.54;
        System.out.println(s);
        //12 - 30.48  99 - 251.46

    }
}
