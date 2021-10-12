package Nvwa;

public class Woman extends Person{
    public void eat(){
        System.out.println("女人吃东西");
        super.eat();
    }
    public void run(){
        System.out.println("女人跑步");
        super.run();
    }
}
