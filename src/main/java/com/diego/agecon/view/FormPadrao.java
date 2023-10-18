/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.diego.agecon.view;

import javax.swing.*;

public class FormPadrao extends javax.swing.JInternalFrame {
    
    JLabel jlConsulta;
    JTextField jtfConsulta;

    public FormPadrao() {
        initComponents();

        habilitarBotoes(true);
        jtfId.setEditable(false);
        habilitarCampos(false);
        
        // jlabel - consulta
        jlConsulta = new JLabel("Consulta");
        jlConsulta.setBounds(12, 10, 50, 25);
        jpnConsulta.add(jlConsulta);
        // jTextField - consulta
        jtfConsulta = new JTextField();
        jtfConsulta.setBounds(80, 10, 715, 25);
        jpnConsulta.add(jtfConsulta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBUttons = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jpnForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jpnConsulta = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));

        jpnBUttons.setBackground(new java.awt.Color(153, 153, 153));

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/novo.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/edit.png"))); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/remove.png"))); // NOI18N
        jbExcluir.setText("Excluir");

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/salvar.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/cancel.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/Fechar.png"))); // NOI18N
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBUttonsLayout = new javax.swing.GroupLayout(jpnBUttons);
        jpnBUttons.setLayout(jpnBUttonsLayout);
        jpnBUttonsLayout.setHorizontalGroup(
            jpnBUttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBUttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcluir)
                .addGap(73, 73, 73)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jbFechar)
                .addContainerGap())
        );
        jpnBUttonsLayout.setVerticalGroup(
            jpnBUttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBUttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnBUttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnForm.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Descrição");

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnFormLayout = new javax.swing.GroupLayout(jpnForm);
        jpnForm.setLayout(jpnFormLayout);
        jpnFormLayout.setHorizontalGroup(
            jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormLayout.createSequentialGroup()
                .addGroup(jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnFormLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFormLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtfDescricao))
                .addContainerGap())
        );
        jpnFormLayout.setVerticalGroup(
            jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jpnConsulta.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBUttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnBUttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitarBotoes(false);
        habilitarCampos(true);
        limparCampos();
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        habilitarBotoes(true);
        habilitarCampos(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
       habilitarBotoes(false);
       habilitarCampos(true);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        habilitarBotoes(true);
        habilitarCampos(false);
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    public void habilitarBotoes(boolean estado) {
        jbNovo.setEnabled(estado);
        jbEditar.setEnabled(estado);
        jbExcluir.setEnabled(estado);
        
        jbSalvar.setEnabled(!estado);
        jbCancelar.setEnabled(!estado);
    }
    
    public void habilitarCampos(boolean estado) {
        jtfDescricao.setEnabled(estado);
    }
    
    public void limparCampos() {
        jtfDescricao.setText("");
        jtfId.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpnBUttons;
    private javax.swing.JPanel jpnConsulta;
    private javax.swing.JPanel jpnForm;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfId;
    // End of variables declaration//GEN-END:variables
}
