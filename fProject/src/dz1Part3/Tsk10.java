package dz1Part3;

import java.util.Scanner;

/**
 * ������� �� ����� "������" �� ������� ������� (#) �������� ������ N.
 * �� N + 1 ������ � "������" ������ ���� ��������� ����� �� ������� |
 */
public class Tsk10 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();

        for(int i=n;i>0;i--){
            for (int j=1;j<n;j++){
                System.out.print("_");
            }
            System.out.println("#");

        }
    }
}
/*
for(int i=n;i>0;i--){
            for (int j=1;j<n;j++){
                System.out.print("_");
            }
            System.out.println("#");

        }
 */


