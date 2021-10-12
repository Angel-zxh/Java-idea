package huitu;

public class Factory {
    public static final String CIRCLE="circle";
    public static final String RECTANGLE="rectangle";
    public static final String TRIANGLE="triangle";
    public static Shape getShape(String type) throws UnsupportShapeException {
        Shape shape;
        switch (type){
            case CIRCLE:
                shape=new Circle();
                break;
            case RECTANGLE:
                shape=new Rectangle();
                break;
            case TRIANGLE:
                shape=new Triangle();
                break;
            default :
                throw new UnsupportShapeException("不支持该类型");
        }
        return shape;
    }
}
