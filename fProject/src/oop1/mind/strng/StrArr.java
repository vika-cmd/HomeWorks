package oop1.mind.strng;

public class StrArr {
    public static void main(String[] args) {
        //toArrCh();
        //arrToStr();
        //ex1();
        //doubleToStr();
        //strToInt();

    }

    static void strToInt(){
        int d=Integer.parseInt("5");
        System.out.println(d+1);//6
    }

    static void doubleToStr(){
        System.out.println(String.valueOf(5.44));//5.44
        String st=String.valueOf(5.8);
        System.out.println(st);//5.8

    }

    static void arrToStr(){
        String str = new String(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(str);//Java

        String str1 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(str1);//Java
    }

    static void ex1(){
        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        // из "CS3720" со 2 по 6-1 - это 3720 вставить в dst с 4-го элемента  Итог dst={'J', 'A', 'V', 'A', '3', '7', '2', '0'}.
        "CS3720".getChars(2, 6, dst, 4);
        System.out.println(dst[5]);//7
    }

    static void toArrCh(){
        //строку в символьный массив
        char[] chars = "Java".toCharArray();
    }


}
