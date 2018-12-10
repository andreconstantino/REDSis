/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class TESTEREGEX {
    public static void main(String[] args) {
        String dataInicio = "2018-01-01";
        System.out.println(dataInicio.replaceAll("([0-9]+)-([0-9]+)-([0-9]+)", "$3/$2/$1"));
    }
}
