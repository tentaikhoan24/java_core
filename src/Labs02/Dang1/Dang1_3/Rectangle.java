package Labs02.Dang1.Dang1_3;

public class Rectangle extends Shape {
    protected Double width;
    protected Double length;

    public Rectangle(){

    }

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(Double width, Double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
    @Override
    public Double getArea() {
        return width*length;
    }

    @Override
    public Double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{length: "+getLength() + ", width: " + getWidth() + ", area: " + getArea() + ", perimeter: " + getPerimeter() + "}";
    }
}
