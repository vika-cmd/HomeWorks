package dz1Part3;

/**
 * Напечатать таблицу умножения от 1 до 9.
 */
public class Tsk1 {
    public static void main(String[] args) {
        int res;
        for(int j=1;j<10;j++){
            for (int i=1;i<10;i++){
                res=j*i;
                System.out.printf("%d x %d = %d\n",j,i,res);
            }
        }
    }
}
