package ls1;

import java.util.Scanner;

/**
 * �� ���� �������� ���������� ����� n. �������� �����, ����������
 * ������������� ���� � �������� ����� n. ���� ����� ������������ ����������
 * ������� 0, ��� ����� ���� �������
 */
public class Task7 {
    public static void main(String[] args) {
        //int a,b;
        String a,b,s;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        a= String.valueOf(s.charAt(0));
        b= String.valueOf(s.charAt(1));
        System.out.println(b+a);

    }
}
