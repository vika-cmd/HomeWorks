package dz2Part1NoBot;

import java.util.Scanner;

/**
 * 1. (2 балла) Создать программу генерирующую пароль.
 * На вход подается число N — длина желаемого пароля. Необходимо проверить,
 * что N >= 8, иначе вывести на экран "Пароль с N количеством символов
 * небезопасен" (подставить вместо N число) и предложить пользователю еще раз
 * ввести число N.
 * Если N >= 8 то сгенерировать пароль, удовлетворяющий условиям ниже и
 * вывести его на экран. В пароле должны быть:
 * ● заглавные латинские символы
 * ● строчные латинские символы
 * ● числа
 * ● специальные знаки(_*-)
 */
public class Dop12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        while (n<8){
            System.out.printf("Пароль с количеством символов %d небезопасен, введите пароль повторно: \n",n);
            n=scanner.nextInt();
        }

        char[] pass=createPass(n);
//        for(char e:pass){
//            System.out.print(e);
//        }
//        System.out.println();
        mix(pass);
        for(char e:pass){
            System.out.print(e);
        }

    }

    static char[] createPass(int n){
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=switch (i) {
                case 0 -> createLalfa();
                case 1 -> createUalfa();
                case 2 -> createUnderscore();
                case 3 -> createNum();
                case 4 -> createAsterisk();
                case 5 -> createHyphen();
                default -> createNum();
            };
        }
        return arr;
    }

    static char[] mix(char[] f){
        for (int i = 0; i < f.length; i++) {
            // Сгенерировать случайный индекс j
            int j = (int) (Math.random() * f.length);
            // Переставить f[i] и f[j]
            char temp = f[i];
            f[i] = f[j];
            f[j] = temp;
        }
        return f;
    }

    // 'a'- 'z'
    static char createLalfa(){
        int i=97+(int)(Math.random() * 26);//a-z   97='a' 122  97+25=122  97.. 122   122-97=25
        return (char) i;
    }

    // 'A'- 'Z'
    static char createUalfa(){
        int i1=65+(int)(Math.random() * 26); //A-Z  65-90
        return (char) i1;
    }

    //0 - 9
    static char createNum(){
        int i2=(int)(Math.random()*10);//0 - 9
//        System.out.println(i2);
//        System.out.println((char) i2);
//        System.out.println((char) i2+'0'-48);
//        char cc= (char) (i2+'0'-48);
//        System.out.println(cc);
//        return cc;
        return (char) ('0'+i2);
    }
    // _
    static char createUnderscore(){
        return (char) 95;
    }

    // *
    static char createAsterisk(){
        //System.out.println((int)'*');//42
        return (char) 42;
    }

    // -
    static char createHyphen(){
        return (char) 45;
    }
}
