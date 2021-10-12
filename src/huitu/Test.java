package huitu;

public class Test {
    public static void main(String[] args) throws UnsupportShapeException {
        Shape shape;
        shape  = Factory.getShape("circle");
        shape.draw();
        shape.erase();
    }

}
