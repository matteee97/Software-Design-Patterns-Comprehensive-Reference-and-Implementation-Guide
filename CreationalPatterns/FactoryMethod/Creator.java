package CreationalPatterns.FactoryMethod;

public interface Creator {
    public Shape createShape();

    default void render() {
        Shape shape = createShape();
        shape.draw();
    }
}
