package Labs02.Dang1.Dang1_2;

public class MoveableCircle implements Moveable {
    public Integer radius;
    public MoveablePoint center;

    public MoveableCircle(MoveablePoint moveablePoint, Integer radius) {
        this.center = moveablePoint;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }
}
