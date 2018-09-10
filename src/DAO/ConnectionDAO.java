/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Pedro Maschio
 */
public class ConnectionDAO {
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/db_glocadora", "root", "");
        }
        catch(SQLException ex){
            throw new RuntimeException();
        }
    }
    public static void closeConnection(Connection con){
        try {
            if(con != null)
                con.close();
        } catch(SQLException ex){
            throw new RuntimeException();
        }
        
    }
}
