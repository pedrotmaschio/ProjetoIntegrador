/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import DAO.LocacaoDAO;
import Funcionalidades.GeracaoPDF;
import Model.Locacao;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Maschio
 */
public class F_Contrato extends javax.swing.JFrame {
    static Locacao l;
    static int idAdmin;
    static int idVeiculo;
    /**
     * Creates new form F_Contrato
     */
    public F_Contrato(Locacao l, int idAdmin, int idVeiculo) {
        initComponents();
        this.l = l;
        this.idAdmin = idAdmin;
        this.idVeiculo = idVeiculo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contrato de Locação");
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(21, 190, 4));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("GERAR COMPROVANTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Comprovante de Locação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(jButton1)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LocacaoDAO locacaoDAO = new LocacaoDAO();
        locacaoDAO.Locar(idVeiculo);
        
        GeracaoPDF pdf = new GeracaoPDF();
        String url = "/";
        try {
            
            JFileChooser seleciona =  new JFileChooser();
            seleciona.setDialogTitle("Selecione o diretório no qual deseja salvar o contrato");
            seleciona.setDialogType(JFileChooser.SAVE_DIALOG);
            seleciona.setApproveButtonText("Salvar");
            seleciona.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            seleciona.setMultiSelectionEnabled(false);
            if(seleciona.showSaveDialog(seleciona) == JFileChooser.CANCEL_OPTION){
                System.exit(1);
            } else {
                url = seleciona.getSelectedFile().getAbsolutePath();
            }
            String locatario = l.getNomeLocatario();
            pdf.criarPdf((url+"\\" + locatario + ".pdf"), l);
            JOptionPane.showMessageDialog(null, "Comprovante gerado com sucesso!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar contrato!");
            throw new RuntimeException(ex);
        }
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(F_Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Contrato(l, idAdmin, idVeiculo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
