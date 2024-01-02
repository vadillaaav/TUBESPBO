/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.sql.*;
import java.sql.DriverManager;
public class Config {
    private static Connection mySqlConfig;
    
    public static Connection configDB()throws SQLException{
        
        try{
            String url = "jdbc:mysql://localhost/tubesPBO";
            String user = "root";
            String pass = "";
            String driver = "com.mysql.jdbc.Driver";
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mySqlConfig = DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            System.err.println("Koneksi gagal "+e.getMessage());
        }
        return mySqlConfig;
    }
    
    
}

