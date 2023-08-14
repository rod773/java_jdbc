package org.example.util;

import java.sql.Connection;

public class ConexionBaseDatos{

    private static String url ="jdbc:mysql://localhost:3306/java_curso?serverTimeZone=europe/madrid";
    private static String usuario = "root";
    private static String password = "";
    private static Connection conn;
}
