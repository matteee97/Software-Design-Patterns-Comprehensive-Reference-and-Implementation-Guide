public class Main {
    /**
     * Obiettivo del Pattern:
     * Creare un piccolo sistema che gestisca forme geometriche (cerchi, rettangoli,
     * triangoli) usando il Builder Pattern.
     * Il sistema deve permettere di creare forme geometriche da zero tramite uso
     * del builder e crearne altre dià pronte tramite director.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        // Esempio di costruzione di un rettangolo tramite un Builder
        Shape rectangle = new Rectangle.Builder()
                .width(10)
                .height(4)
                .build();

        System.out.println("\nEsempio di costruzione di rettangoli tramite un Builder:");
        System.out.println("Area cerchio: " + circle.getArea());
        System.out.println("Perimetro cerchio: " + circle.getPerimeter());
        System.out.println("Area rettangolo: " + rectangle.getArea());
        System.out.println("Perimetro rettangolo: " + rectangle.getPerimeter());

        // Esempio di costruzione di un rettangolo tramite un Director
        RectangleDirector director = new RectangleDirector(new Rectangle.Builder());
        Rectangle standardRectangle = director.buildStandardRectangle();
        Rectangle square = director.buildSquare(5);
        Rectangle customRectangle = director.buildCustomRectangle(8, 3);

        System.out.println("\nEsempio di costruzione di rettangoli tramite un Director:");
        System.out.println("Area rettangolo standard: " + standardRectangle.getArea());
        System.out.println("Perimetro rettangolo standard: " + standardRectangle.getPerimeter());
        System.out.println("Area quadrato: " + square.getArea());
        System.out.println("Perimetro quadrato: " + square.getPerimeter());
        System.out.println("Area rettangolo personalizzato: " + customRectangle.getArea());
        System.out.println("Perimetro rettangolo personalizzato: " + customRectangle.getPerimeter());
    }
}
