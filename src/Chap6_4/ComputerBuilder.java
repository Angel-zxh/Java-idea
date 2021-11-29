package Chap6_4;

public abstract class ComputerBuilder {
    protected Computer computer=new Computer();
    public abstract  void buildeCPU();
    public abstract  void buildeHardDisk();
    public abstract  void buildeHost();
    public abstract  void buildeDisplay();
    public abstract  void buildeStorage();
    public Computer creComputer(){
        return computer;
    }
}
