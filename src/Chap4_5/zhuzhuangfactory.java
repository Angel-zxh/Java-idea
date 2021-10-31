package Chap4_5;

public class zhuzhuangfactory implements tongjifactory{
    @Override
    public tongji producetongji() {
        System.out.println("柱状图创建器生成柱状图");
        return new zhuzhuang();
    }
}
