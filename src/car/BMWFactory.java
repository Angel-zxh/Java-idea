package car;

public class BMWFactory implements Factory{
    public BMWFactory(){
        System.out.println("这是宝马工厂");
    }

    @Override
    public Car create() {
        return new BMW();
    }
}
