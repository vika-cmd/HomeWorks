package dz2Part2;

import java.util.Scanner;

/**
 * 1. ����������� �������
 * �� ���� ���������� N � ���������� �������� � ��������� ������� � M � ���������� �����.
 * ����� ��� ���������� ��������� ������, ��������� �� ����������� �����.
 * ���������� ��������� � ���������� ������� � ������� �� ����� ����������� ������� ������ ������.
 * ������ ������� ������
 * 3 2                   1 3
 * 10 20 15              30
 * 7 5 9                 42
 *                       15
 * ������ �������� ������
 * 10 5                  30 42 15
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nC=scanner.nextInt();
        int mR=scanner.nextInt();
        int[][] arrw=new int[mR][nC];
        int[] arr=new int[mR];
        int m=0;
        for (int rows=0;rows<mR;rows++){
            for (int columns=0;columns<nC;columns++){
                arrw[rows][columns]=scanner.nextInt();
                if(columns==0){
                    m=arrw[rows][columns];
                }
                else if(arrw[rows][columns]<m){
                    m=arrw[rows][columns];
                }

            }
            //System.out.println(m);
            arr[rows]=m;
        }

        for (int e:arr){
            System.out.print(e+" ");
        }

    }
}
