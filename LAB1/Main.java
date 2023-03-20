package LAB1;

import LAB1.singletone.DataBaseConnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataBaseConnection dataBaseConnection = DataBaseConnection.getInstance();
        if (dataBaseConnection.getConnection() != null) {
            System.out.println("Connection is established");
        } else {
            System.out.println("Connection is not established");
        }
        dataBaseConnection.getConnection().close();
    }
}
