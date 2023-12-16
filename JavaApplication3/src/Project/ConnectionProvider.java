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
        
      var server ="KYPHUONG04\\SQLEXPRESS"  ;
      var user ="sa";
      var password ="4444";
      var db="BloodDonation";
      var port =1434;
      SQLServerDataSource ds = new SQLServerDataSource();
      ds.setUser(user);
      ds.setPassword(password);
      ds.setDatabaseName(db);
      ds.setServerName(server);
      ds.setPortNumber(port);
      
      try(Connection conn = ds.getConnection()){
          System.out.println("Kết nối thành công!");
          System.out.println(conn.getCatalog());
      } catch (SQLException ex) { 
            ex.printStackTrace();
        } 
    }
}

