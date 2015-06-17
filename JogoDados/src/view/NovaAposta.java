
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelo.*;
import dados.*;
import controle.*;

public class NovaAposta extends javax.swing.JFrame {

    private Principal telaAnterior;
    private IGerenciadorApostador gerenciadorapostador;
    
    /**
     * Creates new form NovoApostador
     */
    public NovaAposta() {
        initComponents();
    }
    
    public NovaAposta(Principal principal, IGerenciadorApostador gerA) {
        telaAnterior = principal;
        initComponents();
        gerenciadorapostador = gerA;
        cbApostadores.removeAllItems();
        
        for (int i = 0; i < gerenciadorapostador.getApostadores().size(); i++){
            cbApostadores.addItem(gerenciadorapostador.getApostadores().get(i).getNome());
        }
        cbObjetos.removeAllItems();
        
        EntradaSaidaDados io = new EntradaSaidaDados();                                
           
        for (int i = 0; i < io.getObjetosAposta().size(); i++){
            cbObjetos.addItem(io.getObjetosAposta().get(i).getNome());
        }        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbApostadores = new javax.swing.JComboBox();
        cbObjetos = new javax.swing.JComboBox();
        valorAposta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GA - Adicionar Aposta");
        setPreferredSize(new java.awt.Dimension(650, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Selecione o Apostador:");

        jButton1.setText("Salvar");
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

        jLabel2.setText("Selecione o Objeto da Aposta:");

        jLabel3.setText("Insira o Valor da Aposta:");

        cbApostadores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbApostadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbApostadoresActionPerformed(evt);
            }
        });

        cbObjetos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbObjetosActionPerformed(evt);
            }
        });

        valorAposta.setToolTipText("Insira o Valor da Aposta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cbApostadores, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbObjetos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valorAposta))))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addGap(40, 40, 40))
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
                    .addComponent(cbObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valorAposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(valorAposta.getText().isEmpty()){        
            JOptionPane.showMessageDialog(this, "Insira um Valor");
        }
        else{            
            float valor = Float.parseFloat(valorAposta.getText());
            int indexApostador = cbApostadores.getSelectedIndex();  
            int indexObjeto = cbObjetos.getSelectedIndex();
            
            EntradaSaidaDados io = new EntradaSaidaDados();
            
            ArrayList<ObjetoAposta> objArray = new ArrayList<ObjetoAposta>();            
            objArray.add(io.getObjetosAposta().get(indexObjeto));
            Aposta aposta = new Aposta(objArray, valor, null);
            
            //Verificação aposta
            
            IRegraJogo regra = new RegraJogoDados();  
            if(regra.aplicarRegraJogo(aposta ,gerenciadorapostador.getApostadores().get(indexApostador).getDAOAposta(), gerenciadorapostador.getDAOApostadores())){
            
                gerenciadorapostador.getApostadores().get(indexApostador).getDAOAposta().addAposta(aposta);
                telaAnterior.setEnabled(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Aposta Fora das Regras");
                telaAnterior.setEnabled(true);
            }
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
               
        
    }//GEN-LAST:event_cbApostadoresActionPerformed

    private void cbObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbObjetosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbObjetosActionPerformed

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
            java.util.logging.Logger.getLogger(NovaAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaAposta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbApostadores;
    private javax.swing.JComboBox cbObjetos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField valorAposta;
    // End of variables declaration//GEN-END:variables
}
