package oop11.Sber.task5;

import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Год равен " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Месяц равен " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("День равен " + calendar.get(GregorianCalendar.DATE));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Год равен " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Месяц равен " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("День равен " + calendar.get(GregorianCalendar.DATE));
    }
}