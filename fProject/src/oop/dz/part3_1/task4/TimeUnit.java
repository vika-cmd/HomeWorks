package oop.dz.part3_1.task4;

/**
 * Необходимо реализовать класс TimeUnit с функционалом, описанным ниже
 * (необходимые поля продумать самостоятельно). Обязательно должны быть
 * реализованы валидации на входные параметры.
 * Конструкторы:
 * ? Возможность создать TimeUnit, задав часы, минуты и секунды.
 * ? Возможность создать TimeUnit, задав часы и минуты. Секунды тогда
 * должны проставиться нулевыми.
 * ? Возможность создать TimeUnit, задав часы. Минуты и секунды тогда
 * должны проставиться нулевыми.
 * Публичные методы:
 * ? Вывести на экран установленное в классе время в формате hh:mm:ss
 * ? Вывести на экран установленное в классе время в 12-часовом формате
 * (используя hh:mm:ss am/pm)
 * ? Метод, который прибавляет переданное время к установленному в
 * TimeUnit (на вход передаются только часы, минуты и секунды)
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
