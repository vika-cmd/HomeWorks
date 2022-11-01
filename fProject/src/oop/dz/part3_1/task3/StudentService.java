package oop.dz.part3_1.task3;

import oop.dz.part3_1.task2.Student;

/**
 *  Необходимо реализовать класс StudentService.
 * У класса должны быть реализованы следующие публичные методы:
 * ? bestStudent() — принимает массив студентов (класс Student из
 * предыдущего задания), возвращает лучшего студента (т.е. который
 * имеет самый высокий средний балл). Если таких несколько — вывести
 * любого.
 * ? sortBySurname() — принимает массив студентов (класс Student из
 * предыдущего задания) и сортирует его по фамилии.
 */
public class StudentService {
    public Student bestStudent(Student[] arr){
        double mx;


        return null;
    }

    public void sortBySurname(Student[] arr){
        for(Student st:arr){
            System.out.println(st.getSurname());
        }

    }

}
