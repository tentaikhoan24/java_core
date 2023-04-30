package Labs02.Dang1.Dang1_3;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){

    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract Double getArea();
    public abstract Double getPerimeter();
    @Override
    public abstract String toString();
}
