package CreationalPatterns.Prototype;

public interface Shape {
    double getArea();

    double getPerimeter();

    // Metodo per clonare l'oggetto
    Shape clone();

    void draw();
}
