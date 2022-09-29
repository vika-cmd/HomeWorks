
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int a,b,c;
        double d;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=b*b-4*a*c;
        //System.out.println(d);
        if(d>=0){
            System.out.println("Решение есть");
        }
        else {
            System.out.println("Решения нет");
        }

    }
}
