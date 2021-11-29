package Chap6_4;

public class ServiceHostBuilder extends ComputerBuilder{
    public void buildeCPU(){
        computer.setCpu("ServiceHost的Cpu");
    }
    public  void buildeHardDisk(){
        computer.setHardDisk("ServiceHost的HardDisk");
    }
    public   void buildeHost(){
        computer.setHost("ServiceHost的主机");
    }
    public void buildeDisplay(){
        computer.setDisplay("ServiceHost的显示器");
    }
    public   void buildeStorage(){
        computer.setStorage("ServiceHost的内存");
    }
}
