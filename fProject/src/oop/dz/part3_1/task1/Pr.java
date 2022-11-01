package oop.dz.part3_1.task1;

import java.util.Random;

public class Pr {
    public static void main(String[] args) {
        Random generator1 = new Random(3);
        System.out.print("Из generator1: ");
        for (int i = 0; i < 10; i++)
            //System.out.print(generator1.nextInt(1000) + " ");//734 660 210 581 128 202 549 564 459 961
            //System.out.print(generator1.nextInt(10) + " ");//4 0 0 1 8 2 9 4 9 1
            //System.out.print(generator1.nextInt(3) + " ");//2 2 0 1 0 0 0 1 1 1
            //System.out.print((generator1.nextInt(3-1)+1) + " ");// 2 2 1 2 1 2 2 2 1 2
            System.out.print((generator1.nextInt(3)+1) + " ");// 3 3 1 2 1 1 1 2 2 2

    }
}
