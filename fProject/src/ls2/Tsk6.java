package ls2;

import java.util.Scanner;

/**
 * �� ���� �������� ������������� ����� ����� count - ���������� ���������
 * ����������� ����. ����� ������� ������ ������ ������������� ��� ����������
 */
public class Tsk6 {
    public static void main(String[] args) {
        int count;
        Scanner scanner=new Scanner(System.in);
        count=scanner.nextInt();
        if(count<500){
            System.out.println("beginner");
        }
        else if (count>=500 && count<1500) {
            System.out.println("pre-intermediate");
        }
        else if (count>=1500 && count<2500) {
            System.out.println("intermediate");
        }
        else if (count>=2500 && count<3500) {
            System.out.println("upper-intermediate");
        }
        else if ( count>=3500) {
            System.out.println("fluent");
        }


    }
}
