package Chap13_4;

public class Client {
    public static void main(String[] args) {
        AbstractFacade af;
//        af = new xmlProcessFacade();
        af = new DataProcessFacade();
        af.dataProcess();
    }
}
