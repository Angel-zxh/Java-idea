package Chap9_6_1;

public class DogImpl implements Dog{
    @Override
    public void DogLooks() {
        System.out.println("我有狗的外表");
    }

    @Override
    public void Cry() {
        System.out.println("我会狗叫");
    }
}
