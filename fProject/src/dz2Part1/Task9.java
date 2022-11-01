package dz2Part1;

import java.util.Scanner;

/**
 *9. Найти дубликат
 * На вход подается число N — длина массива.
 * Затем передается массив строк из N элементов (разделение через перевод строки).
 * Каждая строка содержит только строчные символы латинского алфавита.
 * Необходимо найти и вывести дубликат на экран.
 * Гарантируется что он есть и только один.
 *Пример входных данных
 * 4
 * hello
 * java
 * hi
 * java
 * Пример выходных данных
 * Java
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] st=new String[n+1];
        for (int i=0;i<n+1;i++){
            st[i]=scanner.nextLine();
            //System.out.println(i+" "+st[i]);
        }
        for (int j=0;j<n+1;++j){
            String bf=st[j];
            for (int i=j+1;i<n+1;i++){
                if(st[j].equals(st[i])){
                    System.out.println(st[j]);
                }
            }


//            System.out.println(j+" "+"aa");//4
        }




//        String[] st=new String[4];
//        String[] st={"aaa","bbb","ccc","ddd"};
//        for (int j=0;j<4;++j){
//            System.out.println(j+" "+st[j]);
//            System.out.println(j+" "+"aa");//4
//        }



        //System.out.println("---");

//        for (String e:st){
//            System.out.println(e);
//        }

    }
}
