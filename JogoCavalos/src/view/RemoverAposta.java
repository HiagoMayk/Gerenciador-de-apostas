
package view;

import controle.IGerenciadorApostador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelo.Apostador;

public class RemoverAposta extends javax.swing.JFrame {

    private Principal telaAnterior;
    private IGerenciadorApostador gerenciadorapostador;
    private boolean selecionou = false;
    
    /**
     * Creates new form NovoApostador
     */
    public RemoverAposta() {
        initComponents();
    }
    
    public RemoverAposta(Principal principal,IGerenciadorApostador gerA ) {
        telaAnterior = principal;
        initComponents();
        
        cbApostadores.removeAllItems();
        gerenciadorapostador = gerA;
        
        for (int i = 0; i < gerenciadorapostador.getApostadores().size(); i++){
            cbApostadores.addItem(gerenciadorapostador.getApostadores().get(i).getNome());
        }
   
        cbApostas.removeAllItems();              
                        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbApostadores = new javax.swing.JComboBox();
        cbApostas = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GA - Remover Aposta");
        setPreferredSize(new java.awt.Dimension(650, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Selecione o Apostador:");

        jButton1.setText("Remover");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione  Aposta:");

        cbApostadores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbApostadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbApostadoresActionPerformed(evt);
            }
        });

        cbApostas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbApostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbApostasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbApostadores, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(cbApostas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbApostadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addComponent(cbApostas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(selecionou){ 
                     
            int indexApostador = cbApostadores.getSelectedIndex();
            int indexAposta = cbApostas.getSelectedIndex();
            
            gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().remove(indexAposta);
            telaAnterior.setEnabled(true);
            this.dispose();
        }
        else{            
            JOptionPane.showMessageDialog(this, "Escolha Uma Aposta");
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        telaAnterior.setEnabled(true);
        this.dispose();              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Ao fechar a janela;
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void cbApostadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbApostadoresActionPerformed
    
        int indexApostador = cbApostadores.getSelectedIndex();         
        cbApostas.removeAllItems();  

        if (indexApostador > -1){
            for (int i = 0; i < gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().size() ; i++)//PARA CADA APOSTA
            {
                if(gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().get(i).getManeira().equals("Dupla"))
                {
                    cbApostas.addItem("Maneira :" + gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().get(i).getManeira() + "(" +
                                      gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().get(i).getObjetosAposta().get(0).getNome() +"-" +
                                      gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().get(i).getObjetosAposta().get(1).getNome() +") " +
                                      gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().get(i).getValor() + " reais");                
                }
                else{
                cbApostas.addItem("Maneira:" + gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().get(i).getManeira() + "(" +
                                  gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().get(i).getObjetosAposta().get(0).getNome() +") " +
                                  gerenciadorapostador.getApostador(indexApostador).getDAOAposta().getApostas().get(i).getValor()+ " reais");                
                }
            }
        }
        
    }//GEN-LAST:event_cbApostadoresActionPerformed

    private void cbApostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbApostasActionPerformed
        selecionou = true;
        
    }//GEN-LAST:event_cbApostasActionPerformed

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
            java.util.logging.Logger.getLogger(RemoverAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverAposta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbApostadores;
    private javax.swing.JComboBox cbApostas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
