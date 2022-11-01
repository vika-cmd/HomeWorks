package oop.dz.part3_1.task1;
import java.util.Random;

/**
 * ������ random �����, ����� �� ��������� ������ ��� ������ ��� ������ status
 *
 * 1. ���������� ����������� ����� Cat.
 * � ������ ������ ���� ����������� ��������� ��������� ������:
 * ? sleep() � ������� �� ����� �Sleep�
 * ? meow() � ������� �� ����� �Meow�
 * ? eat() � ������� �� ����� �Eat�
 * � ��������� �����:
 * status() � �������� ���� �� ��������� ������� ��������� �������
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
