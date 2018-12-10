/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.ui;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import redsis.controller.AlunoController;

/**
 *
 * @author David
 */
public class RelatorioHelper {
    
    public void relatorioAlunos()
    {
        try {

        AlunoController pc = new AlunoController();

        List beans = pc.obterTodos();

        HashMap<String, Object> params = new HashMap<String, Object>();

        //Infoma que os dados estão em um conjunto de beans

        JRBeanCollectionDataSource beanCollectionDataSource =  new JRBeanCollectionDataSource(beans);

        //Encontra o layout do relatório

         InputStream in = this.getClass().getClassLoader().getResourceAsStream("redsis/ui/relatorio_alunos.jrxml");

         //Compila o layout               

         JasperReport jasperReport = JasperCompileManager.compileReport(in);

          //Gera o relatório com os dados dos objetos  

         JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, beanCollectionDataSource);

         //Abre o visualizador do JasperReport

         JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
