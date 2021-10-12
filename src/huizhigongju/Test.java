package huizhigongju;

public class Test {
    public static void main(String[] args){
        Shape shape;
        shape = ShapeFac.getShape("triangle");
        shape.erase();
    }
}
