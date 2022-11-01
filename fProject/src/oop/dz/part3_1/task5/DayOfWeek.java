package oop.dz.part3_1.task5;

/**
 * Необходимо реализовать класс DayOfWeek для хранения порядкового номера
 * дня недели (byte) и названия дня недели (String).
 * Затем в отдельном классе в методе main создать массив объектов DayOfWeek
 * длины 7. Заполнить его соответствующими значениями (от 1 Monday до 7
 * Sunday) и вывести значения массива объектов DayOfWeek на экран.
 * Пример вывода:
 * 1 Monday
 * 2 Tuesday
 * …7Sunday
 */
public class DayOfWeek {
    private byte pn;
    private String name;
    public DayOfWeek(byte n,String dweek){
        this.pn=n;
        this.name=dweek;
    }

    public byte getPn() {
        return pn;
    }

    public String getName() {
        return name;
    }
}
