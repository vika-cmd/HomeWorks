package ls3w;

import java.util.Collections;
import java.util.Scanner;

public class Tsk10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        for(int i=n,j=1;i>0;i--,j++){
            //System.out.println(i +" "+j);
            System.out.print(String.join("", Collections.nCopies(i-1, " ")));
            System.out.println(String.join("", Collections.nCopies(j, "#")));
            j++;

        }
        System.out.print(String.join("", Collections.nCopies(n-1, " ")));
        System.out.println("|");
        //System.out.println(String.join("", Collections.nCopies(j, "#")));
    }
}
