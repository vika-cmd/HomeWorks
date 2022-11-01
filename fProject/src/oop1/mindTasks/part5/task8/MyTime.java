package oop1.mindTasks.part5.task8;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * ������� �8: ����� MyTime
 * �������� ����� MyTime ��� ������������� �������. ����� MyTime ������ ���������:
 * o	���� ������ hour, minute � second, ������� ������������ �����.
 * o	�������������� �����������, ������� ������� ������ ���� MyTime ��� �������� �������. (�������� ����� ������
 *          ����� ������� ������������ ������� �����.)
 * o	�����������, ������� ������� ������ ���� MyTime � ��������� �������� � �������������, ��������� � 00:00,
 *          1 ������ 1970 �. (�������� ����� ������ ����� ������� ����� ������������ ��� �����.)
 * o	�����������, ������� ������� ������ ���� MyTime � ���������� ������, �������� � ���������.
 * o	��� getter-������ ��� ����� ������ hour, minute � second ��������������.
 *
 * o	����� � ������ setTime(long elapseTime), ������� ����������� ������� ����� ����� � ������� ���������� �������.
 * ��������, ���� ��������� ����� ����� 555550000 �������������, �� hour ����� 10, minute ����� 19, � second ����� 10.
 * ��������� UML-��������� ������ MyTime, � ����� ���������� ���� �����. �������� ������ ����� ������ � ���������,
 * ������� ������� ��� ������� ���� MyTime (� ������� new MyTime(), new MyTime(555550000) � new MyTime(5, 23, 55)) �
 * ���������� ��������� �� ����� ������ hour, minute � second � ������� ����:������:�������.
 * (���������: ������ ��� ������������ �������� �������� hour, minute � second �� ���������� �������.
 * ��� ��������������� ������������ ������� ����� ����� ���� �������� � ������� ������ System.currentTimeMillis(), ���
 * ���� �������� � ��������� ShowCurrentTime �� ����� ������� Java-�����������������. ����� ����� ����� GMT.)
 */
public class MyTime {
    int hour;
    int minute;
    int second;
    MyTime(){
        this(System.currentTimeMillis());
//        Date date=new Date();
//        System.out.println(System.currentTimeMillis());
    }

    MyTime(long ms){
        this.setTime(ms);
    }

    MyTime(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    void setTime(long elapseTime){
        //60 60 24   second=(int) (elapseTime/1000);//1667_224_253   _863
        int elapseSecond= (int) (elapseTime/1000);
        hour=((elapseSecond/60)/60)%24+3;
        minute=(elapseSecond/60)%60;
        second=elapseSecond%60;
//        System.out.println(hour);
//        System.out.println(minute);
//        System.out.println(second);
    }


    public String toString() {
        return hour +":"+ minute +":" + second;
    }

    //get
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
