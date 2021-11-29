package Chap6_5;
/**指挥者类*/
public class ScreenModeController {
    private ModeBuilder mb;
    public void setModeBuilder(ModeBuilder mb){
        this.mb = mb;
    }
    public MainScreen construct(ModeBuilder mb){
        MainScreen ms;
        mb.buildMenu();
        mb.buildPlayList();
        mb.buildMainWindow();
        mb.buildControlBar();
        ms = mb.getScreen();
        return ms;
    }
}
