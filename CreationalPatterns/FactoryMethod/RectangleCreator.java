package CreationalPatterns.FactoryMethod;

public class RectangleCreator implements Creator {
    private final double width;
    private final double height;

    public RectangleCreator(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape createShape() {
        return new Rectangle(width, height);
    }
}
