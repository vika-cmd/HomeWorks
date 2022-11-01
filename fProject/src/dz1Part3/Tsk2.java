package dz1Part3;

import java.util.Scanner;

/**
 * На вход подается два положительных числа m и n.
 * Найти сумму чисел между m и n включительно.
 *
 * Ограничение:
 * 0 < m, n < 10
 * m < n
 */
public class Tsk2 {
    public static void main(String[] args) {
        int m,n,low,high,total=0;
        Scanner scanner=new Scanner(System.in);
        m= scanner.nextInt();
        n= scanner.nextInt();
        if(n<=m){
            low=n;
            high=m;
        }
        else {
            low=m;
            high=n;
        }
        for (int i=low;i<=high;i++){
            total+=i;
        }
        System.out.println(total);
    }
}
