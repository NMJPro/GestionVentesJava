/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hp1
 */
public class DB {
    private static Connection con = null;
    private static Statement stmt;
    private static PreparedStatement ps;
    private static int parameterIndex;
    public static Connection getConnection(){
        try{
           if(con == null){
               Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/ventes_db";
                con = DriverManager.getConnection(url,"root","");
           }  
        }catch(SQLException exp){
            exp.printStackTrace();
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }
        return con;
    }
  public static Statement getStatement(){
      try{
          getConnection();
      
       if(stmt == null){
           stmt = con.createStatement();
       }
      }catch(Exception exp){
               
               }
       return stmt;
  } 

    public static PreparedStatement getPreparedStatement() {
         try{
          getConnection();
      
       if(ps == null){
           ps = con.prepareStatement(null);
           ps.setString(parameterIndex, null);
    }
      }catch(Exception ex){
               
}
       return ps;
    }
}
