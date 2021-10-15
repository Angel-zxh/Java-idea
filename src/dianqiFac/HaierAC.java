package dianqiFac;

public class HaierAC implements AirConditioner{
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度改变中...");
    }
}
