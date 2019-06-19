package model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class ConnectionDb {

    private Connection con;

    public void connectDb() {
        String myUrl = "jdbc:mysql://localhost:3306/freelance";
        
        try {
            con = DriverManager.getConnection(myUrl, "freelanceAdm", "Freelance!123");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getCon() {
        return con;
    }

    public ResultSet selectQuery(String query) {
        ResultSet rs = null;
        try {
            connectDb();
            Statement st = con.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return rs;
    }
    
    public void insertQuery(String query){
        try {
            connectDb();
            Statement st = con.createStatement();
            st.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
