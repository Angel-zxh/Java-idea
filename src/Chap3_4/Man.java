package Chap3_4;

public class Man extends Person{
    public void eat(){
        System.out.println("男人吃东西");
        super.eat();
    }
    public void run(){
        System.out.println("男人跑步");
        super.run();
    }
}
