package Chap4_4;

public class client {
    public static void main(String[] args){
        try{

            autocarfactory Autocarfactory;
            autocar Autocar;

            Autocarfactory = (autocarfactory) Chap4_4.XMLUtil.getBean();
            Autocar =Autocarfactory.produceautocar();
            Autocar.yunxing();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
