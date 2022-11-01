package oop.dz.part3_1.task5;

/**
 * ���������� ����������� ����� DayOfWeek ��� �������� ����������� ������
 * ��� ������ (byte) � �������� ��� ������ (String).
 * ����� � ��������� ������ � ������ main ������� ������ �������� DayOfWeek
 * ����� 7. ��������� ��� ���������������� ���������� (�� 1 Monday �� 7
 * Sunday) � ������� �������� ������� �������� DayOfWeek �� �����.
 * ������ ������:
 * 1 Monday
 * 2 Tuesday
 * �7Sunday
 */
public class DayOfWeek {
    private byte pn;
    private String name;
    public DayOfWeek(byte n,String dweek){
        this.pn=n;
        this.name=dweek;
    }

    public byte getPn() {
        return pn;
    }

    public String getName() {
        return name;
    }
}
