/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
/**
 *
 * @author Pavan Poudel
 */
public class DBQuery {
    
   public String Saveterminal(TerminalData td) {  
        try {  
            Connection connection = DBConnect.connectorDB();
            Statement statement = connection.createStatement();
            String sql = "INSERT into tbl_terminal(Terminal, Comp_name, Profile, IPAddress, Username, MACAddress) VALUES(?,?,?,?,?,?)"; 
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, td.tid);
            ps.setString(2, td.comp_name);
            ps.setString(3, td.profile);
            ps.setString(4, td.ipaddr);
            ps.setString(5, td.username);
            ps.setString(6, td.macaddr);
            ps.addBatch();
            ps.executeBatch();
            ps.close();
            connection.close();
            return "Terminal Saved.";
        } 
        catch (Exception e) {  
            e.printStackTrace(); 
            return "error";
        }  
    }
   
   public String SaveUser(UserData ud) {  
        try {  
            Connection connection = DBConnect.connectorDB();
            Statement statement = connection.createStatement();
            String sql = "INSERT into tbl_user(LoginID, Password, Identity, IDNumber, FullName, UserType, Payment, Balance, Image, Gender, Age, Phone, Email, Address, Description ) VALUES(?,?,?,?,?,?,?, ?, ?, ?,?,?,?,?,?)"; 
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, ud.LoginId);
            ps.setString(2, ud.Password);
            ps.setString(3, ud.Identity);
            ps.setString(4, ud.IdNumber);
            ps.setString(5, ud.Fullname);
            ps.setString(6, ud.UserType);
            ps.setString(7, ud.Payment);
            ps.setFloat(8, ud.balance);
            ps.setString(10, ud.gender);
            ps.setInt(11, ud.age);
            ps.setString(12, ud.phone);
            ps.setString(13, ud.email);
            ps.setString(14, ud.address);
            ps.setString(15, ud.description);
            
            File image = new File(ud.imagepath);
            FileInputStream fis = new FileInputStream(image);
            ps.setBinaryStream(9, (InputStream)fis, (int)(image.length()));
            ps.addBatch();
            ps.executeBatch();
            ps.close();
            connection.close();
            return "User Saved.";
        } 
        catch (Exception e) {  
            e.printStackTrace(); 
            return "error";
        }  
    }
    
}
