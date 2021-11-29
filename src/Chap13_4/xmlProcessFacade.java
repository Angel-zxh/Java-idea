package Chap13_4;

public class xmlProcessFacade extends AbstractFacade{
    private FileReader fileReader;
    private DataShow dataShow;

    @Override
    public void dataProcess() {
        fileReader = new FileReader();
        dataShow = new DataShow();
        fileReader.read();
        dataShow.show();
    }
}
