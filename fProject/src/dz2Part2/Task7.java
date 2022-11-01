package dz2Part2;

import java.util.Scanner;

/**
 * 7. Конкурс красоты
 * В первой таблице в системе хранятся имена хозяев, во второй - клички животных, в третьей — оценки трех судей за выступление каждой собаки.
 * Таблицы связаны между собой только по индексу.
 * То есть хозяин i-ой собаки указан в i-ой строке первой таблицы, а ее оценки — в i-ой строке третьей таблицы.
 * Нужно помочь Пете определить топ 3 победителей конкурса.
 *
 * На вход подается число N — количество участников конкурса. Затем в N строках переданы имена хозяев.
 * После этого в N строках переданы клички собак.
 * Затем передается матрица с N строк, 3 вещественных числа в каждой — оценки судей.
 * Победителями являются три участника, набравшие максимальное среднее арифметическое по оценкам 3 судей.
 * Необходимо вывести трех победителей в формате “Имя хозяина: кличка, средняя оценка”.
 * Среднюю оценку выводить с точностью один знак после запятой.
 *
 * Гарантируется, что среднее арифметическое для всех участников будет различным.
 * Пример входных данных
 * 4
 * Иван
 * Николай
 * Анна
 * Дарья
 * Жучка
 * Кнопка
 * Цезарь
 * Добряш
 * 7 6 7
 * 8 8 7
 * 4 5 6
 * 9 9 9
 * Пример выходных данных
 * Дарья: Добряш, 9.0
 * Николай: Кнопка, 7.6
 * Иван: Жучка, 6.6
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String[] arr1=new String[n];
        String[] arr2=new String[n];
        double[][] arr3=new double[n][3];
        arr1=fillArr(n,scanner);
        arr2=fillArr(n,scanner);

//        for (int i=0;i<n;i++){
//            System.out.println(arr1[i]);
//        }
//        for (int i=0;i<n;i++){
//            System.out.println(arr2[i]);
//        }

       for (int i=0;i<n;i++){
           for (int j=0;j<3;j++){
               arr3[i][j]=scanner.nextDouble();
           }
       }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<3;j++){
//                System.out.print(arr3[i][j]+" ");
//
//            }
//            System.out.println();
//        }

       double[] arrMid=new double[n];
       double max1=0,max2=0,max3=0;
        for (int i=0;i<n;i++){
            double mid=0,total=0;
            for (int j=0;j<3;j++){
                total=total+arr3[i][j];
    //                System.out.print(arr3[i][j]);
            }
            arrMid[i]=total/3;
            if(arrMid[i]>max3 && arrMid[i]>max2&& arrMid[i]>max1){
                max3=max2;
                max2=max1;
                max1=arrMid[i];
            }
            if(arrMid[i]>max3 && arrMid[i]>max2){
                max3=max2;
                max2=arrMid[i];
            }
            if(arrMid[i]>max3){
                max3=arrMid[i];
            }
            System.out.println(max1+" "+arrMid[i]+" "+arr1[i] +" "+arr2[i]);
            System.out.println(max2+" "+arrMid[i]+" "+arr1[i] +" "+arr2[i]);
            System.out.println(max3+" "+arrMid[i]+" "+arr1[i] +" "+arr2[i]);
        }

    }

    static String[] fillArr(int n,Scanner scanner){
        String[] arr=new String[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextLine();
        }
        return arr;
    }

}
