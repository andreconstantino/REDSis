/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.controller;

import java.util.List;
import redsis.infra.AlunoDAO;
import redsis.model.Aluno;
import redsis.model.Disciplina;

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
   
   
   public List<Aluno> obterTodos()
   {
       return aDAO.obterTodos();
   }
   
   public void remover(int codigo)
   {
        aDAO.remover(codigo);
   }
   
   public void alterar(Aluno a)
   {
       aDAO.alterar(a);
   }
   
   public void removerDisciplina(int codDisciplina)
   {
       aDAO.removerDisciplina(codDisciplina);
   }
   
   public List<Disciplina> obterDisciplinas()
   {
       return aDAO.obterTodasDisciplinas();
   }
}
