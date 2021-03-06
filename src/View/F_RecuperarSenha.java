/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.AdministradorDAO;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Pedro Maschio
 */
public class F_RecuperarSenha extends javax.swing.JFrame {
    AdministradorDAO administradorDAO;
    /**
     * Creates new form F_RecuperarSenha
     */
    public void mascaraCampos(){
        try {
            MaskFormatter mascaraNascimento = new MaskFormatter("##/##/####");
            MaskFormatter mascaraCNPJ = new MaskFormatter("##.###.###/####-##");
            mascaraNascimento.install(f_nascimento);
            mascaraCNPJ.install(f_CNPJ);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
    public F_RecuperarSenha() {
        initComponents();
        administradorDAO = new AdministradorDAO();
        mascaraCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        f_senha1 = new javax.swing.JPasswordField();
        f_senha2 = new javax.swing.JPasswordField();
        f_CNPJ = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        f_nascimento = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recuperação de Senha");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Recuperação de Senha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Para nos ajudar a recuperar a sua senha, você precisa nos ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CNPJ:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nova Senha: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Confirme a nova senha:");

        jButton1.setBackground(new java.awt.Color(21, 190, 4));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Recuperar senha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        f_senha1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        f_senha1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_senha1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_senha1FocusLost(evt);
            }
        });

        f_senha2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        f_senha2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_senha2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_senha2FocusLost(evt);
            }
        });
        f_senha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_senha2ActionPerformed(evt);
            }
        });

        f_CNPJ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        f_CNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_CNPJFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_CNPJFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Data de Nascimento:");

        f_nascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        f_nascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_nascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_nascimentoFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("fornecer algumas informações.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f_senha2)
                                    .addComponent(f_senha1)
                                    .addComponent(f_CNPJ)
                                    .addComponent(f_nascimento)))
                            .addComponent(jLabel8)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(f_senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(f_senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void f_senha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_senha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_senha2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String senha1 = new String (f_senha1.getPassword());
        String senha2 = new String (f_senha2.getPassword());
        if(administradorDAO.buscaCNPJ(f_CNPJ.getText())){
            if(senha1.equals(senha2)){
                administradorDAO.atualizaSenha(String.valueOf(f_senha1.getPassword()).trim(), f_CNPJ.getText());
                JOptionPane.showMessageDialog(null, "Senha recuperada com sucesso!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há Administrador cadastrado sob esse CNPJ!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void f_CNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_CNPJFocusLost
        if(f_CNPJ.getText().equals("  .   .   /    -  ")){
            f_CNPJ.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_f_CNPJFocusLost

    private void f_nascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_nascimentoFocusLost
        if(f_nascimento.getText().equals("  /  /    ")){
            f_nascimento.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_f_nascimentoFocusLost

    private void f_CNPJFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_CNPJFocusGained
        f_CNPJ.setBackground(java.awt.Color.WHITE);         // TODO add your handling code here:
    }//GEN-LAST:event_f_CNPJFocusGained

    private void f_nascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_nascimentoFocusGained
        f_nascimento.setBackground(java.awt.Color.WHITE);         // TODO add your handling code here:
    }//GEN-LAST:event_f_nascimentoFocusGained

    private void f_senha1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_senha1FocusLost
        String senha1 = new String(f_senha2.getPassword());
        if(senha1.equals("")){
            f_nascimento.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
            
        }              // TODO add your handling code here:
    }//GEN-LAST:event_f_senha1FocusLost

    private void f_senha2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_senha2FocusLost
        if(f_senha2.getPassword().equals("")){
            f_nascimento.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
        }         // TODO add your handling code here:
    }//GEN-LAST:event_f_senha2FocusLost

    private void f_senha1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_senha1FocusGained
        f_senha1.setBackground(java.awt.Color.WHITE);         // TODO add your handling code here:
    }//GEN-LAST:event_f_senha1FocusGained

    private void f_senha2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_senha2FocusGained
        f_senha2.setBackground(java.awt.Color.WHITE);     
        // TODO add your handling code here:
    }//GEN-LAST:event_f_senha2FocusGained

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
            java.util.logging.Logger.getLogger(F_RecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_RecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_RecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_RecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_RecuperarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField f_CNPJ;
    private javax.swing.JFormattedTextField f_nascimento;
    private javax.swing.JPasswordField f_senha1;
    private javax.swing.JPasswordField f_senha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
