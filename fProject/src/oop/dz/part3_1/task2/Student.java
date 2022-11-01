package oop.dz.part3_1.task2;

import java.util.Arrays;

/**
 * Необходимо реализовать класс Student.
 * У класса должны быть следующие приватные поля:
 * ● String name — имя студента
 * ● String surname — фамилия студента
 * ● int[] grades — последние 10 оценок студента. Их может быть меньше, но
 * не может быть больше 10.
 * И следующие публичные методы:
 * ● геттер/сеттер для name
 * ● геттер/сеттер для surname
 * ● геттер/сеттер для grades
 * ● метод, добавляющий новую оценку в grades. Самая первая оценка
 * должна быть удалена, новая должна сохраниться в конце массива (т.е.
 * массив должен сдвинуться на 1 влево).
 * ● метод, возвращающий средний балл студента (рассчитывается как
 * среднее арифметическое от всех оценок в массиве grades)
 */
public class Student {
    private String name;
    private String surname;
    int[] grades;

    public Student(String name,String surname, int[] grades){
        this.name=name;
        this.surname=surname;
        this.grades=grades;
    }

    void newGrade(int g){
        for (int i=0;i<(grades.length-1);i++){
            //System.out.print(grades[i]+" ");
            grades[i]=grades[i+1];
        }
        grades[grades.length-1]=g;

    }
    void show(){
        for (int i=0;i<grades.length;i++){
            System.out.print(grades[i]+" ");

        }
    }

    double findMaen(){
        double total=0;
        int count=0;
        for (int e:grades){
            total+=e;
            count++;
        }
        //System.out.println(total/count);
        return total/count;
    }


    //
    public String toString() {
        String st="name:" + name + " surname:" + surname + " mean:"+ findMaen()+" ";
        return st;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
