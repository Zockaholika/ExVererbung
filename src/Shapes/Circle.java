package Shapes;
import java.lang.Math;
public class Circle extends Shapes{

    double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }


    public double extendRadius(double newRadius) {
        return this.radius = newRadius;
    }
}
