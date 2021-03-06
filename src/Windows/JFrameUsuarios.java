/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Controle.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author CJAMORIM
 */
public class JFrameUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form JFrameUsuarios
     */
    public JFrameUsuarios() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        JavaAppAgendaPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("JavaAppAgendaPU").createEntityManager();
        usuarioQuery = java.beans.Beans.isDesignTime() ? null : JavaAppAgendaPUEntityManager.createQuery("SELECT u FROM Usuario u");
        usuarioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(usuarioQuery.getResultList());
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmSenha = new javax.swing.JPasswordField();
        jButtonInserir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelConfirmSenha = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonVerTarefas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, usuarioList, jTableUsuarios);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${senha}"));
        columnBinding.setColumnName("Senha");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jTableUsuarios);

        jTextFieldId.setEditable(false);
        jTextFieldId.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableUsuarios, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id}"), jTextFieldId, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableUsuarios, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), jTextFieldNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTableUsuarios, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.senha}"), jPasswordFieldSenha, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        jPasswordFieldConfirmSenha.setText("jPasswordField2");

        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabelId.setText("ID");

        jLabelNome.setText("Nome");

        jLabelSenha.setText("Senha");

        jLabelConfirmSenha.setText("Confir. senha");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonVerTarefas.setText("Ver Tarefas");
        jButtonVerTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerTarefasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelSenha)
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelConfirmSenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordFieldConfirmSenha)
                                    .addComponent(jPasswordFieldSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelId)
                                .addGap(32, 32, 32)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jButtonVerTarefas))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInserir)
                    .addComponent(jButtonVerTarefas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSenha)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPasswordFieldConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelConfirmSenha))
                    .addComponent(jButtonExcluir))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed


        // TODO add your handling code here:
        
        Usuario usuario = new Usuario();
        this.usuarioList.add(usuario);
 
        // Seleciona objeto inserido na lista e estabelece foco
        this.jTableUsuarios.setRowSelectionInterval(this.jTableUsuarios.getRowCount() - 1, this.jTableUsuarios.getRowCount() - 1);
        this.jTextFieldNome.requestFocus();
 
        //Configura botões
        this.jButtonInserir.setEnabled(false);
        this.jButtonExcluir.setEnabled(false);
        this.jButtonCancelar.setEnabled(true);
        this.jButtonSalvar.setEnabled(true);
        this.jButtonVerTarefas.setEnabled(false);
 
        this.estado = Estado.INSERINDO;
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
         try {
            if (this.jPasswordFieldSenha.getText().equals(this.jPasswordFieldConfirmSenha.getText())) {
                // Cria e configura o objeto
                Usuario usuario = new Usuario();
 
 
                if (this.estado == Estado.INSERINDO) {
 
                    // Atualiza o objeto
                    usuario.setNome(this.jTextFieldNome.getText());
                    usuario.setSenha(this.jPasswordFieldSenha.getText());
 
                    if (usuario.armazenado()) { // Se armazenado objeto no BD
 
                        // Retira o objeto da lista e o adiciona com o id
                        this.usuarioList.remove(this.jTableUsuarios.getSelectedRow());
                        this.usuarioList.add(usuario);
 
                        // Seleciona o último da lista
                        this.jTableUsuarios.setRowSelectionInterval(this.jTableUsuarios.getRowCount() - 1, this.jTableUsuarios.getRowCount() - 1);
                        this.jButtonInserir.setEnabled(true);
                        this.jButtonExcluir.setEnabled(this.jTableUsuarios.getRowCount() != 0);
                        this.jButtonCancelar.setEnabled(false);
                        this.jButtonSalvar.setEnabled(false);
                        this.jButtonVerTarefas.setEnabled(this.jTableUsuarios.getRowCount() != 0);
 
                        this.estado = Estado.CONSULTANDO;
                    }
                } else {
                    // Encontra e carrega o objeto de atualização
                    if (usuario.encontradoId(Long.valueOf(this.jTextFieldId.getText()))) {
 
                        // Atualiza o objeto
                        usuario.setNome(this.jTextFieldNome.getText());
                        usuario.setSenha(this.jPasswordFieldSenha.getText());
 
                        if (usuario.atualizado()) { // Se atualizado objeto no BD
 
                            // Seleciona o último da lista
                            this.jButtonInserir.setEnabled(true);
                            this.jButtonExcluir.setEnabled(this.jTableUsuarios.getRowCount() != 0);
                            this.jButtonCancelar.setEnabled(false);
                            this.jButtonSalvar.setEnabled(false);
                            this.jButtonVerTarefas.setEnabled(this.jTableUsuarios.getRowCount() != 0);
 
                            this.estado = Estado.CONSULTANDO;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Confirmação de senha não coincidente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        
        try {
            if (this.estado == Estado.INSERINDO) {
                this.usuarioList.remove(this.jTableUsuarios.getSelectedRow()); // Remove objeto inserido na lista
                if (this.jTableUsuarios.getRowCount() > 0) { // Se houver objetos na lista
                    // Seleciona o último da lista
                    this.jTableUsuarios.setRowSelectionInterval(this.jTableUsuarios.getRowCount() - 1, this.jTableUsuarios.getRowCount() - 1);
                }
            } else {
                Usuario usuario = new Usuario();
                if (usuario.encontradoId(Long.valueOf(this.jTextFieldId.getText()))) {
                    this.jTextFieldNome.setText(usuario.getNome());
                    this.jPasswordFieldSenha.setText(usuario.getSenha());
                }
 
            }
 
            //Configura botões
            this.jButtonInserir.setEnabled(true);
            this.jButtonExcluir.setEnabled(this.jTableUsuarios.getRowCount() != 0);
            this.jButtonCancelar.setEnabled(false);
            this.jButtonSalvar.setEnabled(false);
            this.jButtonVerTarefas.setEnabled(this.jTableUsuarios.getRowCount() != 0);
            this.estado = Estado.CONSULTANDO;
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        
         if (JOptionPane.showConfirmDialog(rootPane, "Confirma a exclusão deste registro?") == JOptionPane.OK_OPTION) {
            try {
                Usuario usuario = new Usuario(); // Cria o objeto
                usuario.setId(Long.valueOf(this.jTextFieldId.getText())); // Configura o id de exclusão 
                if (usuario.desarmazenado()) { // Exclui o objeto do BD
                    int linhaSelecionada = this.jTableUsuarios.getSelectedRow(); // Marca linha selecionada da tabela
                    this.usuarioList.remove(this.jTableUsuarios.getSelectedRow()); // Remove objeto da lista
                    if (this.jTableUsuarios.getRowCount() > 0) { // Se houver linhas na tabela
                        if (linhaSelecionada > 0) {
                            linhaSelecionada--;
                        }
                        this.jTableUsuarios.setRowSelectionInterval(linhaSelecionada, linhaSelecionada); // Seleciona linha marcada
                    }
 
                    //Configura botões
                    this.jButtonInserir.setEnabled(true);
                    this.jButtonExcluir.setEnabled(this.jTableUsuarios.getRowCount() != 0);
                    this.jButtonCancelar.setEnabled(false);
                    this.jButtonSalvar.setEnabled(false);
                    this.jButtonVerTarefas.setEnabled(this.jTableUsuarios.getRowCount() != 0);
 
                    this.estado = Estado.CONSULTANDO;
 
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        if (this.jTableUsuarios.getRowCount() > 0) { // Se houver linhas na lista
            this.jTableUsuarios.setRowSelectionInterval(0, 0); // Seleciona linha 0
        }
 
        // Configura botões 
        this.jButtonInserir.setEnabled(true);
        this.jButtonExcluir.setEnabled(this.jTableUsuarios.getRowCount() != 0);
        this.jButtonCancelar.setEnabled(false);
        this.jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        // TODO add your handling code here:
        
         this.jButtonInserir.setEnabled(false);
        this.jButtonExcluir.setEnabled(false);
        this.jButtonCancelar.setEnabled(true);
        this.jButtonSalvar.setEnabled(true);
        this.jButtonVerTarefas.setEnabled(this.jTableUsuarios.getRowCount() != 0);
 
        if (this.estado == Estado.CONSULTANDO) {
            if (this.jTableUsuarios.getRowCount() != 0) {
                this.estado = Estado.EDITANDO;
            } else {
                this.jButtonInserirActionPerformed(null);
            }
        }
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jButtonVerTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerTarefasActionPerformed
        // TODO add your handling code here:
        
        Usuario usuario = new Usuario(); 
        usuario.encontradoId(Long.valueOf(this.jTextFieldId.getText()));
        
        JFrameTarefas jFrameTarefas = new JFrameTarefas(usuario);
        jFrameTarefas.setLocationRelativeTo(null); // Janela no centro
        
        jFrameTarefas.setVisible(true);
    }//GEN-LAST:event_jButtonVerTarefasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUsuarios().setVisible(true);
            }
        });
    }
    
    private enum Estado {
        INSERINDO,
        EDITANDO,
        CONSULTANDO
    }
 
    private Estado estado = Estado.CONSULTANDO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager JavaAppAgendaPUEntityManager;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVerTarefas;
    private javax.swing.JLabel jLabelConfirmSenha;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPasswordFieldConfirmSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private java.util.List<Controle.Usuario> usuarioList;
    private javax.persistence.Query usuarioQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
