package org.example;


import java.sql.*;


public class EjemploJdbc {
    public static void main(String[] args) {

        String url ="jdbc:mysql://localhost:3306/java_curso?serverTimeZone=europe/madrid";
        String usuario = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, usuario, password);
             Statement stmt = conn.createStatement();
             ResultSet resultado = stmt.executeQuery("select * from productos");){

            while(resultado.next()){

                System.out.print("id : "+resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print("nombre : "+resultado.getString("nombre"));
                System.out.print(" | ");
                System.out.print("precio : "+resultado.getInt("precio"));
                System.out.println(" | ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



   }

}