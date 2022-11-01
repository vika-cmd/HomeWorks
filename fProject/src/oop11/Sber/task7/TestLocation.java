package oop11.Sber.task7;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество строчек и столбцов массива: ");
        int numberOfRows = input.nextInt();
        int numberOfColumns = input.nextInt();

        double[][] a = new double[numberOfRows][numberOfColumns];

        System.out.println("Введите массив: ");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = input.nextDouble();

        Location location = locateLargest(a);
        System.out.println("Наибольший элемент массива, равный "
                + location.maxValue + ", находится в позиции("
                + location.row + ", " + location.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();

        location.maxValue = a[0][0];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                if (location.maxValue < a[i][j]) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }

        return location;
    }
}

class Location {
    public int row, column;
    public double maxValue;
}