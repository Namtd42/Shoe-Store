/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public class LoginDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Account checkAcc(String username, String password) {
        String query = "SELECT  * FROM account where username = ? and password = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString("username"),
                        rs.getString("password"),
                        rs.getBoolean("admin"),
                rs.getInt("userid"));
               return a;
            }
        } catch (Exception e) {
        }
        return null;
    }
    public List<Account> getAll(){
        List<Account> a = new ArrayList<>();
        String sql = "select * from Acoount";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String username = rs.getString(1);
                String password = rs.getString(2);
                boolean isAdmin = rs.getBoolean(3);
                int userID = rs.getInt(4);
            }
        }catch(Exception e){
            
        }
        return a;
    }
}
