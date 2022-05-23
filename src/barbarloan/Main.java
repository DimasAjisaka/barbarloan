/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barbarloan;

import barbarloan.connection.ConnectionDB;
import barbarloan.layout.Login;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Ansori San
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Connection conn = (Connection) ConnectionDB.conn();
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }
    
}
