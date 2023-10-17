package com.diego.agecon.view;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /*é uma anotação em Java que informa ao compilador para suprimir avisos
    específicos gerados durante a compilação do código.*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmCadastro = new javax.swing.JMenu();
        jmiCidade = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiBairro = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiTipoContato = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiContatos = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGECON - Agenda de Contatos");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jDesktop.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/arquivo.png"))); // NOI18N
        jmArquivo.setMnemonic('a');
        jmArquivo.setText("Arquivo");

        jmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/contato.png"))); // NOI18N
        jmCadastro.setMnemonic('c');
        jmCadastro.setText("Cadastro");

        jmiCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/cidade.png"))); // NOI18N
        jmiCidade.setText("Cidade");
        jmiCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCidadeActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCidade);
        jmCadastro.add(jSeparator2);

        jmiBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/bairro.png"))); // NOI18N
        jmiBairro.setText("Bairro");
        jmCadastro.add(jmiBairro);
        jmCadastro.add(jSeparator3);

        jmiTipoContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiTipoContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/tipo.png"))); // NOI18N
        jmiTipoContato.setText("Tipo de contato");
        jmCadastro.add(jmiTipoContato);

        jmArquivo.add(jmCadastro);
        jmArquivo.add(jSeparator1);

        jmiContatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/novo.png"))); // NOI18N
        jmiContatos.setText("Contatos");
        jmiContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContatosActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiContatos);

        jmbBarraMenu.add(jmArquivo);

        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diego/agecon/img/me.png"))); // NOI18N
        jmSobre.setMnemonic('s');
        jmSobre.setText("Sobre");
        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        setSize(new java.awt.Dimension(816, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiCidadeActionPerformed

    private void jmiContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContatosActionPerformed
        FormPadrao tela = new FormPadrao();
        jDesktop.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_jmiContatosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiBairro;
    private javax.swing.JMenuItem jmiCidade;
    private javax.swing.JMenuItem jmiContatos;
    private javax.swing.JMenuItem jmiTipoContato;
    // End of variables declaration//GEN-END:variables
}
