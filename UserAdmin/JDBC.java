package tubes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    protected static final String DB_URL = "jdbc:mysql://localhost/datadosen";
    protected static final String DB_USER = "root";
    protected static final String DB_PASS = "";
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;
}
