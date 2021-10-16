package Zcar;

public class client {
    public static void main(String[] args){
        try{

            autocarfactory Autocarfactory;
            autocar Autocar;

            Autocarfactory = (autocarfactory) XMLUtil.getBean();
            Autocar =Autocarfactory.produceautocar();
            Autocar.yunxing();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
