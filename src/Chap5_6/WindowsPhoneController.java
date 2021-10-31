package Chap5_6;

public class WindowsPhoneController implements GameController{
    @Override
    public IOperationController OperationController() {
        return new WindowsPhoneOperationController();
    }

    @Override
    public IInterfaceController InterfaceController() {
        return new WindowsPhoneInterfaceController();
    }
}
