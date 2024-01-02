package tubes;

import java.sql.*;
import java.sql.DriverManager;

public class connection {
    private static Connection mySqlConfig;
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/pbotubes";
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