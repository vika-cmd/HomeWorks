package dz2Part1;

import java.util.Scanner;

/**
 * 8. ����� ���������
 * �� ���� �������� ����� N � ����� �������. ����� ���������� ������ ����� ����� (ai) �� N ���������.
 * ����� ����� ���������� ����� M.
 * ���������� ����� � ������� �����, ����������� ������� � M (�.�. ����� �����, ��� �������� |ai - M| �����������).
 * ���� �� ���������, �� ������� ������������ �����.
 *������ ������� ������
 * 6
 * -10 9 -5 -6 1 -3
 * -4
 * ������ �������� ������
 * -3
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ai=new int[n];
        for (int i=0;i<n;i++){
            ai[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();

        int minOffset=Math.abs(m), currentOffset, e=0;
        for (int i=0;i<n;i++){
            currentOffset=Math.abs(ai[i]-m);
            //System.out.println(currentOffset);
            if(currentOffset<=minOffset){
                minOffset=currentOffset;
                //System.out.println(minOffset);
                e=ai[i];
            }
        }
        System.out.println(e);


//        System.out.println(Math.abs(-11));



    }
}
