package ls2;

import java.util.Scanner;

/**
 * (1 ����) �� ������ ��� ������ ���� �������� �� ����� ������. �� ����
 * �������� ������ ���� �� ��������� ��� ���� (��� ����� ������������� �����).
 * ���� ������������������ ������ ������ ��������� �������, �� ������� "����,
 * ���� ���������"
 * � ��������� ������� ������� "���� �������!"
 */
public class Tsk1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if(a>b && b>c){
            System.out.println("����, ���� ���������");
        }
        else {
            System.out.println("���� �������!");
        }
    }
}
