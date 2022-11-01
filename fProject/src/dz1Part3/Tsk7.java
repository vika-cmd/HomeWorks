package dz1Part3;

import java.util.Scanner;

/**
 * Дана строка s.
 * Вычислить количество символов в ней, не считая пробелов (необходимо использовать цикл).
 *
 * Ограничение:
 * 0 < s.length() < 1000
 * Hello world   ->10
 */
public class Tsk7 {
    public static void main(String[] args) {
        String st;
        int lenSt=0;
        Scanner scanner=new Scanner(System.in);
        st=scanner.nextLine();
        for (int i=0;i<st.length();i++){
            if(st.charAt(i)!=' '){
                lenSt++;
            }
        }
        System.out.println(lenSt);


    }
}
