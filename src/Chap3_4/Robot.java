package Chap3_4;

public class Robot extends Person{
    public void eat(){
        System.out.println("机器人吃东西");
        super.eat();
    }
    public void run(){
        System.out.println("机器人跑步");
        super.run();
    }
}
