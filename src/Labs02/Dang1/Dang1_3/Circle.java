package Labs02.Dang1.Dang1_3;
import java.util.*;


public class Circle extends Shape {
    private Double radius;

    public Circle() {

    }

    @Override
    public Double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public Double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "Circle{radius: "+getRadius() + ", area: " + getArea() + ", perimeter: " + getPerimeter() + "}";
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
