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
import java.util.ArrayList;
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
    
    public void inserirDisciplina(Disciplina d, int codAluno) throws SQLException 
    {
        try {
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("INSERT INTO disciplinas(nome,sigla,professor,semestre,ano,aluno_id) VALUES(?,?,?,?,?,?)");
                                       
                stm.setString(1, d.getNome());
                stm.setString(2, d.getSigla());
                stm.setString(3, d.getProfessor());
                stm.setString(4, d.getSemestre());
                stm.setString(5, d.getAno());
                stm.setInt(6,codAluno);
                stm.executeUpdate();
                stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Disciplina> obterDisciplinas(int codAluno)
    {
        List<Disciplina> disciplinas = new ArrayList();
        try {
            Connection con        = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("SELECT * FROM disciplinas WHERE aluno_id = ?");            
            stm.setInt(1, codAluno);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                Disciplina d = new Disciplina();
                d.setAno(rs.getString("ano"));
                d.setNome(rs.getString("nome"));
                d.setId(rs.getInt("id"));
                d.setProfessor(rs.getString("professor"));
                d.setSemestre(rs.getString("semestre"));
                d.setSigla(rs.getString("sigla"));
                
                disciplinas.add(d);
            }
            stm.close();
            
            return disciplinas;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return disciplinas;
    }
    
    public List<Aluno> obterTodos()
    {
        List<Aluno> alunos = new ArrayList();
        try {
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("Select * from alunos");   
            ResultSet rs = stm.executeQuery();            
            
            while(rs.next())
            {
                Aluno a = new Aluno();                
                a.setNome(rs.getString("nome"));
                a.setId(rs.getInt("id"));
                a.setProntuario(rs.getString("prontuario"));
                a.setDataInicio(rs.getString("data_inicio"));
                a.setDataFim(rs.getString("data_fim"));
                
                a.setTodasDisciplinas(obterDisciplinas(a.getId()));
                alunos.add(a);
            }            
            
            return alunos;
        }catch(SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return alunos;
        
    }
    
    public List<Disciplina> obterTodasDisciplinas()
    {
        List<Disciplina> disciplinas = new ArrayList();
        try {
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("Select disciplinas.*, alunos.nome as aluno, alunos.prontuario, alunos.data_inicio, alunos.data_fim from disciplinas join alunos on disciplinas.aluno_id = alunos.id");   
            ResultSet rs = stm.executeQuery();            
            
            while(rs.next())
            {
                Disciplina d = new Disciplina();                
                d.setNome(rs.getString("nome"));                
                d.setProfessor(rs.getString("professor"));
                d.setSemestre(rs.getString("semestre"));
                d.setAno(rs.getString("ano"));
                Aluno a = new Aluno();
                a.setNome(rs.getString("aluno"));
                d.setAluno(a);
                
                disciplinas.add(d);
                
            }            
            
            return disciplinas;
        }catch(SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return disciplinas;
        
    }
    
    
    public void remover(int codigo)
    {
        try {
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("DELETE FROM alunos WHERE id = ?");   
            stm.setInt(1, codigo);
            stm.executeUpdate();                                                            
        }catch(SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(Aluno a) {
        try {
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("UPDATE alunos SET nome = ?, prontuario = ?, data_inicio = ?, data_fim = ? WHERE id = ?");                           
            stm.setString(1, a.getNome());
            stm.setString(2, a.getProntuario());
            stm.setString(3, a.getDataInicio());
            stm.setString(4, a.getDataFim());
            stm.setInt(5, a.getId());
            
            stm.executeUpdate();
            
            alterarDisciplinas(a);
        }catch(SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void alterarDisciplinas(Aluno a)
    {
        Iterator i     = a.getDisciplinas().iterator();
        Connection con = ConnectionFactory.obterConexao();
        int codAluno   = a.getId();
        try {                
            PreparedStatement stm;
            while(i.hasNext())
            {
                Disciplina d = (Disciplina) i.next();
                
                if(d.getId() > 0)
                {
                    stm = con.prepareStatement("UPDATE disciplinas SET nome = ?, sigla = ?, professor = ?, semestre = ?, ano = ? WHERE id = ?");               
                    stm.setString(1, d.getNome());
                    stm.setString(2, d.getSigla());
                    stm.setString(3, d.getProfessor());
                    stm.setString(4, d.getSemestre());
                    stm.setString(5, d.getAno());
                    stm.setInt(6,d.getId());
                }else{
                    inserirDisciplina(d,codAluno);
                }
                
            }            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removerDisciplina(int codDisciplina) {
         try {
            Connection con = ConnectionFactory.obterConexao();
            PreparedStatement stm = con.prepareStatement("DELETE FROM disciplinas WHERE id = ?");   
            stm.setInt(1, codDisciplina);
            stm.executeUpdate();                                                            
        }catch(SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
