/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

/**
 *
 * @author Aluno
 */
public class FrmInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrmInicio
     */
    public FrmInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipoConta = new javax.swing.ButtonGroup();
        rd_comum = new javax.swing.JRadioButton();
        rd_especial = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btn_acessar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grpTipoConta.add(rd_comum);
        rd_comum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rd_comum.setText("Comum");
        rd_comum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_comumActionPerformed(evt);
            }
        });

        grpTipoConta.add(rd_especial);
        rd_especial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rd_especial.setText("Especial");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Tipo Conta");

        btn_acessar.setText("Acessar");
        btn_acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acessarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd_comum, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_acessar)
                        .addComponent(rd_especial)))
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rd_comum)
                .addGap(18, 18, 18)
                .addComponent(rd_especial)
                .addGap(18, 18, 18)
                .addComponent(btn_acessar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acessarActionPerformed
        // TODO add your handling code here:
        if(rd_comum.isSelected()){
            Conta objConta = new Conta(5000);
            InterfaceCaixaEletronico frm_principal = new InterfaceCaixaEletronico(objConta);
            frm_principal.setVisible(true);
            this.dispose();
        }
        else {
            ContaEspecial objEspecial = new ContaEspecial(5000, 1500);
            InterfaceCaixaEletronico frm_principal = new InterfaceCaixaEletronico(objEspecial);
            frm_principal.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_btn_acessarActionPerformed

    private void rd_comumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_comumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_comumActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acessar;
    private javax.swing.ButtonGroup grpTipoConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rd_comum;
    private javax.swing.JRadioButton rd_especial;
    // End of variables declaration//GEN-END:variables
}
