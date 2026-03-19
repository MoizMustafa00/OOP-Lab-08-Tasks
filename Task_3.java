package Lab_08_Tasks;

abstract class Shape {
    public abstract void calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = 3.142 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Main3 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        s1.calculateArea();
        Shape s2 = new Rectangle(10, 8);
        s2.calculateArea();
    }
}