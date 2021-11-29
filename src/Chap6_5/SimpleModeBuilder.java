package Chap6_5;
/**具体建造者--精简模式*/
public class SimpleModeBuilder extends ModeBuilder{
    @Override
    public void buildMenu() {
        screen.setMenu("精简菜单");
    }

    @Override
    public void buildPlayList() {
        screen.setPlayList("精简播放列表");
    }

    @Override
    public void buildMainWindow() {
        screen.setMainWindow("精简主窗口");
    }

    @Override
    public void buildControlBar() {
        screen.setControlBar("精简控制条");
    }
}
