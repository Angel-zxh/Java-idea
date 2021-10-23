package Chap5_4;

public class TCLAC implements AirConditioner{
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调温度改变中...");
    }
}
