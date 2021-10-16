package Zcar;

public class Benzautocarfactory implements autocarfactory{
    @Override
    public autocar produceautocar() {
        System.out.println("Benz汽车工厂生产的Benz汽车");
        return new Benzautocar();
    }
}
