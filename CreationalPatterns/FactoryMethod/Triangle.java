package CreationalPatterns.FactoryMethod;

public class Triangle implements Shape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("invalid sides");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with sides " + a + ", " + b + ", " + c);
    }
}
