package Chap5_5;

public class OracleFactory extends Factory{
    @Override
    public Connection createConnection() {
        return new oracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new oracleStatement();
    }
}
