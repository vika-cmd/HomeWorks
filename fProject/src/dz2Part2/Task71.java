package dz2Part2;

import java.util.Scanner;

/**
 * 7. ������� �������
 * � ������ ������� � ������� �������� ����� ������, �� ������ - ������ ��������, � ������� � ������ ���� ����� �� ����������� ������ ������.
 * ������� ������� ����� ����� ������ �� �������.
 * �� ���� ������ i-�� ������ ������ � i-�� ������ ������ �������, � �� ������ � � i-�� ������ ������� �������.
 * ����� ������ ���� ���������� ��� 3 ����������� ��������.
 *
 * �� ���� �������� ����� N � ���������� ���������� ��������. ����� � N ������� �������� ����� ������.
 * ����� ����� � N ������� �������� ������ �����.
 * ����� ���������� ������� � N �����, 3 ������������ ����� � ������ � ������ �����.
 * ������������ �������� ��� ���������, ��������� ������������ ������� �������������� �� ������� 3 �����.
 * ���������� ������� ���� ����������� � ������� ���� �������: ������, ������� �������.
 * ������� ������ �������� � ��������� ���� ���� ����� �������.
 *
 * �������������, ��� ������� �������������� ��� ���� ���������� ����� ���������.
 * ������ ������� ������
 * 4
 * ����
 * �������
 * ����
 * �����
 * �����
 * ������
 * ������
 * ������
 * 7 6 7
 * 8 8 7
 * 4 5 6
 * 9 9 9
 * ������ �������� ������
 * �����: ������, 9.0
 * �������: ������, 7.6
 * ����: �����, 6.6
 */
public class Task71 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String[] arr1=new String[n];
        String[] arr2=new String[n];
        double[][] arr3=new double[n][3];
        arr1=fillArr(n,scanner);
        arr2=fillArr(n,scanner);

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr3[i][j]=scanner.nextDouble();
            }
        }
        //show(arr3);
        double[] mArr=new double[n];
        for(int i=0;i<arr3.length;i++){
            double total=0;
            for(int j=0;j<arr3[i].length;j++){
                total=total+arr3[i][j];
//                n=((int)(n*10))/10.0;
                mArr[i]=((int)(total/3*10))/10.0;
            }
        }

//        for (int i=0;i<n;i++){
//            System.out.print(mArr[i]+" ");
//        }
//        System.out.println();

//        double[] sortMarr=new double[n];

        int im1=0,im2=0,im3=0;
        double m1=0,m2=0,m3=0;
        for (int i=0;i<n;i++){
            if(mArr[i]>m1){
                im3=im2; m3=m2;
                im2=im1; m2=m1;
                im1=i; m1=mArr[i];
            }
            if(mArr[i]>m2 && mArr[i]<m1){
                im3=im2; m3=m2;
                im2=i; m2=mArr[i];
            }
            if(mArr[i]>m3 && mArr[i]<m2){
                im3=i; m3=mArr[i];
            }

        }
//        System.out.println("==");
//        System.out.println(im1);
//        System.out.println(im2);
//        System.out.println(im3);
//        System.out.println("==");
//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);
//        System.out.println("==");
        System.out.printf("%s: %s, %.1f\n",arr1[im1],arr2[im1],m1);
        System.out.printf("%s: %s, %.1f\n",arr1[im2],arr2[im2],m2);
        System.out.printf("%s: %s, %.1f\n",arr1[im3],arr2[im3],m3);
//        System.out.println("==");
//        System.out.print(arr1[im1]+": "+arr2[im1]+", "+m1/100*100+"\n");
//        System.out.print(arr1[im2]+": "+arr2[im2]+", "+m2/100*100+"\n");
//        System.out.print(arr1[im3]+": "+arr2[im3]+", "+m3/100*100+"\n");

//        for (int i=0;i<n;i++){
//            System.out.print(mArr[i]+" ");
//        }
//        System.out.println();


//        for (int i=0;i<n;i++){
//            System.out.println(mArr[i]);
//        }
        /*6.666666666666667
        7.666666666666667
        5.0
        9.0         */




    }

    static String[] fillArr(int n,Scanner scanner){
        String[] arr=new String[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextLine();
        }
        return arr;
    }

//    static void show(double[][] arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }



}
