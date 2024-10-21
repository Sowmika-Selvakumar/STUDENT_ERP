package Student.Database.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;

    Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///studentdatabasemanagementsystem","root","Uknplve@3");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}