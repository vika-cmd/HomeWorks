package oop1.mind.strng;

/**
 *  ������ ������ replace(), replaceFirst() � replaceAll() ���������� ����� ������
 *  "Welcome".replaceFirst("e", "AB")
 *  ���������� ��������� (regular expression, ����. regex)    ����� matches()
 *
 */
public class ExChange {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        ex4();

    }
    static void ex4(){

    }

    static void ex3(){
        System.out.println("Java".matches("Java"));//true
        "Java".matches("Java");
        "Java".equals("Java");

//        all 3 =true
//        "Java is fun".matches("Java.*")
//        "Java is cool".matches("Java.*")
//        "Java is powerful".matches("Java.*")



    }

    static void ex2(){
        String[] tokens = "Java#HTML#Perl".split("#");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " "); //  Java HTML Perl
    }

    static void ex1(){
//        "Welcome".replace('e', 'A') ���������� ����� ������        WAlcomA
//        "Welcome".replaceFirst("e", "AB") ���������� ����� ������  WABlcome
//        "Welcome".replace("e", "AB") ���������� ����� ������       WABlcomAB
//        "Welcome".replace("el", "AB") ���������� ����� ������      WABcome
        System.out.println("Welcome".replace('e', 'A'));
        System.out.println("Welcome".replaceFirst("e", "AB"));

    }
}
