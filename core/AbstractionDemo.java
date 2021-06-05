abstract class Shape {
    String color;

    Shape(String color) {
        System.out.println("Shape constructor is called");
        this.color = color;
    }

    public abstract double area();

    public abstract String toString();
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        System.out.println("Circle Constructor is called");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Color is " + color + " Area is " + area();
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(String color, double length, double breadth) {
        super(color);
        System.out.println("Rectangle Constructor is called");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return "Color is " + color + " Area is " + area();
    }
}

class AbstractionDemo {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 2.2);
        System.out.println(c.toString());

        Rectangle r = new Rectangle("Purple", 2, 4);
        System.out.println(r);

    }
}
