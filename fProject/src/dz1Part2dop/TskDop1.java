package dz1Part2dop;

import java.util.Scanner;

/**
 * (2 �����) � ������ ��� ������� ������. �� ����� �������� ���������,������� ��������� ��� ������ �� ���������.
 * � ��������� �� �����, ��� ������ ������ �������� ��������� �����������:
 * ? ������ ������ �������� �� ���� �� 8 ��������;
 *? � ������ ������ ����:
 * ? ��������� �����
 * ? �������� �������
 * ? �����
 * ? ����������� �����(_*-)
 * ���� ������ ������ ��������, �� ��������� ������ ������� � ������� ������ ������
 * ��������, ����� ������: ������ �� ������ ��������
 * Hello_22  ������ ��������      world234  ������ �� ������ ��������
 */
public class TskDop1 {
    public static void main(String[] args) {
        String pass;
        //int lenPass;
        //boolean isReliable;
        Scanner scanner=new Scanner(System.in);
        pass=scanner.nextLine();
        //pass="aF9_*-qq";
        //pass="Hello_22";

        boolean isUpp=pass.matches("^.*[A-Z].*$");
        boolean isLow=pass.matches("^.*[a-z].*$");
        boolean isNum=pass.matches("^.*[0-9].*$");
        boolean isSpec1=pass.matches("^.*[_].*$");
        boolean isSpec2=pass.matches("^.*[*].*$");
        boolean isSpec3=pass.matches("^.*[-].*$");

        if(isUpp&&isLow&&isNum&&(isSpec1||isSpec2||isSpec3)&&(pass.length()>7)){
            System.out.println("������ ��������");
        }
        else {
            System.out.println("������ �� ������ ��������");
        }


    }
}
