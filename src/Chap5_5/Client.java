package Chap5_5;

public class Client {
    public static void main(String[] args){
        Factory factory = null;
        Connection connection ;
        Statement statement;
        try {
            factory = (Factory)XMLUtil.getBean();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (factory==null){
            System.out.println("未获取到对象");
        }else {
            connection = factory.createConnection();
            statement = factory.createStatement();
            connection.connection();
            statement.sattement();
        }
    }
}
