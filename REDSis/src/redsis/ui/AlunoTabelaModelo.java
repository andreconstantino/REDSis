/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.ui;

import redsis.model.Aluno;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author David
 */
public class AlunoTabelaModelo extends AbstractTableModel {
    private List<Aluno> alunos;
    private String[] nomeColunas = {"Prontuario", "Nome","Data de Inicio","Data fim"};
    
    public AlunoTabelaModelo(List<Aluno> alunos)
    {
        this.alunos = alunos;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return nomeColunas[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return this.nomeColunas.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Aluno d = alunos.get(rowIndex);
       switch(columnIndex) {
           case 0:
               return d.getProntuario();
           case 1:
               return d.getNome();           
           case 2:
               return d.getDataInicioFormatada();
           case 3:
               return d.getDataFimFormatado();
           default:
               return "Valor inválido";
       }
    }
    
}
