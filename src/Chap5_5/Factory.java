package Chap5_5;

public abstract class Factory {
    public abstract Connection createConnection();
    public abstract Statement createStatement();
}
