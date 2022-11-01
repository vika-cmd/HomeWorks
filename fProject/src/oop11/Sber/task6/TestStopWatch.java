package oop11.Sber.task6;

public class TestStopWatch {
    public static void main(String[] args) {
//        int size = 100000;
        int size = 200;

        double[] list = new double[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random() * list.length;
        }

        StopWatch stopWatch = new StopWatch();
        selectionSort(list);
        stopWatch.stop();

        System.out.println("Время сортировки равно " +
                stopWatch.getElapsedTime() + " мс");
    }

    /** Сортирует числа методом выбора */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Найти наименьший элемент в list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Переставить list[i] и list[currentMinIndex] при необходимости
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}

class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime = startTime;

    public StopWatch() {
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
