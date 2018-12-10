/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.ui;

import java.util.Comparator;
import redsis.model.Aluno;

/**
 *
 * @author David
 */
public class CompararPorProntuario implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getProntuario().compareTo(o2.getProntuario());
    }
    
}
