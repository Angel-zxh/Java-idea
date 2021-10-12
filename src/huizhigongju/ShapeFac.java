package huizhigongju;

public class ShapeFac {
    public static Shape getShape(String type){
        Shape shape = null;
        if(type.equalsIgnoreCase("circular")){
            shape = new Circle();
            System.out.println("初始化圆形！");
        }
        else if(type.equalsIgnoreCase("square")){
            shape = new Square();
            System.out.println("初始化正方形！");
        }
        else if(type.equalsIgnoreCase("triangle")){
            shape = new Triangle();
            System.out.println("初始化三角形！");
        }
        else{
            System.out.println("UnSupportedShapeException！");
        }
        return shape;
    }

}
