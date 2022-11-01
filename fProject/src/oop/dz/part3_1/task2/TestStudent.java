package oop.dz.part3_1.task2;

/**
 *
 *
 * Ќеобходимо реализовать класс Student.
 * ” класса должны быть следующие приватные пол€:
 * ? String name Ч им€ студента
 * ? String surname Ч фамили€ студента
 * ? int[] grades Ч последние 10 оценок студента. »х может быть меньше, но
 * не может быть больше 10.
 * » следующие публичные методы:
 * ? геттер/сеттер дл€ name
 * ? геттер/сеттер дл€ surname
 * ? геттер/сеттер дл€ grades
 * ? метод, добавл€ющий новую оценку в grades. —ама€ перва€ оценка
 * должна быть удалена, нова€ должна сохранитьс€ в конце массива (т.е.
 * массив должен сдвинутьс€ на 1 влево).
 * ? метод, возвращающий средний балл студента (рассчитываетс€ как
 * среднее арифметическое от всех оценок в массиве grades)
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student1=new Student("Petr","Petrov",new int[]{1,2,3,4,5,1,2,3,4,5});
        System.out.println(student1.toString());

        Student student2=new Student("Ivan","Ivanov",new int[]{1,2,3,4});
        System.out.println(student2.toString());
        student2.newGrade(8);
        student2.show();
    }
}
