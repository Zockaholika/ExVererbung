package Shapes;

public abstract class Shapes {

    String color;

    boolean isFilled;

    public Shapes(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
