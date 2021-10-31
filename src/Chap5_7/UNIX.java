package Chap5_7;

public class UNIX extends Os{
    protected  Button creButton(){
        Button button=new UNIXButton();
        return button;
    }
    protected  Text creText(){
        Text text=new UNIXText();
        return text;
    }
}
