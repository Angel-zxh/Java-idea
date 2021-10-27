package Chap9_6_1;

public class CatImpl implements Cat{
    @Override
    public void CatLooks() {
        System.out.println("我有猫的外表");
    }

    @Override
    public void CatchMouse() {
        System.out.println("我能抓老鼠");
    }
}
