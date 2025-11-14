package CreationalPatterns.Prototype;

/**
 * Obiettivo del Pattern:
 * Creare un piccolo sistema che gestisca forme geometriche (cerchi, rettangoli,
 * triangoli) usando il Prototype Pattern.
 * Il sistema deve permettere di clonare forme già create, modificarne alcune
 * proprietà e mostrare che le copie sono indipendenti.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        Rectangle rectangle = new Rectangle(10, 5, "yellow");
        Triangle triangle = new Triangle(3, 4, 5, "blue");

        circle.draw();
        rectangle.draw();
        triangle.draw();

        Circle clonedCircle = circle.clone();
        Rectangle clonedRectangle = rectangle.clone();

        clonedCircle.setColor("blue");
        clonedRectangle.setColor("green");

        clonedCircle.draw();
        clonedRectangle.draw();
        circle.draw();
        rectangle.draw();

    }
}
