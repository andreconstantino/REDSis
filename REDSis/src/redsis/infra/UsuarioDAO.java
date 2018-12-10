/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.infra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import redsis.model.Usuario;

/**
 *
 * @author David
 */
public class UsuarioDAO {
    
    public void inserir(Usuario u) {
        try {            
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("INSERT INTO usuarios(nome,prontuario,senha) VALUES(?,?,?)");
            stm.setString(1, u.getNome());
            stm.setString(2, u.getProntuario());
            stm.setString(3, u.getSenha());            
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void alterar(Usuario u) {
        try {            
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("UPDATE usuarios SET nome = ?, prontuario = ?, senha = ? WHERE id = ?");
            stm.setString(1, u.getNome());
            stm.setString(2, u.getProntuario());
            stm.setString(3, u.getSenha());
            stm.setInt(4, u.getId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void remover(int id) {
        try {            
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("DELETE FROM usuarios WHERE id = ?");
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public Usuario obter(int id)
    {
        try {            
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("SELECT * FROM usuarios WHERE id = ?");
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setProntuario(rs.getString("prontuario"));
                u.setSenha(rs.getString("senha"));
                
                return u;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public Usuario login(Usuario u)
    {
        try {            
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("SELECT * FROM usuarios WHERE prontuario = ? AND senha = ?");
            stm.setString(1, u.getProntuario());
            stm.setString(2, u.getSenha());
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {                                
                
                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setProntuario(rs.getString("prontuario"));
                u.setSenha(rs.getString("senha"));
                return u;
            }
            
            return null;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public boolean login(String prontuario, String senha)
    {
        try {            
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("SELECT * FROM usuarios WHERE prontuario = ? AND senha = ?");
            stm.setString(1, prontuario);
            stm.setString(2, senha);
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {                                                                
                return true;
            }
            
            return false;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
