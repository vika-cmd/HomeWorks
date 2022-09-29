import java.util.Locale;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        //final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки
        final double ROUBLES_PER_EUR = 72.12; // курс покупки
        int evro;
        double roubles;

        Scanner input=new Scanner(System.in);

        //Получить сумму денег в евро
        System.out.println("Введите сумму денег в евро: ");
        evro=input.nextInt();

        System.out.println(evro);

        //Конвертировать сумму денег в российские рубли
        roubles=ROUBLES_PER_EUR*evro;

        //Отобразить сумму денег в российских рублях
        System.out.println("Она равна " +(int)(roubles*100)/100.0 +" российского рубля ");

    }
}