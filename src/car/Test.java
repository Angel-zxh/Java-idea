package car;

public class Test {
    public static void main(String[] args) {
        Factory carFac1=new BenzFactory();
        Car Benz = carFac1.create();
        Factory carFac3=new BMWFactory();
        Car BMW = carFac3.create();
    }
}
