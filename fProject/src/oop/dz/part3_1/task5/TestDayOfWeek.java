package oop.dz.part3_1.task5;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Необходимо реализовать класс DayOfWeek для хранения порядкового номера
 * дня недели (byte) и названия дня недели (String).
 * Затем в отдельном классе в методе main создать массив объектов DayOfWeek
 * длины 7. Заполнить его соответствующими значениями (от 1 Monday до 7
 * Sunday) и вывести значения массива объектов DayOfWeek на экран.
 * Пример вывода:
 * 1 Monday
 * 2 Tuesday
 * …7Sunday
 */
public class TestDayOfWeek {
    public static void main(String[] args) {
        LocalDate dateC = LocalDate.of(2022, 10, 31);
        //System.out.println(dateMon);//2022-10-31
        //System.out.println(dateMon.getDayOfWeek());//MONDAY
        //LocalDate dateC = dateMon.plusDays(1);
        //System.out.println(dateC.getDayOfWeek());

        DayOfWeek[] arr=new DayOfWeek[7];
        String st;
        for(byte i = 0; i<7; i++){
            System.out.println(dateC.getDayOfWeek());
            st= String.valueOf(dateC.getDayOfWeek()).toLowerCase();
            arr[i]=new DayOfWeek((byte) (i+1),st);
            System.out.println(arr[i].getPn());
            System.out.println(arr[i].getName());
            if(i<6){
                dateC=dateC.plusDays(1);
            }


            System.out.println("===");
        }

//        for(byte i=1;i<=7;i++){
//            System.out.println(i+" "+arr[i]);
//        }


//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//        System.out.println(date);
//        System.out.println(dayOfWeek);
//        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);
        /*
        DayOfWeek[] dayOfWeeks=new DayOfWeek[7];
        Date date=new Date();
        System.out.println(date);
//        date.
        Calendar c = Calendar.getInstance();
        c.setTime(date); // yourdate is an object of type Date
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);

         */

    }
}
