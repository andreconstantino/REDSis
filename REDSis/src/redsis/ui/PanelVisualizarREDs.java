/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redsis.ui;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import redsis.controller.AlunoController;
import redsis.model.Aluno;

/**
 *
 * @author Andre
 */
public class PanelVisualizarREDs extends javax.swing.JPanel {
    AlunoController aController = new AlunoController();
    List<Aluno> alunos          = new ArrayList();
    /**
     * Creates new form PanelVisualizarAlunos
     */
    public PanelVisualizarREDs() {
        initComponents();                
        alunos                    = aController.obterTodos();  
        listarAlunos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btOrdenarProntuario = new javax.swing.JButton();
        btOrdenarDataInicio = new javax.swing.JButton();
        btOrdenarNome = new javax.swing.JButton();
        btAlterarAluno = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbProcurar = new javax.swing.JLabel();
        btProcurarAluno = new javax.swing.JButton();
        tfProntuarioProcurar = new javax.swing.JTextField();
        jsBarraRolagem = new javax.swing.JScrollPane();
        tbAlunos = new javax.swing.JTable();

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Visualização de REDs");

        btOrdenarProntuario.setText("Ordernar por prontuário");
        btOrdenarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarProntuarioActionPerformed(evt);
            }
        });

        btOrdenarDataInicio.setText("Ordernar por data de início");
        btOrdenarDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarDataInicioActionPerformed(evt);
            }
        });

        btOrdenarNome.setText("Ordernar por nome");
        btOrdenarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarNomeActionPerformed(evt);
            }
        });

        btAlterarAluno.setText("Alterar");
        btAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarAlunoActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lbProcurar.setText("Prontuário do aluno a procurar:");

        btProcurarAluno.setText("Procurar");
        btProcurarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcurarAlunoActionPerformed(evt);
            }
        });

        tbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jsBarraRolagem.setViewportView(tbAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbProcurar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProntuarioProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btProcurarAluno))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btAlterarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btOrdenarProntuario)
                                        .addGap(42, 42, 42)
                                        .addComponent(btOrdenarNome)))
                                .addGap(56, 56, 56)
                                .addComponent(btOrdenarDataInicio))
                            .addComponent(jsBarraRolagem))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProcurar)
                    .addComponent(btProcurarAluno)
                    .addComponent(tfProntuarioProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jsBarraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btOrdenarProntuario)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btOrdenarDataInicio)
                        .addComponent(btOrdenarNome)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAlterarAluno)
                    .addComponent(btRemover))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btOrdenarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarProntuarioActionPerformed
        CompararPorProntuario comp = new CompararPorProntuario();
        alunos.sort(comp);
        listarAlunos();
    }//GEN-LAST:event_btOrdenarProntuarioActionPerformed

    private void btOrdenarDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarDataInicioActionPerformed
        CompararPorData comp = new CompararPorData();
        alunos.sort(comp);
        listarAlunos();
    }//GEN-LAST:event_btOrdenarDataInicioActionPerformed

    private void btOrdenarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarNomeActionPerformed
        CompararAlunoPorNome comp = new CompararAlunoPorNome();
        alunos.sort(comp);
        listarAlunos();
    }//GEN-LAST:event_btOrdenarNomeActionPerformed

    private void btAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarAlunoActionPerformed
        int linhaSelecionada = tbAlunos.getSelectedRow();
        if(linhaSelecionada >= 0)
        {
            Aluno aluno = alunos.get(linhaSelecionada);        
            FrameCadastroRED f = (FrameCadastroRED) SwingUtilities.getRoot(this);
            f.setContentPane(new PanelAlterarRED(aluno));
            f.pack();                        
        }else{
            JOptionPane.showMessageDialog(this, "Selecione uma linha!");
        }
        
        
    }//GEN-LAST:event_btAlterarAlunoActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        
        int row = tbAlunos.getSelectedRow();
        Aluno a = alunos.get(row);
        aController.remover(a.getId());
        alunos.remove(row);        
        listarAlunos();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btProcurarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcurarAlunoActionPerformed
        
        Aluno a = new Aluno();
        a.setProntuario(tfProntuarioProcurar.getText());
        int posicao = alunos.indexOf(a);
        if(posicao < 0) {
            JOptionPane.showMessageDialog(this, 
                    "Não existe produto com o código informado.");
        } else {
            tbAlunos.setRowSelectionInterval(posicao, posicao);
        }
    }//GEN-LAST:event_btProcurarAlunoActionPerformed
    
    public void listarAlunos()
    {                                 
        AlunoTabelaModelo modelo = new AlunoTabelaModelo(alunos);        
        tbAlunos.setModel(modelo);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarAluno;
    private javax.swing.JButton btOrdenarDataInicio;
    private javax.swing.JButton btOrdenarNome;
    private javax.swing.JButton btOrdenarProntuario;
    private javax.swing.JButton btProcurarAluno;
    private javax.swing.JButton btRemover;
    private javax.swing.JScrollPane jsBarraRolagem;
    private javax.swing.JLabel lbProcurar;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbAlunos;
    private javax.swing.JTextField tfProntuarioProcurar;
    // End of variables declaration//GEN-END:variables
}
