package dz2Part1;

import java.util.Scanner;

/**
 * �����
 * �� ���� �������� ����� N � ����� �������.
 * ����� ���������� ������ ����� ����� (ai) �� N ���������.
 * ����� ����� ���������� ����� M � �������� ������.
 * ���������� ���������� �������� �������� ������� �� M ��������� ������
 * ������ ������� ������
 * 5
 * 38 44 0 -11 2
 * 2
 * ������ �������� ������
 * -11 2 38 44 0
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ai=new int[n];
        for (int i=0;i<n;i++){
            ai[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();

        int[] tm=new int[m];
        int len=ai.length;
        for(int i=0;i<m;i++){
            tm[i]=ai[len-1-i];//
        }

        for (int i=len-1-m;i>=0;i--){
            ai[i+m]=ai[i];
        }

        for(int i=0;i<m;i++){
            ai[i]=tm[m-1-i];
        }

        for(int e:ai){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
