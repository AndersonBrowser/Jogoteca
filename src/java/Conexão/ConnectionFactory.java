/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ander
 */
public class ConnectionFactory {
    public static Connection getConnection() {
    try{
    Class.forName("com.mysql.jdbc.Driver");
    return DriverManager.getConnection("jdbc:mysql://localhost/jogoteca","root","1234");
    } catch(SQLException ex){
    Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
    throw new RuntimeException("Erro SQLExcepiton ao abrir conexão", ex);
    } catch(ClassNotFoundException ex){
    Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
    throw new RuntimeException("Erro ClasseNotFoundException", ex);
        }    
    }
    
}
