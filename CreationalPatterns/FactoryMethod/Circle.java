package CreationalPatterns.FactoryMethod;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("radius must be > 0");
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
