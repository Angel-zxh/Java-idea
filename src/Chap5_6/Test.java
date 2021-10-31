package Chap5_6;

public class Test {
    public static void main(String[] args) {
        GameController  gameController;
        IInterfaceController iInterfaceController;
        IOperationController iOperationController;
        gameController = new AndroidController();
        iInterfaceController = gameController.InterfaceController();
        iOperationController = gameController.OperationController();
        iInterfaceController.Interface();
        iOperationController.Operator();
    }

}
