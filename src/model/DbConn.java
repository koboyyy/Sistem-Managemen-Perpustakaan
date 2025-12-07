package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.ResultSet;

/**
 *
 * @author evo
 */
public class DbConn {

    // Database connection details
    private final String database = "perpustakaan";
    private final String url = "jdbc:mysql://localhost:3306/" + database;
    private final String user = "root";
    private final String password = "";
    private Connection myConn = null;
    
    
    public Connection mkConn () {
        try {
            myConn = DriverManager.getConnection(this.url, this.user, this.password);
            return this.myConn;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
    
    public Statement crStmt () {
        try {
            Statement myStmt = mkConn().createStatement();
            
            return myStmt;
        }catch (SQLException ex){
            System.out.println(ex);
            return null;
        }
    }
    
    public void putus () {
        try {
            this.myConn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
