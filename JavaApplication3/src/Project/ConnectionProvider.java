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
    public static Connection getCon(){
       try{
           Class.forName("com.mysql.jbdc.Driver");
           String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=BloodDonation;user=sa;password=ha15122003;encrypt=false";
           Connection con = DriverManager.getConnection(connectionUrl);
           return con;
       }
       catch(Exception e){
           return null;
       }


    }
}

