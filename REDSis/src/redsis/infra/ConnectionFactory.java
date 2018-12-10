/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author David
 */
public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL    = "jdbc:mysql://localhost:3306/redsis";
    private static final String USER   = "root";
    private static final String PASS   = "123"; // alterar senha.
    private static Connection con = null;

    public static Connection obterConexao() {
        try {
            if(con == null)
            {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, USER, PASS);
            }
            return con;
                
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
}
