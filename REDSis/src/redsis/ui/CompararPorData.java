/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import redsis.model.Aluno;

/**
 *
 * @author David
 */
public class CompararPorData implements Comparator<Aluno> {
    
    private SimpleDateFormat sdf = new SimpleDateFormat("Y-m-d");
    
    @Override
    public int compare(Aluno o1, Aluno o2) {
        int result =  -1;
        try {
            result = sdf.parse(o1.getDataInicio()).compareTo(sdf.parse(o2.getDataInicio()));
        } catch (ParseException ex) {
            Logger.getLogger(CompararPorData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
}
