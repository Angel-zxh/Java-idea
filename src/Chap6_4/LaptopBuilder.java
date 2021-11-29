package Chap6_4;

public class LaptopBuilder extends ComputerBuilder{
    public void buildeCPU(){
        computer.setCpu("LapTop的Cpu");
    }
    public  void buildeHardDisk(){
        computer.setHardDisk("Laptop的HardDisk");
    }
    public   void buildeHost(){
        computer.setHost("Laptop的主机");
    }
    public void buildeDisplay(){
        computer.setDisplay("Laptop的显示器");
    }
    public   void buildeStorage(){
        computer.setStorage("Latptop的内存");
    }
}
