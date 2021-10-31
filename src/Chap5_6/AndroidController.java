package Chap5_6;

public class AndroidController implements GameController{
    @Override
    public IOperationController OperationController() {
        return new AndroidOperationController();
    }

    @Override
    public IInterfaceController InterfaceController() {
        return new AndroidInterfaceController();
    }
}
