package Chap6_5;
/**抽象建造者类*/
abstract class ModeBuilder {
 protected MainScreen screen = new MainScreen();//创造产品对象
 public abstract void buildMenu();
 public abstract void buildPlayList();
 public abstract void buildMainWindow();
 public abstract void buildControlBar();
 public MainScreen getScreen(){  //返回产品对象--工厂方法
  return screen;
 }
}
