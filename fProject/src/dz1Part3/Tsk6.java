package dz1Part3;

import java.util.Scanner;

/**
 * � ��������� �������� ������ ������ ��������� 8 4 2 1.
 * ���� ������������� ����� n - ���������� ����� ��� �������.
 * ���������� ����� ����������� ���������� ����� � ������� ������� ����� ��������� ��� ���������� �����
 * (�������� �������: ������ ������ ������� ���������� ����� ��������� 8, ������ - 4 � � �).
 * 51 -> 6 0 1 1
 */
public class Tsk6 {
    public static void main(String[] args) {
        int n;
        int a1,a2,a3,a4,ost,ost1;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        a1=n/8;
        //ost=n-a1*8;
        ost=n%8;
//        System.out.println(ost);//3
//        System.out.println(n%8);//3
        a2=ost/4;
        ost=n-a1*8-a2*4;
//        System.out.println(ost);//3

        a3=ost/2;
        ost=n-a1*8-a2*4-a3*2;
        System.out.println(a1+" "+a2+" "+a3+" "+ost);


    }
}
