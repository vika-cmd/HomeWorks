package oop1.mind.strng;

public class ExCreate {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        ex3();

    }

    static void ex1(){
        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
        String message = new String(charArray);
        System.out.println(message);

        System.out.println(new String(new char[]{'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'}));

    }
    static void ex2(){
        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";
        System.out.println("s1 == s2 равно " + (s1 == s2));//s1 == s2 равно false
        System.out.println(s1.equals(s2));//true
        System.out.println("s1 == s3 равно " + (s1 == s3));//s1 == s3 равно true

    }

    static void ex3(){
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//true
        System.out.println("===");
        System.out.println("Welcome to Java".replace("Java", "HTML"));//Welcome to HTML
        System.out.println(s1.replace('o', 'T'));//WelcTme tT Java
        System.out.println(s1.replaceAll("o", "T"));//WelcTme tT Java
        System.out.println(s1.replaceFirst("o", "T"));//WelcTme to Java
        System.out.println(s1.toCharArray());//Welcome to Java
        System.out.println(s1.toCharArray()[2]);//l

        /*
        1. s1 == s2
        2. s1 == s3
        3. s1 == s4
        4. s1.equals(s3)
        5. s1.equals(s4)
        6. "Welcome to Java".replace("Java", "HTML")
        7. s1.replace('o', 'T')
        8. s1.replaceAll("o", "T")
        9. s1.replaceFirst("o", "T")
        10. s1.toCharArray()
         */


    }

}
