/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.Locatario;
import Model.Validacao;
import DAO.LocatarioDAO;
import DAO.LocatarioDAO;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Pedro Maschio
 */
public class F_EditarLocatario extends javax.swing.JFrame {
    LocatarioDAO locatarioDAO;
    static int idLocatario, idAdmin;
    MaskFormatter mascaraCPF, mascaraCNH;
    MaskFormatter mascaraNascimento, mascaraTelefone;
    
    public void defineMascaras(){
        try{
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraNascimento = new MaskFormatter("##/##/####");
            mascaraTelefone = new MaskFormatter("(##)#####-####");
            mascaraCNH = new MaskFormatter("###########");
            mascaraCNH.install(f_cnh);
            mascaraCPF.install(f_cpf);
            mascaraNascimento.install(f_nascimento);
            mascaraTelefone.install(f_telefone);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
        }
    }

    /**
     * Creates new form F_EditarLocatario
     */
    public F_EditarLocatario(int idLocatario, int idAdmin) {
        locatarioDAO = new LocatarioDAO();
        initComponents();
        defineMascaras();
        this.idLocatario = idLocatario;
        this.idAdmin = idAdmin;
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        f_nome = new javax.swing.JTextField();
        f_cidade = new javax.swing.JTextField();
        f_email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        f_cpf = new javax.swing.JFormattedTextField();
        f_nascimento = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        f_telefone = new javax.swing.JFormattedTextField();
        f_cnh = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        f_endereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        f_bairro = new javax.swing.JTextField();
        f_numero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CheckBox_SN = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Locatário");
        setPreferredSize(new java.awt.Dimension(699, 450));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Editar Locatário");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome Completo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Data de Nascimento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Número da CNH:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("CPF:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cidade:                  ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("E-mail:");

        f_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        f_cidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        f_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(21, 190, 4));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        f_cpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        f_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_cpfActionPerformed(evt);
            }
        });

        f_nascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Telefone:");

        f_telefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        f_cnh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Endereço:");

        f_endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Bairro:");

        f_bairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        f_numero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Número:");

        CheckBox_SN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox_SN.setText("S/N");
        CheckBox_SN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_SNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f_cnh, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(f_endereco)
                                            .addComponent(f_cidade, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(f_nascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(f_numero, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CheckBox_SN)
                                                .addGap(16, 16, 16)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11))))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(f_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(f_cpf)
                                    .addComponent(f_email)
                                    .addComponent(f_bairro)))
                            .addComponent(f_nome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(f_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(f_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(f_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(f_cnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addComponent(f_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(f_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(f_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(f_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(CheckBox_SN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if(Validacao.validarCPF(f_cpf.getText())){
            if(Validacao.validarCNH(f_cnh.getText())){
                    if(Validacao.validarEmail(f_email.getText().trim())){
                        Locatario locatario = new Locatario();
                        locatario.setNomeCompleto(f_nome.getText().trim());
                        locatario.setNascimento(f_nascimento.getText());
                        locatario.setCnh(f_cnh.getText().trim());
                        locatario.setCpf(f_cpf.getText());
                        locatario.setEndereco(f_endereco.getText().trim());
                        locatario.setEmail(f_email.getText().trim());
                        locatario.setTelefone(f_telefone.getText());
                        locatario.setCidade(f_cidade.getText().trim());
                        locatario.setBairro(f_bairro.getText().trim());
                        if(CheckBox_SN.isSelected()){
                            locatario.setNumero("S/N");
                        } else {
                            locatario.setNumero(f_numero.getText().trim());
                        }
                        locatario.setIdAdmin(idAdmin);
                        locatario.setId(idLocatario);
                        LocatarioDAO l = new LocatarioDAO();
                        l.editar(locatario);
                        JOptionPane.showMessageDialog(null, "Locatário editado com sucesso!");
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Informe um e-mail válido!");
                    }
                 
            } else {
                JOptionPane.showMessageDialog(null, "Informe um número de CNH válido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe um CPF válido!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void f_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_cpfActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_f_cpfActionPerformed

    private void CheckBox_SNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_SNActionPerformed
        // TODO add your handling code here:
        if(f_numero.isEnabled()){
            f_numero.setEnabled(false);
        } else
        f_numero.setEnabled(true);
    }//GEN-LAST:event_CheckBox_SNActionPerformed
    public void preencheCampos(){
        LocatarioDAO l = new LocatarioDAO();
        Locatario locatario = new Locatario();
        
        
        locatario = l.buscar(idLocatario, idAdmin);
        f_nome.setText(locatario.getNomeCompleto());
        f_nascimento.setText(locatario.getNascimento());
        f_cnh.setText(locatario.getCnh());
        f_telefone.setText(locatario.getTelefone());
        f_cpf.setText(locatario.getCpf());
        f_endereco.setText(locatario.getEndereco());
        f_cidade.setText(locatario.getCidade());
        f_bairro.setText(locatario.getBairro());
        if(locatario.getNumero().equals("S/N")){
            CheckBox_SN.setSelected(true);
            f_numero.setEnabled(false);
        } else {
            CheckBox_SN.setSelected(false);
            f_numero.setText(locatario.getNumero());
        }
        f_email.setText(locatario.getEmail());
    }
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
            java.util.logging.Logger.getLogger(F_EditarLocatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_EditarLocatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_EditarLocatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_EditarLocatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_EditarLocatario(idLocatario, idAdmin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox_SN;
    private javax.swing.JTextField f_bairro;
    private javax.swing.JTextField f_cidade;
    private javax.swing.JFormattedTextField f_cnh;
    private javax.swing.JFormattedTextField f_cpf;
    private javax.swing.JTextField f_email;
    private javax.swing.JTextField f_endereco;
    private javax.swing.JFormattedTextField f_nascimento;
    private javax.swing.JTextField f_nome;
    private javax.swing.JTextField f_numero;
    private javax.swing.JFormattedTextField f_telefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
