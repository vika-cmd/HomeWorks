package ls3w;

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i < 4) {
            for (int j = i; j > 1; j--){
                System.out.print("_");
            }

            System.out.println("*");
            i++;
        }
    }
}
