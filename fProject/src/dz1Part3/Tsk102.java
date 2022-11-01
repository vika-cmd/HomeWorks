package dz1Part3;

/**
 * Вывести на экран "ёлочку" из символа решетки (#) заданной высоты N.
 * На N + 1 строке у "ёлочки" должен быть отображен ствол из символа |
 */
public class Tsk102 {
    public static void main(String[] args) {
        int n = 4;
//        Scanner scanner=new Scanner(System.in);
//        n=scanner.nextInt();
        //i 1  2  3  4
        //  _
        for (int i = 1; i <= n; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
}
        /*

        System.out.print("_");
        System.out.print("_");
        System.out.print("_");
        System.out.println("#");

        System.out.print("_");
        System.out.print("_");
        System.out.print("#");
        System.out.print("#");
        System.out.println("#");

        System.out.print("_");
        System.out.print("#");
        System.out.print("#");
        System.out.print("#");
        System.out.print("#");
        System.out.println("#");

        System.out.print("#");
        System.out.print("#");
        System.out.print("#");
        System.out.print("#");
        System.out.print("#");
        System.out.print("#");
        System.out.println("#");
    }
}

         */
/*
for(int i=n;i>0;i--){
            for (int j=1;j<n;j++){
                System.out.print("_");
            }
            System.out.println("#");

        }
 */


