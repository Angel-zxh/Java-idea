package Chap4_6;

public class TXTConvertorFactory implements ConvertFactory{
    @Override
    public Convertor getConvertor() {
        System.out.println("TXT转换工厂Complete");
        return new TXTConvertor();
    }
}
