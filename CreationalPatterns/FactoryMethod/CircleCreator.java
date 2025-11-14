package CreationalPatterns.FactoryMethod;

public class CircleCreator implements Creator {
    private final double radius;

    public CircleCreator(double radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("radius must be > 0");
        this.radius = radius;
    }

    @Override
    public Shape createShape() {
        // in this part we can put our business logic
        return new Circle(radius);
    }
}
