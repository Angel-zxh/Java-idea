package Chap3_4;

public class Nvwamakeperson {
    public static void main(String[] args){
        Person person;
        person= Nvwa.getPerson("M");
        person.eat();
        person= Nvwa.getPerson("W");
        person.eat();
        person= Nvwa.getPerson("R");
        person.eat();
    }
}
