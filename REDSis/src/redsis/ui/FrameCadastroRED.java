/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.ui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Andre
 */
public class FrameCadastroRED extends javax.swing.JFrame {

    /**
     * Creates new form FrameCadastroResponsaveis
     */
    public FrameCadastroRED() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        bmBarraMenu = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mnCadastrarNovo = new javax.swing.JMenuItem();
        mnVisualizarRED = new javax.swing.JMenuItem();
        mnAlterarRED = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        mnRelatorioRED = new javax.swing.JMenuItem();
        mnRelatorioREDAluno = new javax.swing.JMenuItem();
        mnUsuario = new javax.swing.JMenu();
        mnCadastrarUsuario = new javax.swing.JMenuItem();
        mnAlterarSenha = new javax.swing.JMenuItem();
        mnSuperiorSair = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro de Responsáveis");

        mnCadastro.setText("RED");

        mnCadastrarNovo.setText("Cadastrar nova...");
        mnCadastrarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarNovoActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadastrarNovo);

        mnVisualizarRED.setText("Visualizar REDs...");
        mnVisualizarRED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVisualizarREDActionPerformed(evt);
            }
        });
        mnCadastro.add(mnVisualizarRED);

        mnAlterarRED.setText("Alterar cadastro...");
        mnAlterarRED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlterarREDActionPerformed(evt);
            }
        });
        mnCadastro.add(mnAlterarRED);

        bmBarraMenu.add(mnCadastro);

        mnRelatorios.setText("Relatórios");

        mnRelatorioRED.setText("Relatório de REDs registradas");
        mnRelatorioRED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRelatorioREDActionPerformed(evt);
            }
        });
        mnRelatorios.add(mnRelatorioRED);

        mnRelatorioREDAluno.setText("Relatório de alunos e REDs");
        mnRelatorios.add(mnRelatorioREDAluno);

        bmBarraMenu.add(mnRelatorios);

        mnUsuario.setText("Usuário");

        mnCadastrarUsuario.setText("Cadastrar novo...");
        mnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarUsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mnCadastrarUsuario);

        mnAlterarSenha.setText("Alterar senha");
        mnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlterarSenhaActionPerformed(evt);
            }
        });
        mnUsuario.add(mnAlterarSenha);

        bmBarraMenu.add(mnUsuario);

        mnSuperiorSair.setText("Sair");
        mnSuperiorSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSuperiorSairActionPerformed(evt);
            }
        });

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        mnSuperiorSair.add(mnSair);

        bmBarraMenu.add(mnSuperiorSair);

        setJMenuBar(bmBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadastrarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarNovoActionPerformed
        JPanel panel = new PanelCadastrarRED();
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnCadastrarNovoActionPerformed

    private void mnSuperiorSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSuperiorSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSuperiorSairActionPerformed

    private void mnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarUsuarioActionPerformed
        JPanel panel = new PanelCadastrarUsuario();
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnCadastrarUsuarioActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlterarSenhaActionPerformed
        JPanel panel = new PanelAlterarSenha();
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnAlterarSenhaActionPerformed

    private void mnVisualizarREDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVisualizarREDActionPerformed
        JPanel panel = new PanelVisualizarREDs();
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnVisualizarREDActionPerformed

    private void mnAlterarREDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlterarREDActionPerformed
        JPanel panel = new PanelAlterarRED();
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnAlterarREDActionPerformed

    private void mnRelatorioREDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRelatorioREDActionPerformed
        // TODO add your handling code here:
        RelatorioHelper rh = new RelatorioHelper();
        rh.relatorioAlunos();
    }//GEN-LAST:event_mnRelatorioREDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmBarraMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnAlterarRED;
    private javax.swing.JMenuItem mnAlterarSenha;
    private javax.swing.JMenuItem mnCadastrarNovo;
    private javax.swing.JMenuItem mnCadastrarUsuario;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnRelatorioRED;
    private javax.swing.JMenuItem mnRelatorioREDAluno;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenu mnSuperiorSair;
    private javax.swing.JMenu mnUsuario;
    private javax.swing.JMenuItem mnVisualizarRED;
    // End of variables declaration//GEN-END:variables
}
