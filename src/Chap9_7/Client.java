package Chap9_7;

public class Client {
    public static void main(String[] args){
        Player p;
        p=(Player) XMLUtil.getBean();
        p.play("Rush Hour");
    }
}
