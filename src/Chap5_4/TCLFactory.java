package Chap5_4;

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
