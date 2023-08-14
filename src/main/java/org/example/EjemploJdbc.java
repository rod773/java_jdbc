package org.example;


import org.example.util.ConexionBaseDatos;

import java.sql.*;


public class EjemploJdbc {
    public static void main(String[] args) {



        try (Connection conn = ConexionBaseDatos.getInstacce();
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