package dz2Part1;

import java.util.Scanner;

/**
 * 7. ���������� � �������
 * �� ���� �������� ����� N � ����� �������.
 * ����� ���������� ������ ����� ����� (ai) �� N ���������, ��������������� �� �����������.
 * ���������� ������� ������, ���������� �� ��������� ����������� � ������� ������� ��������,
 * ����������� �������� �� ����������� � ������� �� �� �����.
 *������ ������� ������
 * 6
 * -10 -5 1 3 3 8
 * ������ �������� ������
 * 1 9 9 25 64 100
 */
public class Task7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int[] ai=new int[n];
        for (int i=0;i<n;i++){
            int e=scanner.nextInt();
            ai[i]=e*e;
        }
        java.util.Arrays.sort(ai);
        for (int e:ai){
            System.out.print(e+" ");
        }

//        for (int i=0;i<n;i++){
//            System.out.print(ai[i]+" ");
//
//        }
//        System.out.println();





    }
}
