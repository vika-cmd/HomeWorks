package ls2;

import java.util.Scanner;

/**
 * �� ���� �������� ������. ����� ������� ��� ������, ���������� �� �������
 * ����������� �� ������� �������
 * Hi great team! Hello world!
 */
public class Tsk7 {
    public static void main(String[] args) {
        String str,s1,s2;
        int i;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        i=str.indexOf(" ");
        //System.out.println(i);
        s1=str.substring(0,i);
        s2=str.substring(i+1);
        System.out.println(s1);
        System.out.println(s2);


    }

}
