package oop.dz.part3_1.task1;
import java.util.Random;

/**
 * сделал random полем, чтобы не создавать каждый раз заново при вызове status
 *
 * 1. Ќеобходимо реализовать класс Cat.
 * ” класса должны быть реализованы следующие приватные методы:
 * ? sleep() Ч выводит на экран УSleepФ
 * ? meow() Ч выводит на экран УMeowФ
 * ? eat() Ч выводит на экран УEatФ
 * » публичный метод:
 * status() Ч вызывает один из приватных методов случайным образом
 */
public class Cat {
    Random random;
    Cat(){
        this.random=new Random();
    }
    private void sleep(){
        System.out.println("Sleep");
    }
    private void meow(){
        System.out.println("Meow");
    }
    private void eat(){
        System.out.println("Eat");
    }
    public void status(){
//        Random r = new Random();
        int n = random.nextInt(3) + 1;// 1-3
        //System.out.println(n);
        switch (n) {
            case 1 -> this.meow();
            case 2 -> this.eat();
            case 3 -> this.sleep();
            default -> this.eat();
        };

    }








}
