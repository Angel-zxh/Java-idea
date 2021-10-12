package car;

public class BenzFactory implements Factory{
    public BenzFactory(){
        System.out.println("这是奔驰车厂。");
    }

    @Override
    public Car create() {
        return new Benz();
    }
}
