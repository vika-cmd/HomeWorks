package ls2;

import java.util.Scanner;

/**
 * ���� ������ ���� ����� ����� ������ � �����������! � ���� ��� ��
 * ����� ���������, ����� �� ������������ ���������� ��������� ������� ���
 * ���.
 * �� ���� �������� ��� ����� � ������������ ����������� ��������� a, b, c.
 * ����� ������� "������� ����", ���� ��� ���� � "������� ���", ���� ���.
 * �����������:
 * -100 < a, b, c < 100
 * 1 -95 18 Y      46 44 3 Y      34 35 39 N  31 -89 4 Y
 *
 */
public class Tsk5 {
    public static void main(String[] args) {
        int a,b,c;
        double d;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=b*b-4*a*c;
        System.out.println(d);
        if(d>=0){
            System.out.println("������� ����");
        }
        else {
            System.out.println("������� ���");
        }
    }
}
//x=(-b+Math.sqrt(d))/2*a;
