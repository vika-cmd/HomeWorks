package oop1.mindTasks.part5.task8;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime1=new MyTime();
        System.out.println(myTime1.toString());
        MyTime myTime2=new MyTime(555550000);
        System.out.println(myTime2.toString());
        MyTime myTime3=new MyTime(5, 23, 55);
        System.out.println(myTime3.toString());
    }
}
