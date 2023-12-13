/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author admin
 */
public class ConnectionProvider {
    public static void main(String[] args){
        
      var server ="LAPTOP-UK0KLT1P\\SQLEXPRESS"  ;
      var user ="sa";
      var password ="ha15122003";
      var db="BloodDonation";
      var port =1433;
      SQLServerDataSource ds = new SQLServerDataSource();
      ds.setUser(user);
      ds.setPassword(password);
      ds.setDatabaseName(db);
      ds.setServerName(server);
      ds.setPortNumber(port);
      
      try(Connection conn = ds.getConnection()){
          System.out.println("Kết nối thành công");
          System.out.println(conn.getCatalog());
      } catch (SQLException ex) { 
            ex.printStackTrace();
        } 
      
    }
    }

