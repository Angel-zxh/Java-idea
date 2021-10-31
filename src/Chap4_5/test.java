package Chap4_5;

public class test {
    public static void main(String[] args){
        try{
            tongjifactory Tongjifactory;
            tongji Tongji;
            Tongjifactory = (tongjifactory) Chap4_5.XMLUtil.getBean();
            Tongji = Tongjifactory.producetongji();
            Tongji.chuangjian();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
