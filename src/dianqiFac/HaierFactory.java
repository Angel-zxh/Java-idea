package dianqiFac;

public class HaierFactory implements EFactory{
    @Override
    public Television produceTelevision() {
        return new HaierTV();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAC();
    }
}
