package ls1;

import java.util.Scanner;

/**
 * На вход подается два целых числа a и b. Вычислите и выведите среднее
 * квадратическое a и b , (0 < a, b < 100)
 */
public class Task2 {

    public static void main(String[] args) {
        int a,b;
        double res;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        res=Math.sqrt((double) 1/2*(a*a+b*b));
        System.out.println(res);


        /*
        int a,b,cnt;
        double sred,disp,d,standDev;
        cnt=2;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        sred=(a+b)/cnt;
        d=(Math.pow(a-sred,2)+Math.pow(b-sred,2))/cnt;
        standDev=Math.sqrt(d);
        System.out.println(standDev);

         */

        /*int b1=10,b2=8,b3=10,b4=8,b5=8,b6=4;
        int cnt=6;
        double sred=(b1+b2+b3+b4+b5+b6)/cnt;//8
        double d=(Math.pow(b1-sred,2)
                +Math.pow(b2-sred,2)
                +Math.pow(b3-sred,2)
                +Math.pow(b4-sred,2)
                +Math.pow(b5-sred,2)
                +Math.pow(b6-sred,2))/(cnt-1);
        System.out.println(d);//4.8
        double standDev=Math.sqrt(d);
        System.out.println(standDev);//2.1908902300206643int b1=10,b2=8,b3=10,b4=8,b5=8,b6=4;
        int cnt=6;
        double sred=(b1+b2+b3+b4+b5+b6)/cnt;//8
        double d=(Math.pow(b1-sred,2)
                +Math.pow(b2-sred,2)
                +Math.pow(b3-sred,2)
                +Math.pow(b4-sred,2)
                +Math.pow(b5-sred,2)
                +Math.pow(b6-sred,2))/(cnt-1);
        System.out.println(d);//4.8
        double standDev=Math.sqrt(d);
        System.out.println(standDev);//2.1908902300206643

         */




        //sred=(double) (a+b)/cnt;

//        System.out.println(sred);
//        //disp=Math.sqrt((Math.pow((a-sred),2)+Math.pow((b-sred),2))/cnt);
//        disp=Math.sqrt((Math.pow((a-sred),2)+Math.pow((b-sred),2)))/cnt;
//        //disp=Math.sqrt((Math.pow((a-sred),2)+Math.pow((b-sred),2))/(cnt-1));
//        System.out.println(disp);
        //35 5- 25.0   23 70 - 52.100863716449076
        //15    23.50531854708632



    }

}
