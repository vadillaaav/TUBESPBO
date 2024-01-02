package tubespbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args)throws SQLException{
        String url = "jdbc:mysql://localhost:3306/quiz";
        String uname = "root";
        String password = "";
        String query = "select * from question";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Connection con = DriverManager.getConnection(url, uname, password);
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()){
                String pertanyaan = "";
                for (int i = 1; i < 6; i++) {
                    pertanyaan += result.getString(i) + ":";
                }
                System.out.println(pertanyaan);
            }
  
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
        
}
