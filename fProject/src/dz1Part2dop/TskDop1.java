package dz1Part2dop;

import java.util.Scanner;

/**
 * (2 балла) У Марата был взломан пароль. Он решил написать программу,которая проверяет его пароль на сложность.
 * В интернете он узнал, что пароль должен отвечать следующим требованиям:
 * ? пароль должен состоять из хотя бы 8 символов;
 *? в пароле должны быть:
 * ? заглавные буквы
 * ? строчные символы
 * ? числа
 * ? специальные знаки(_*-)
 * Если пароль прошел проверку, то программа должна вывести в консоль строку пароль
 * надежный, иначе строку: пароль не прошел проверку
 * Hello_22  пароль надежный      world234  пароль не прошел проверку
 */
public class TskDop1 {
    public static void main(String[] args) {
        String pass;
        //int lenPass;
        //boolean isReliable;
        Scanner scanner=new Scanner(System.in);
        pass=scanner.nextLine();
        //pass="aF9_*-qq";
        //pass="Hello_22";

        boolean isUpp=pass.matches("^.*[A-Z].*$");
        boolean isLow=pass.matches("^.*[a-z].*$");
        boolean isNum=pass.matches("^.*[0-9].*$");
        boolean isSpec1=pass.matches("^.*[_].*$");
        boolean isSpec2=pass.matches("^.*[*].*$");
        boolean isSpec3=pass.matches("^.*[-].*$");

        if(isUpp&&isLow&&isNum&&(isSpec1||isSpec2||isSpec3)&&(pass.length()>7)){
            System.out.println("пароль надежный");
        }
        else {
            System.out.println("пароль не прошел проверку");
        }


    }
}
