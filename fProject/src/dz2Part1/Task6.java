package dz2Part1;

import java.util.Scanner;

/**
 * ?????? ?????
 * ?? ???? ???????? ?????? S, ????????? ?????? ?? ??????? ????????? ???? (??? ?).
 * ????????? ??????????? ?????, ??????? ???????? ?????????? ?????? ? ??????? ?????? ????? ? ????? ??????? ????????? ??
 * ?????. ???????? ???? ???? ????? ????????.
 *
 * ??? ???????? ??????????? ?????? ? ?????? ????? ????:
 * {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"}
 */
public class Task6 {
    public static void main(String[] args) {
        int offset=0;
        String[] arrMorze={".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-",
                "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};
        Scanner scanner=new Scanner(System.in);
        String st=scanner.nextLine();
        //String st="??????";
        int len=st.length();
        char[] arrChar=new char[len];
        for (int i=0;i<len;i++){
            arrChar[i]=st.charAt(i);
        }

        for (int i=0;i<len;i++){
            offset=(int)(arrChar[i])-1040;
            System.out.print(arrMorze[offset]+" ");
        }

    }
}
