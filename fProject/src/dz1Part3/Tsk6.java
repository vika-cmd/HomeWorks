package dz1Part3;

import java.util.Scanner;

/**
 * В банкомате остались только купюры номиналом 8 4 2 1.
 * Дано положительное число n - количество денег для размена.
 * Необходимо найти минимальное количество купюр с помощью которых можно разменять это количество денег
 * (соблюсти порядок: первым числом вывести количество купюр номиналом 8, вторым - 4 и т д).
 * 51 -> 6 0 1 1
 */
public class Tsk6 {
    public static void main(String[] args) {
        int n;
        int a1,a2,a3,a4,ost,ost1;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        a1=n/8;
        //ost=n-a1*8;
        ost=n%8;
//        System.out.println(ost);//3
//        System.out.println(n%8);//3
        a2=ost/4;
        ost=n-a1*8-a2*4;
//        System.out.println(ost);//3

        a3=ost/2;
        ost=n-a1*8-a2*4-a3*2;
        System.out.println(a1+" "+a2+" "+a3+" "+ost);


    }
}
