package Chap9_6_1;

public class test {
    public static void main(String[] args){
        Cat fakercat = new Adapter(new DogImpl());
        fakercat.CatLooks();
        fakercat.CatchMouse();
        Dog fakerdog=new Adapter(new CatImpl());
        fakerdog.DogLooks();
        fakerdog.Cry();
    }
}
