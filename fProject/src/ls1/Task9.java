package ls1;

import java.util.Scanner;

/**
 * �� ���� �������� ������ ����������� � n ��������. ������ �� ������ ����� � k
 * ��������. ��������� � ��������, ������� ������ ����� ���������� ��
 * �����������   14185 72 - 197    85177 89 - 957
 */
public class Task9 {
    public static void main(String[] args) {
        int n,k;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        k=scanner.nextInt();
        System.out.println(n/k);

    }
}
