/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.controller;

import redsis.infra.AlunoDAO;
import redsis.model.Aluno;

/**
 *
 * @author David
 */
public class AlunoController {
   AlunoDAO aDAO = new AlunoDAO();
   
   public void inseir(Aluno a) 
   {
       aDAO.inserir(a);
   }
}
