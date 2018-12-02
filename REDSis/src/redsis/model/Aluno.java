/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class Aluno {
    private int id;
    private String nome;
    private String prontuario;
    private String dataInicio;
    private String dataFim;
    private List<Disciplina> disciplinas = new ArrayList();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getDataInicio() {
        return dataInicio;
    }
    public String getDataInicioFormatada()
    {
        return dataInicio.replaceAll("([0-9]+)-([0-9]+)-([0-9]+)", "$3/$2/$1");
    }
    
    public void setDataInicio(String dataInicio) {
        
        this.dataInicio = dataInicio.replaceAll("([0-9]+)/([0-9]+)/([0-9]+)", "$3-$2-$1");
    }

    public String getDataFimFormatado() {
        return dataFim.replaceAll("([0-9]+)-([0-9]+)-([0-9]+)", "$3/$2/$1");
    }
    
    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim.replaceAll("([0-9]+)/([0-9]+)/([0-9]+)", "$3-$2-$1");;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplinas.add(disciplinas);
    }    
}
