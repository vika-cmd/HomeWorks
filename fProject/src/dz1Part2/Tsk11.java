package dz1Part2;

import java.util.Scanner;

/**
 * На вход подается три целых положительных числа – длины сторон
 * треугольника. Нужно вывести true, если можно составить треугольник из этих
 * сторон и false иначе.
 * Ограничения:
 * 0 < a, b, c < 100
 *   3 2 1 f   3 4 5 t   2 15 15  t     10 2 7 f
 */
public class Tsk11 {
    public static void main(String[] args) {
        String st;
        int a,b,c,p1,p2;
        boolean res;
        Scanner scanner=new Scanner(System.in);
        st=scanner.nextLine();
        p1=st.indexOf(" ");
        p2=st.indexOf(" ",p1+1);
        a= Integer.parseInt(st.substring(0,p1));
        b= Integer.parseInt(st.substring(p1+1,p2));
        c= Integer.parseInt(st.substring(p2+1));
        res=a+b>c && a+c>b && b+c>a;
        System.out.println(res);
        //System.out.println(a+ " "+b+" "+c);
        //System.out.println(p1);
        //System.out.println(p2);

    }
}
