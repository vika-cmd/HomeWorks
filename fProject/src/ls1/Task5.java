package ls1;

import java.util.Scanner;
/**
 * Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров). На вход
 * подается количество дюймов, выведите количество сантиметров
 * (0 < count < 1000)
 */
public class Task5 {
    public static void main(String[] args) {
        int d;
        double s;
        Scanner scanner=new Scanner(System.in);
        d=scanner.nextInt();
        s=d*2.54;
        System.out.println(s);
        //12 - 30.48  99 - 251.46

    }
}
