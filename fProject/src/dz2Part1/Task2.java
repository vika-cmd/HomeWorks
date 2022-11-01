package dz2Part1;


import java.util.Arrays;
import java.util.Scanner;


/**
 * �� ���� �������� ����� N � ����� �������.
 * ����� ���������� ������ ����� ����� (ai) �� N ���������.
 * ����� ����� ���������� ���������� ������ ������ (aj) ����� M.
 * ���������� ������� �� ����� true, ���� ��� ������� ��������� (�� ���� �������� ���������� ���������� ���������
 * � ��� ������� i == j ������� ai == aj). ����� ������� false.
 * ������ ������� ������
 * 7
 * 1 2 3 4 5 6 7
 * 7
 * 1 2 3 4 5 6 7
 * ������ �������� ������
 * True
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] ai1,ai2;
        ai1 =createArray(scanner);
        ai2 =createArray(scanner);
        System.out.println(Arrays.equals(ai1,ai2));
    }

    private static int[] createArray(Scanner scanner) {
        int[] ai;
        int n;
        n= scanner.nextInt();
        ai=new int[n];
        for(int j=0;j<n;j++){
            ai[j]= scanner.nextInt();
        }
        return ai;
    }

}
