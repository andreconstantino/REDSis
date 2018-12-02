/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import redsis.model.Disciplina;

/**
 *
 * @author David
 */
public class DisciplinaTabelaModelo extends AbstractTableModel {
    private List<Disciplina> disciplinas;
    private String[] nomeColunas = {"Disciplina", "Professor"};

    DisciplinaTabelaModelo(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return nomeColunas[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return disciplinas.size();
    }

    @Override
    public int getColumnCount() {
        return this.nomeColunas.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Disciplina d = disciplinas.get(rowIndex);
       switch(columnIndex) {
           case 0:
               return d.getNome();
           case 1:
               return d.getProfessor();           
           default:
               return "Valor inválido";
       }
    }
    
}
