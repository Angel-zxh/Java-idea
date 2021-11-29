package Chap13_5;

public class MainFrame {
    private Memory memory=new Memory();		//关联关系建立联系
    private Cpu cpu=new Cpu();
    private HardDisk harddisk=new HardDisk();
    private Os os=new Os();

    public void fun() {
        memory.display();
        cpu.display();
        harddisk.display();
        os.display();
        System.out.println("开机正常");

    }

}
