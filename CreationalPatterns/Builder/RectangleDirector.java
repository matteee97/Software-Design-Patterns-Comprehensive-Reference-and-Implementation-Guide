public class RectangleDirector {
    private Rectangle.Builder builder;

    public RectangleDirector(Rectangle.Builder builder) {
        this.builder = builder;
    }

    // Metodo per costruire un rettangolo standard
    public Rectangle buildStandardRectangle() {
        return builder
                .width(10)
                .height(5)
                .build();
    }

    // Metodo per costruire un quadrato
    public Rectangle buildSquare(double side) {
        return builder
                .width(side)
                .height(side)
                .build();
    }

    // Metodo per costruire un rettangolo personalizzato
    public Rectangle buildCustomRectangle(double width, double height) {
        return builder
                .width(width)
                .height(height)
                .build();
    }
}
