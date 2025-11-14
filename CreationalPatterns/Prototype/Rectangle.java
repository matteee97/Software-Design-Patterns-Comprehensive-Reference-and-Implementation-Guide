package CreationalPatterns.Prototype;

public class Rectangle implements Shape {
    private final double width;
    private final double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be greater than 0");
        }
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, String color) {
        this(width, width, color);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.width, this.height, this.color);
    }

    @Override
    public void draw() {
        System.out.println(
                "Drawing a rectangle with width: " + width + " and height: " + height + " and color: " + color);
    }
}