package Chap4_6;

public class Test {
    public static void main(String[] args) {
        ConvertFactory dbConvertFactory = new DBConvertorFactory();
        Convertor dbConvertor = dbConvertFactory.getConvertor();
        dbConvertor.transform();

        ConvertFactory excelConvertorFactory = new EXCELConvertorFactory();
        Convertor excelConvertor = excelConvertorFactory.getConvertor();
        excelConvertor.transform();

        ConvertFactory txtConvertorFactory = new TXTConvertorFactory();
        Convertor txtConvertor = txtConvertorFactory.getConvertor();
        txtConvertor.transform();
    }
}
