package Chap6_4;

public class test {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new LaptopBuilder();
        ComputerController computerController = new ComputerController();
        Computer computer = computerController.getComputer(computerBuilder);
        System.out.println(computer.getCpu());
        System.out.println(computer.getDisplay());
        System.out.println(computer.getHardDisk());
        System.out.println(computer.getHost());
        System.out.println(computer.getStorage());
    }
}
