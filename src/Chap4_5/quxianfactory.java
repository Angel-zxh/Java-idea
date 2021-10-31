package Chap4_5;

public class quxianfactory implements tongjifactory{
    @Override
    public tongji producetongji() {
        System.out.println("曲线图创建器生成曲线图");
        return new quxian();
    }
}
