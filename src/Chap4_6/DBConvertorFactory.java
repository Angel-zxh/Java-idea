package Chap4_6;

public class DBConvertorFactory implements ConvertFactory{
    @Override
    public Convertor getConvertor() {
        System.out.println("DataBase转换工厂Complete");
        return new DBConvertor();
    }
}
