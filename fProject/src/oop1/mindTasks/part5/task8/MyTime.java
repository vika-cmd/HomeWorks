package oop1.mindTasks.part5.task8;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Задание №8: Класс MyTime
 * Создайте класс MyTime для представления времени. Класс MyTime должен содержать:
 * o	Поля данных hour, minute и second, которые представляют время.
 * o	Безаргументный конструктор, который создает объект типа MyTime для текущего времени. (Значения полей данных
 *          этого объекта представляют текущее время.)
 * o	Конструктор, который создает объект типа MyTime с указанным временем в миллисекундах, прошедших с 00:00,
 *          1 января 1970 г. (Значения полей данных этого объекта будут представлять это время.)
 * o	Конструктор, который создает объект типа MyTime с указанными часами, минутами и секундами.
 * o	Три getter-метода для полей данных hour, minute и second соответственно.
 *
 * o	Метод с именем setTime(long elapseTime), который присваивает объекту новое время с помощью прошедшего времени.
 * Например, если прошедшее время равно 555550000 миллисекундам, то hour равно 10, minute равно 19, а second равно 10.
 * Нарисуйте UML-диаграмму класса MyTime, а затем реализуйте этот класс. Напишите клиент этого класса — программу,
 * которая создает три объекта типа MyTime (с помощью new MyTime(), new MyTime(555550000) и new MyTime(5, 23, 55)) и
 * отображает значениях их полей данных hour, minute и second в формате часы:минуты:секунды.
 * (Подсказка: первые два конструктора извлекут значения hour, minute и second из прошедшего времени.
 * Для безаргументного конструктора текущее время может быть получено с помощью метода System.currentTimeMillis(), как
 * было показано в программе ShowCurrentTime из курса «Основы Java-программирования». Пусть время будет GMT.)
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
