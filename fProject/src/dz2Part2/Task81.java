package dz2Part2;

import java.util.Scanner;

/**
 * 8. ����� ����
 * �� ���� �������� ����� N.
 * ���������� ��������� � ������� �� ����� ����� ��� ����.
 * ������ ������ ����� ����� ��������.
 * ������ ������� ������
 * 12374
 * ������ �������� ������
 * 17
 */
public class Task81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stN = scanner.nextLine();
        int len = stN.length();
        //Character.getNumericValue(
        //System.out.println( Character.getNumericValue(stN.charAt(1))+1);
        int[] arr=new int[len];
        int total=0;
        for (int i=0;i<len;i++){
            //System.out.println();
            arr[i]=Character.getNumericValue(stN.charAt(i));
            total=total+arr[i];
        }

        System.out.println(total);
    }
}
