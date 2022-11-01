package dz1Part1;

import java.util.Scanner;

/**
 * На вход подается количество секунд, прошедших с начала текущего дня – count.
 * Выведите в консоль текущее время в формате: часы и минуты (0 < count < 86400)
 */
public class Task4 {
    public static void main(String[] args) {
        int count,h,m;
        Scanner scanner=new Scanner(System.in);
        count=scanner.nextInt();
        h=(int)count/60/60;
        m=(int)((count-h*60*60)/60);
        //System.out.printf("текущее время : %d час. %d мин.",h,m);
        System.out.println(h+" "+m);

    }

}
