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
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import redsis.model.Aluno;
import redsis.model.Disciplina;

/**
 *
 * @author David
 */
public class AlunoDAO {
    public void inserir(Aluno a) {
        try {            
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("INSERT INTO alunos(nome,prontuario,data_inicio,data_fim) VALUES(?,?,?,?)");
            stm.setString(1, a.getNome());
            stm.setString(2, a.getProntuario());            
            stm.setString(3, a.getDataInicio());            
            stm.setString(4, a.getDataFim());            
            stm.executeUpdate();
            
            
            ResultSet rs = stm.executeQuery("SELECT id FROM alunos ORDER BY id DESC");
            if(rs.next())
            {
                a.setId(rs.getInt("id"));
            }
            
            inserirDisciplinas(a);
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void inserirDisciplinas(Aluno a)
    {
        Iterator i = a.getDisciplinas().iterator();
        Connection con = ConnectionFactory.obterConexao();
        try {
            PreparedStatement stm = con.prepareStatement("INSERT INTO disciplinas(nome,sigla,professor,semestre,ano,aluno_id) VALUES(?,?,?,?,?,?)");
            
            while(i.hasNext())
            {
                Disciplina d = (Disciplina) i.next();
                stm.setString(1, d.getNome());
                stm.setString(2, d.getSigla());
                stm.setString(3, d.getProfessor());
                stm.setString(4, d.getSemestre());
                stm.setString(5, d.getAno());
                stm.setInt(6, a.getId());
                stm.executeUpdate();
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
