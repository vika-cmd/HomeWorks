package dz1Part3;

import java.util.Scanner;

/**
 * �� ���� ��������:
 * - ����� ����� n
 * - ����� ����� p
 * - ����� ����� a1, a2 , � an
 * ���������� ��������� ����� ���� ����� a1, a2, a3 � an ������� ������ ������ p.
 * �����������:
 * 0 < m, n, ai < 1000
 * ������ ������� ������
 * 2
 * 18
 * 95 31 *
 * ������ �������� ������
 * 126 *
 * Scanner sc = new Scanner(System.in);
 * String inputLine;
 * while(sc.hasNextLine()) {
 *   inputLine = sc.nextLine();
 *   //parse inputLine however you want, and add to your vector
 * }
 */
public class Tsk8 {
    public static void main(String[] args) {
        int n,p,total=0;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int[] arr=new int[n];
        p=scanner.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            if(arr[i]>p){
                total+=arr[i];
            }
        }
        System.out.println(total);


        //System.out.println(inputLine);
//        while (true){
//            String Line = new String(scanner.nextLine());
//            if(Line.length()==0)
//            {
//                break;
//            }
//            System.out.println(Line);
//        }



    }
}
