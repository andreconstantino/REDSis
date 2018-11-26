/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.controller;

import redsis.infra.UsuarioDAO;
import redsis.model.Usuario;

/**
 *
 * @author David
 */
public class UsuarioController {
    
    UsuarioDAO uDAO = new UsuarioDAO();
    
    public Usuario login(Usuario u)
    {
        return uDAO.login(u);
    }
    
    public boolean login(String prontuario, String senha)
    {
        return uDAO.login(prontuario,senha);
    }

    public void inserir(Usuario u) {
        uDAO.inserir(u);
    }
    
    public void alterar(Usuario u)
    {
        uDAO.alterar(u);
    }
}
