package CreationalPatterns.FactoryMethod;

/*
 * Obiettivo dell’esercizio:
 * Creare un sistema che gestisca la creazione di forme geometriche (Circle, Rectangle, Triangle) senza istanziarle 
 * direttamente con new, ma lasciando la responsabilità della creazione a una factory specializzata. In questo modo, aggiungere
 * una nuova forma non richiede modifiche al codice esistente, rispettando il principio Open/Closed (SOLID).
 */
public class Main {
    public static void main(String[] args) {
        Creator circleCreator = new CircleCreator(5.0);
        Creator rectangleCreator = new RectangleCreator(10.0, 4.0);
        Creator triangleCreator = new TriangleCreator(3.0, 4.0, 5.0);

        // Uso diretto del factory method
        Shape circle = circleCreator.createShape();
        Shape rect = rectangleCreator.createShape();
        Shape tri = triangleCreator.createShape();

        circle.draw();
        rect.draw();
        tri.draw();

        // oppure uso il default method render()
        circleCreator.render();
    }
}
