package oop11.Sber.task1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 40);
        System.out.println("Площадь прямоугольника с шириной " +
                rectangle.width + " и высотой " +
                rectangle.height + " равна " +
                rectangle.getArea());
        System.out.println("Периметр прямоугольника равен " +
                rectangle.getPerimeter());

        Rectangle yourRectangle = new Rectangle(3.5, 35.9);
        System.out.println("Площадь прямоугольника с шириной " +
                yourRectangle.width + " и высотой " +
                yourRectangle.height + " равна " +
                yourRectangle.getArea());
        System.out.println("Периметр прямоугольника равен " +
                yourRectangle.getPerimeter());
    }
}

class Rectangle {
    double width = 1;
    double height = 1;

    public Rectangle() {
    }

    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}