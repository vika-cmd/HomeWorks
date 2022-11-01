package oop.dz.part3_1.task1;

/**
 *
 *
 * 1. Ќеобходимо реализовать класс Cat.
 * ” класса должны быть реализованы следующие приватные методы:
 * ? sleep() Ч выводит на экран УSleepФ
 * ? meow() Ч выводит на экран УMeowФ
 * ? eat() Ч выводит на экран УEatФ
 * » публичный метод:
 * status() Ч вызывает один из приватных методов случайным образом
 */
public class TestCat {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.status();
    }
}
