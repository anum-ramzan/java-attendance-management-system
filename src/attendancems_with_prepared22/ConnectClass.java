/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import java.sql.*;
/**
 *
 * @author Iqbal-Asi
 */
public class ConnectClass {
    
    //Class Global area 
    Connection xc;
    Statement st;        
    
    //ConnectClass Constructor
    public ConnectClass() {
        try {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
            /**
             * ODBC Name = attend
             */
            
            xc = DriverManager.getConnection("jdbc:odbc:attend");
            
            st = xc.createStatement();
        }
        catch(Exception ex) {
             System.out.println(ex.toString());
        }
    }
}
