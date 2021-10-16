package Zcar;

public class BMWautocarfactory implements autocarfactory{
    @Override
    public autocar produceautocar() {
        System.out.println("BMW汽车工厂生产的BMW汽车");
        return new BMWautocar();
    }
}
