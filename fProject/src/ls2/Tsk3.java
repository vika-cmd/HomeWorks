package ls2;

import java.util.Scanner;

/**
 * (1 балл) Петя снова пошел на работу. С сегодняшнего дня он решил ходить на
 * обед строго после полудня. Периодически он посматривает на часы (x - час,
 * который он увидел). Помогите Пете решить, пора ли ему на обед или нет. Если
 * время больше полудня, то вывести "Пора". Иначе - “Рано”.
 * Ограничения:
 * 0 <= n <= 23
 */
public class Tsk3 {
    public static void main(String[] args) {
        int ar;
        Scanner scanner=new Scanner(System.in);
        ar=scanner.nextInt();
        if(ar>12){
            System.out.println("Пора");
        }
        else {
            System.out.println("Рано");
        }

    }
}
