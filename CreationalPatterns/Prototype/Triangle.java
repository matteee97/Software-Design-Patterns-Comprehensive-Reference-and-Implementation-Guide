package CreationalPatterns.Prototype;

public class Triangle implements Shape, Cloneable {
    private final double side1;
    private final double side2;
    private final double side3;
    private String color;

    public Triangle(double side1, double side2, double side3, String color) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            throw new IllegalArgumentException("Sides must be positive");
        if (color == null || color.isBlank())
            throw new IllegalArgumentException("Color cannot be null or empty");

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    // Costruttore per triangolo equilatero
    public Triangle(double side, String color) {
        this(side, side, side, color);
    }

    // Getter / Setter
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        // Formula di Erone (più realistica)
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public Triangle clone() {
        // versione identica a return new Triangle(this.side1, this.side2, this.side3,
        // this.color); ma più concisa
        try {
            return (Triangle) super.clone(); // shallow clone, ok perché campi immutabili
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // non dovrebbe mai succedere
        }
    }

    @Override
    public void draw() {
        System.out.printf(
                "Drawing a triangle with sides: %.1f, %.1f, %.1f and color: %s%n",
                side1, side2, side3, color);
    }
}
