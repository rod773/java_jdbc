package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

public class ConexionBaseDatos{

    private static String url ="jdbc:mysql://localhost:3306/java_curso?serverTimeZone=europe/madrid";
    private static String usuario = "root";
    private static String password = "";
    private static Connection conn;

    public static Connection getInstacce() throws SQLException {
        if(conn == null){

            conn = DriverManager.getConnection(url, usuario, password);

        }
        return conn;
    }
}
