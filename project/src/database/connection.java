package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private final String username="root",password="",address="jdbc:mysql://localhost/project";
    public  Connection connect()throws SQLException
    {
        return DriverManager.getConnection(address,username,password);
    }
}
