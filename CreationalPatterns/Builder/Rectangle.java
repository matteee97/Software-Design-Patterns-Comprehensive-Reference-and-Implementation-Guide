public class Rectangle implements Shape {
    private final double width;
    private final double height;

    private Rectangle(Builder builder) {
        this.width = builder.width;
        this.height = builder.height;
    }

    /**
     * Builder class for Rectangle objects.
     * This class is used to construct Rectangle objects in a more readable and
     * flexible way than using the constructor directly.
     * It allows for setting the width and height of the Rectangle object one by
     * one,
     * and then builds the object once all parameters have been set.
     * This is particularly useful when some parameters have default values, or when
     * the constructor has many parameters.
     */
    public static class Builder {
        private double width;
        private double height;

        public Builder width(double width) {
            this.width = width;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Rectangle build() {
            return new Rectangle(this);
        }
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
