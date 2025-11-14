package CreationalPatterns.FactoryMethod;

public class TriangleCreator implements Creator {
    private final double a, b, c;

    public TriangleCreator(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Shape createShape() {
        return new Triangle(a, b, c);
    }
}
