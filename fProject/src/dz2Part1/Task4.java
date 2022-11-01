package dz2Part1;

import java.util.Scanner;

/**
 * ���������� ��������� ���������
 * �� ���� �������� ����� N � ����� �������.
 * ����� ���������� ������ ����� ����� (ai) �� N ���������, ��������������� �� �����������.
 *
 * ���������� ������� �� ����� ��������� ������� ����������� ��������� ���������.
 * ������ ������ ������ ��������� ���������� ��������� � ��� ������� ����� ������.
 * ������ ������� ������
 * 6
 * 7 7 7 10 26 26
 * ������ �������� ������
 * 3 7
 * 1 10
 * 2 26
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ai=new int[n];
        for (int i=0;i<n;i++){
            ai[i]=scanner.nextInt();
        }

        int count;
        for (int i=0;i<n;i++){
            if(ai[i]==0){
                continue;
            }
            count=1;
            for (int j=i+1;j<n;j++){
                if(ai[j]==ai[i]){
                    count++;
                    ai[j]=0;
                }
            }
            System.out.println(count+ " "+ai[i]);
        }
    }
}
