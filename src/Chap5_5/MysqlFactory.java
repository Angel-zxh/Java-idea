package Chap5_5;

public class MysqlFactory extends Factory{
    @Override
    public Connection createConnection() {
        return new mysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new mysqlStatement();
    }
}
