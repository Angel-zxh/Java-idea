package Chap6_4;

public class DeskTopComputerBuilder extends ComputerBuilder{
    public void buildeCPU(){
        computer.setCpu("DeskTopComputer的Cpu");
    }
    public  void buildeHardDisk(){
        computer.setHardDisk("DeskTopComputer的HardDisk");
    }
    public   void buildeHost(){
        computer.setHost("DeskTopComputer的主机");
    }
    public void buildeDisplay(){
        computer.setDisplay("DeskTopComputer的显示器");
    }
    public   void buildeStorage(){
        computer.setStorage("DeskTopComputer的内存");
    }
}
