package dianqiFac;

public class TCLFactory implements EFactory{
    @Override
    public Television produceTelevision() {
        return new TCLTV();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new TCLAC();
    }
}
