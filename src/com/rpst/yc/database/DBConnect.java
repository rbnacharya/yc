/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.database;

import java.sql.*;
/**
 *
 * @author Pavan Poudel
 */
public class DBConnect {
    Connection con = null;
    public static Connection connectorDB()
    {
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/YelloCafe", "root", null); 
            return conn;
            }
        catch (Exception e) {  
            e.printStackTrace();
            return null;
        }
    }
    
}
