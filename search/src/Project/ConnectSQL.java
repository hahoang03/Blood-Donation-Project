package Project;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kyphuong04
 */
public class ConnectSQL {
    public static Connection getCon() throws SQLException{
        var server = "KYPHUONG04\\SQLEXPRESS";
        var user = "sa";
        var password = "4444";
        var db = "Search_Blood_Donor";
        var port = 1434;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        try(Connection conn = ds.getConnection()){
            System.out.println("Kết nối SQL Server thành công!");
            System.out.println(conn.getCatalog());
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
