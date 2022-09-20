/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection connect;
    public static Connection getConnection() throws SQLException{
       String db="jdbc:mysql://localhost:3306/storage";
       String user="root";
       String pass="";
       if(connect==null){
           connect=DriverManager.getConnection(db,user,pass);
       }
        return connect;
    }
}
