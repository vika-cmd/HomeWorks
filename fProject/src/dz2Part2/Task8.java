package dz2Part2;

/**
 * 8. Сумма цифр
 * На вход подается число N.
 * Необходимо посчитать и вывести на экран сумму его цифр.
 * Решить задачу нужно через рекурсию.
 * Пример входных данных
 * 12374
 * Пример выходных данных
 * 17
 */
public class Task8 {
    static int total=0;
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n=scanner.nextInt();
        int m1, m2, c;
        int m = 12345;//15
//        System.out.println(f(m));
        f(m);
    }
    static void f(int m){
        if(m<10){
            System.out.println(total+m);
        }
        else{
            System.out.println(m%10);
            total=total+m%10;
            System.out.println(total);
            System.out.println("==");
            f(m/10);
        }

    }
}


//        m1=m/10;
//        System.out.println(m1);
//        m2=m%10;
//        System.out.println(m2);
//        m1=m1/10;
//        System.out.println(m1);
//        m2=m2%10;
//        System.out.println(m2);
//        System.out.println(m/10);
//        System.out.println(m%10);
//        System.out.println(m/10);
//        System.out.println(m%10);

//        int total=0,bf;
//        while (true){
//            n=n/10;
//            System.out.println(n);
////            bf=n%10;
////            System.out.println(n%10);
//
//        }
