/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterDAO extends DBContext{
    public void addNewAccount(String username, String password, String name, String email, Date dob){
        try {    
            Statement statement = getConnection().createStatement();
            String sql = "Insert into Account values('"+username+"','"+password+"',1)";
            statement.executeUpdate(sql);
            String sql2 = "Insert into User_Information values('"+username+"','"+name+"','"+email+"',"+dob+")";
            statement.executeUpdate(sql2);
        } catch (Exception ex) {
            Logger.getLogger(RegisterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
