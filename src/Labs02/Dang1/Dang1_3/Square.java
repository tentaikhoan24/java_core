package Labs02.Dang1.Dang1_3;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(Double side) {
        super(side, side);
    }

    public Square(Double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }

    public Double getSide() {
        return super.getWidth();
    }

    public void setSide(Double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(Double side) {
        super.setLength(side);
    }

    public void setWidth(Double side) {
        super.setWidth(side);
    }

    @Override
    public String toString(){
        return "Square{side: "+getSide() + ", area: " + getArea() + ", perimeter: " + getPerimeter() + "}";
    }

}
