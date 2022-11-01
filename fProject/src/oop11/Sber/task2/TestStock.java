package oop11.Sber.task2;

public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.setPreviousClosingPrice(281.50);

        // Присвоить текущую стоимость
        stock.setCurrentPrice(282.87);

        // Отобразить информацию об акциях
        System.out.println("Стоимость на момент закрытия предыдущего дня: " +
                stock.getPreviousClosingPrice());
        System.out.println("Текущая стоимость: " +
                stock.getCurrentPrice());
        System.out.println("Изменение стоимости: " +
                stock.getChangePercent() + "%");
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock() {
    }

    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) /
                previousClosingPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double newCurrentPrice) {
        currentPrice = newCurrentPrice;
    }

    public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
    }
}