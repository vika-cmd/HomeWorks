package oop1.mind.strng;

public class Ex {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        ex3();
    }

    static void ex3(){
        System.out.println("Hi, ABC, good".matches("ABC "));//false
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));//true
        System.out.println("A,B;C".replaceAll(",;", "#"));//A,B;C
        System.out.println("A,B;C".replaceAll("[,;]", "#"));//A#B#C
        String[] tokens = "A,B;C".split("[,;]");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");//A B C
    }



    //Пусть строка s1 равна " Welcome ", а s2 — " welcome ". Напишите код для следующих предложений:
    //1. Замените все вхождения символа e на E в строке s1 и присвойте эту новую строку строке s3.
    //2. Разделите строку Welcome to Java and HTML на лексемы, отделенные пробелом, и присвойте первые две лексемы строкам s1 и s2.
    static void ex2(){
//        String s1=" Welcome ";
//        String s2=" welcome ";
//
//        String s3=s1.replace("e","E");
//        System.out.println(s1);//Welcome
//        System.out.println(s3);// WElcomE

        String[] st="Welcome to Java and HTML".split(" ");
        String s1=st[0];
        String s2=st[1];




    }

    static void ex1(){
        String s1 = "Welcome to Java";
        String s2 = s1.replace("o", "abc");
        System.out.println(s1);//Welcome to Java
        System.out.println(s2);//Welcabcme tabc Java

    }

}
