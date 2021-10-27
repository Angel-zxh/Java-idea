package Chap9_6_1;

public class Adapter implements Cat, Dog{
    Cat cat=null;
    Dog dog=null;
    public Adapter(Cat cat) {
        this.cat = cat;
    }
    public Adapter(Dog dog){
        this.dog = dog;
    }

    @Override
    public void DogLooks() {
        System.out.println("我是一只狗");
    }

    @Override
    public void Cry() {
        cat.CatchMouse();
    }

    @Override
    public void CatLooks() {
        System.out.println("我是一只猫");
    }

    @Override
    public void CatchMouse() {
        dog.Cry();
    }
}

