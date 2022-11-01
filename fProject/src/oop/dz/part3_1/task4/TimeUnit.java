package oop.dz.part3_1.task4;

/**
 * ���������� ����������� ����� TimeUnit � ������������, ��������� ����
 * (����������� ���� ��������� ��������������). ����������� ������ ����
 * ����������� ��������� �� ������� ���������.
 * ������������:
 * ? ����������� ������� TimeUnit, ����� ����, ������ � �������.
 * ? ����������� ������� TimeUnit, ����� ���� � ������. ������� �����
 * ������ ������������ ��������.
 * ? ����������� ������� TimeUnit, ����� ����. ������ � ������� �����
 * ������ ������������ ��������.
 * ��������� ������:
 * ? ������� �� ����� ������������� � ������ ����� � ������� hh:mm:ss
 * ? ������� �� ����� ������������� � ������ ����� � 12-������� �������
 * (��������� hh:mm:ss am/pm)
 * ? �����, ������� ���������� ���������� ����� � �������������� �
 * TimeUnit (�� ���� ���������� ������ ����, ������ � �������)
 */
public class TimeUnit {
    private int hour;
    private int minute;
    private int second;

    public TimeUnit(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public TimeUnit(int h, int m){
        this(h,m,0);
    }

    public TimeUnit(int h){
        this(h,0,0);
    }
    public void addTime(int hour,int minute,int second) {
        long addSec = second + minute * 60L + (long) hour * 60 * 60;
        long currentSec = this.second + this.minute * 60L + (long) this.hour * 60 * 60;
        long totalSec = currentSec + addSec;
        this.hour = (int) (((totalSec / 60) / 60) % 24);
        this.minute = (int) ((totalSec / 60) % 60);
        this.second = (int) (totalSec % 60);
    }

    public void h12(){
        if(hour>12){
            hour=hour-12;
        }
        System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
    }

    public void show() {
        System.out.printf("%02d:%02d:%02d\n",hour,this.minute,this.second);
    }

    //
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
