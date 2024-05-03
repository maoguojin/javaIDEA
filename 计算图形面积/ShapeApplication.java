package 计算图形面积;

import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    private double bottom;
    private double height;

    public Triangle(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * bottom * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

class Trapezoid extends Shape {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * (base1 + base2) * height;
    }
}

public class ShapeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图形类型(1.三角形 2.圆形 3.矩形 4.正方形 5.梯形)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("请输入底边长");
                double bottom = scanner.nextDouble();
                System.out.println("请输入高");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(bottom, height);
                System.out.printf("面积是%.2f", triangle.area());
                break;

            case 2:
                System.out.println("请输入圆的半径");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.printf("面积是%.2f", circle.area());
                break;

            case 3:
                System.out.println("请输入矩形的长度");
                double length = scanner.nextDouble();
                System.out.println("请输入矩形的宽度");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.printf("面积是%.2f", rectangle.area());
                break;

            case 4:
                System.out.println("请输入正方形的边长");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.printf("面积是%.2f", square.area());
                break;

            case 5:
                System.out.println("请输入梯形的上底");
                double base1 = scanner.nextDouble();
                System.out.println("请输入梯形的下底");
                double base2 = scanner.nextDouble();
                System.out.println("请输入梯形的高");
                double trapezoidHeight = scanner.nextDouble();
                Trapezoid trapezoid = new Trapezoid(base1, base2, trapezoidHeight);
                System.out.printf("面积是%.2f", trapezoid.area());
                break;

            default:
                System.out.println("输入错误");
        }

        scanner.close();
    }
}
