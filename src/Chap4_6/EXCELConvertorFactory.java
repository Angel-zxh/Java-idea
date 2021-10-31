package Chap4_6;

public class EXCELConvertorFactory implements ConvertFactory{
    @Override
    public Convertor getConvertor() {
        System.out.println("EXCEL转换工厂Complete");
        return new EXCELConvertor();
    }
}
