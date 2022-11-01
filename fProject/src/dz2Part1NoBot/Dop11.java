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
public class Dop11 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n;
//        n=scanner.nextInt();

//        while (n<8){
//            System.out.printf("Пароль с количеством символов %d небезопасен, введите пароль повторно: \n",n);
//            n=scanner.nextInt();
//        }

        int n=8;
//        char[] pass=new char[n];

        int[] f={0,1,2,3,4,5};
//        System.out.println(f[2]);
        for(int e:f){
            System.out.print(e+" ");
        }
        System.out.println("===");
        mix(f);
//        System.out.println(f[2]);
        for(int e:f){
            System.out.print(e+" ");
        }
        System.out.println("===");

//        int index=0;
//        System.out.println(index);

//        switch (index)
//        {
//            case 0: createLalfa(); break;
//            case 1: createUalfa(); break;
//            case 2: createNum(); break;
//            case 3: createUnderscore(); break;
//            case 4: createAsterisk(); break;
//            case 5: createHyphen(); break;
//        };
        char[] arrf={createLalfa(),
                createUalfa(),
                createNum(),
                createUnderscore(),
                createAsterisk(),
                createHyphen()
        };

        char[] pass=new char[6];


        for (int i=0,j=0;i<6;i++,j++){

            pass[i]=arrf[j];
        }

        for(char e:pass){
            System.out.print(e);
        }
        System.out.println();



    }

    static int[] mix(int[] f){
        for (int i = 0; i < f.length; i++) {
            // Сгенерировать случайный индекс j
            int j = (int) (Math.random() * f.length);
            // Переставить f[i] и f[j]
            int temp = f[i];
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




//        createUalfa(),
//                    createNum(),
//                    createUnderscore(),
//                    createAsterisk(),
//                    createHyphen()



//        switch (index)
//        {
//            case 0: createLalfa(); break;
//            case 1: createUalfa(); break;
//            case 2: createNum(); break;
//            case 3: createUnderscore(); break;
//            case 4: createAsterisk(); break;
//            case 5: createHyphen(); break;
//        };






//        for (int i=0,j=0;i<n;i++){
//            if(j==5){
//                j=0;
//            }
//            pass[i]=arrf[j];
//            j++;
//        }

//        for(char e:pass){
//            System.out.print(e);
//        }
//        System.out.println();
