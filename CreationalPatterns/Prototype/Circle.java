package CreationalPatterns.Prototype;

public class Circle implements Shape {
    private final double radius;
    private String color;

    public Circle(double radius, String color) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this.radius, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius + " and color: " + color);
    }
}
