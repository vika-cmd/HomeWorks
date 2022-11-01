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
public class Dop1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();

        while (n<8){
            System.out.printf("Пароль с количеством символов %d небезопасен, введите пароль повторно: \n",n);
            n=scanner.nextInt();
        }
        char[] arrf={createLalfa(),
                    createUalfa(),
                    createNum(),
                    createUnderscore(),
                    createAsterisk(),
                    createHyphen()
                    };


        char[] pass=new char[n];
        for (int i=0,j=0;i<n;i++){
            if(j==5){
                j=0;
            }
            pass[i]=arrf[j];
            j++;
        }

        for(char e:pass){
            System.out.print(e);
        }
        System.out.println();
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
        char c= (char) (i2+'0'-48);
        System.out.println(c);
        return c;
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
