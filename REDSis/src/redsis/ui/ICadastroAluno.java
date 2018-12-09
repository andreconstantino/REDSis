/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.ui;

import redsis.model.Disciplina;

/**
 *
 * @author David
 */
public interface ICadastroAluno {
    public void addDisciplina(Disciplina d);
    public void listarDisciplinas();
}
