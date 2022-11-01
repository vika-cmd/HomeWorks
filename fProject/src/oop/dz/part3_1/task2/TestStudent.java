package oop.dz.part3_1.task2;

/**
 *
 *
 * ���������� ����������� ����� Student.
 * � ������ ������ ���� ��������� ��������� ����:
 * ? String name � ��� ��������
 * ? String surname � ������� ��������
 * ? int[] grades � ��������� 10 ������ ��������. �� ����� ���� ������, ��
 * �� ����� ���� ������ 10.
 * � ��������� ��������� ������:
 * ? ������/������ ��� name
 * ? ������/������ ��� surname
 * ? ������/������ ��� grades
 * ? �����, ����������� ����� ������ � grades. ����� ������ ������
 * ������ ���� �������, ����� ������ ����������� � ����� ������� (�.�.
 * ������ ������ ���������� �� 1 �����).
 * ? �����, ������������ ������� ���� �������� (�������������� ���
 * ������� �������������� �� ���� ������ � ������� grades)
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student1=new Student("Petr","Petrov",new int[]{1,2,3,4,5,1,2,3,4,5});
        System.out.println(student1.toString());

        Student student2=new Student("Ivan","Ivanov",new int[]{1,2,3,4});
        System.out.println(student2.toString());
        student2.newGrade(8);
        student2.show();
    }
}
