import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
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
                mArr[i]=((int)(total/3*10))/10.0;
            }
        }


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

//        System.out.printf("%s: %s, %.1f\n",arr1[im1],arr2[im1],m1);
//        System.out.printf("%s: %s, %.1f\n",arr1[im2],arr2[im2],m2);
//        System.out.printf("%s: %s, %.1f\n",arr1[im3],arr2[im3],m3);

        System.out.print(arr1[im1]+": "+arr2[im1]+", "+m1+"\n");
        System.out.print(arr1[im2]+": "+arr2[im2]+", "+m2+"\n");
        System.out.print(arr1[im3]+": "+arr2[im3]+", "+m3+"\n");


    }

    static String[] fillArr(int n,Scanner scanner){
        String[] arr=new String[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextLine();
        }
        return arr;
    }


}
