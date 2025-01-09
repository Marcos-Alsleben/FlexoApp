/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import dao.ClienteDAO;
import dao.DestinoClicheDAO;
import dao.ProdutoClicheDAO;
import dao.TipoClicheDAO;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.DestinoCliche;
import model.ProdutoCliche;
import model.TipoCliche;
import model.Utilitarios;

/**
 *
 * @author gmg
 */
public class AlterarCliche extends javax.swing.JFrame {

    private GerarXML gx;

//Metodo Limpar Campos
    public void LimparCampos() {

        txt_rp.setText("");
        txt_faca.setText("");
        txt_ft.setText("");
        cb_cliente.setSelectedIndex(0);
        cb_tipocliche.setSelectedIndex(0);
        cb_destino.setSelectedIndex(0);
        cb_status.setSelectedIndex(0);
        txt_data.setText("");
        txt_idCliche.setText("");

    }

    //Metodo Atualiza ID
    public void AtualizarId(String lc) {

        txt_idCliche.setText(lc);

    }

//Metodo Atualiza RP
    public void AtualizarRp(String lc) {

        txt_rp.setText(lc);

    }

//Metodo Atualiza Faca
    public void AtualizarFaca(String lc) {

        txt_faca.setText(lc);

    }

//Metodo Atualiza FT
    public void AtualizarFt(String lc) {

        txt_ft.setText(lc);

    }

//Metodo Atualiza Cliente
    public void AtualizarCliente(String lc) {

        cb_cliente.setSelectedItem(lc);

    }

//Metodo Atualiza TipoCliche
    public void AtualizarTipoCliche(String lc) {

        cb_tipocliche.setSelectedItem(lc);

    }

//Metodo Atualiza Destino
    public void AtualizarDestino(String lc) {

        cb_destino.setSelectedItem(lc);

    }

//Metodo Atualiza Status
    public void AtualizarStatus(String lc) {

        cb_status.setSelectedItem(lc);

    }

//Metodo Atualiza data
    public void AtualizarData(String lc) {

        txt_data.setText(lc);

    }

//Metodo Atualiza cb_cliente
    public void AtualizarcbClientes() {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> lista = dao.listarCliente();

        cb_cliente.removeAllItems();
        cb_cliente.addItem("");

        for (Cliente c : lista) {
            cb_cliente.addItem(c.getNome());

        }
    }

//Metodo Atualiza cb_tipoCliche
    public void AtualizarcbTipoCliche() {
        TipoClicheDAO dao = new TipoClicheDAO();
        List<TipoCliche> lista = dao.listarTipoCliche();

        cb_tipocliche.removeAllItems();
        cb_tipocliche.addItem("");

        for (TipoCliche c : lista) {
            cb_tipocliche.addItem(c.getNome());

        }
    }

//Metodo Atualiza cb_tipoCliche
    public void AtualizarcbDestino() {
        DestinoClicheDAO dao = new DestinoClicheDAO();
        List<DestinoCliche> lista = dao.listarDestinoCliche();

        cb_destino.removeAllItems();
        cb_destino.addItem("");

        for (DestinoCliche c : lista) {
            cb_destino.addItem(c.getNome());

        }
    }

//Metodo Aponta id Cliente
    public int ApontaIdCliente() {
        int id = 0;

        ClienteDAO dao = new ClienteDAO();
        List<Cliente> lista = dao.RetornaId(cb_cliente.getSelectedItem().toString());

        for (Cliente c : lista) {
            id = c.getId();

        }
        return id;
    }

    //Metodo Aponta  id DestinoCliche
    public int ApontaIdDestinoCliente() {
        int id = 0;

        DestinoClicheDAO dao = new DestinoClicheDAO();
        List<DestinoCliche> lista = dao.RetornaId(cb_destino.getSelectedItem().toString());

        for (DestinoCliche c : lista) {
            id = c.getId();

        }
        return id;
    }

//Metodo Aponta  id TipoCliche
    public int ApontaIdTipoCliche() {
        int id = 0;

        TipoClicheDAO dao = new TipoClicheDAO();
        List<TipoCliche> lista = dao.RetornaId(cb_tipocliche.getSelectedItem().toString());

        for (TipoCliche c : lista) {
            id = c.getId();

        }
        return id;
    }

    public AlterarCliche() {
        initComponents();
        setIconImage();
        this.setResizable(false);
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
        jButton2 = new javax.swing.JButton();
        txt_idCliche = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_rp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_faca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_ft = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_cliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_tipocliche = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb_destino = new javax.swing.JComboBox<>();
        txt_data = new javax.swing.JTextField();
        jC_data = new javax.swing.JCheckBox();
        cb_status = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aterar ou Excluir Clichê");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_idCliche.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_idCliche.setForeground(new java.awt.Color(63, 63, 63));
        txt_idCliche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_idCliche.setBorder(null);
        txt_idCliche.setEnabled(false);
        txt_idCliche.setFocusable(false);
        txt_idCliche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idClicheActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText(" RP");

        txt_rp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rpKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText(" FACA");

        txt_faca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_facaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText(" FT");

        txt_ft.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ftKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setText(" CLIENTE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText(" TIPO CLICHÊ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setText(" DESTINO");

        txt_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_data.setEnabled(false);

        jC_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_dataActionPerformed(evt);
            }
        });

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "ELIMINADO" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setText(" STATUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_idCliche, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_rp)
                    .addComponent(cb_destino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_tipocliche, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ft, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_faca)
                    .addComponent(cb_cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jC_data))
                    .addComponent(cb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(txt_rp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txt_faca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txt_ft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(cb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(cb_tipocliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(cb_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jC_data)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(txt_idCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idClicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idClicheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idClicheActionPerformed

    private void txt_rpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rpKeyTyped

        String caracteres = "0987654321.";
        if (evt.getKeyChar() == ',') {
            evt.setKeyChar('.');
        } else if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_txt_rpKeyTyped

    private void txt_facaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_facaKeyTyped

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0987654321";
        char keyChar = evt.getKeyChar();

        if (Character.isLetter(keyChar)) {
            keyChar = Character.toUpperCase(keyChar);
            evt.setKeyChar(keyChar);
        } else if (!caracteres.contains(Character.toUpperCase(keyChar) + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_facaKeyTyped

    private void txt_ftKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ftKeyTyped

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0987654321.-";
        char keyChar = evt.getKeyChar();

        if (keyChar == ',') {
            evt.setKeyChar('.');
        } else if (Character.isLetter(keyChar)) {
            keyChar = Character.toUpperCase(keyChar);
            evt.setKeyChar(keyChar);
        } else if (!caracteres.contains(Character.toUpperCase(keyChar) + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ftKeyTyped

    private void jC_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_dataActionPerformed

        txt_data.setEnabled(jC_data.isSelected());
    }//GEN-LAST:event_jC_dataActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String rp = txt_rp.getText();
        int resposta = JOptionPane.showConfirmDialog(null, "Excluir RP " + rp + "?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {
            ProdutoCliche obj = new ProdutoCliche();

            obj.setId(Integer.parseInt(txt_idCliche.getText()));

            ProdutoClicheDAO dao = new ProdutoClicheDAO();

            dao.excluirProdutoCliche(obj);

            LimparCampos();
            this.dispose();

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if ("".equals(txt_rp.getText())) {
            JOptionPane.showMessageDialog(null, "RP Inválido!", "", 2);
        } else {
            if (!txt_rp.getText().contains(".")) {
                JOptionPane.showMessageDialog(null, "RP Inválido!", "", 2);
            } else {
                if ("".equals(txt_faca.getText())) {
                    JOptionPane.showMessageDialog(null, "Faca Iválido!", "", 2);
                } else {
                    if ("".equals(txt_ft.getText())) {
                        JOptionPane.showMessageDialog(null, "FT Iválido!", "", 2);
                    } else {
                        if ("".equals(cb_cliente.getSelectedItem().toString())) {
                            JOptionPane.showMessageDialog(null, "Cliente Iválido!", "", 2);
                        } else {
                            if ("".equals(cb_tipocliche.getSelectedItem().toString())) {
                                JOptionPane.showMessageDialog(null, "Tipo Clichê Iválido!", "", 2);
                            } else {
                                if ("".equals(cb_destino.getSelectedItem().toString())) {
                                    JOptionPane.showMessageDialog(null, "Destino Iválido!", "", 2);
                                } else {
                                    if ("".equals(cb_status.getSelectedItem().toString())) {
                                        JOptionPane.showMessageDialog(null, "Status Iválido!", "", 2);
                                    } else {
                                        if ("".equals(txt_data.getText())) {
                                            JOptionPane.showMessageDialog(null, "Data Inválido!", "", 2);
                                        } else {

                                            Utilitarios dh = new Utilitarios();
                                            String dataHora = dh.DH();

                                            int idcliente = ApontaIdCliente();
                                            int idtipocliche = ApontaIdTipoCliche();
                                            int iddestinocliche = ApontaIdDestinoCliente();

                                            ProdutoCliche obj = new ProdutoCliche();

                                            obj.setRp_cliche(txt_rp.getText());
                                            obj.setFaca(txt_faca.getText());
                                            obj.setFt(txt_ft.getText());
                                            obj.setCliente_id(idcliente);
                                            obj.setTipoCliche_id(idtipocliche);
                                            obj.setDestinoCliche_id(iddestinocliche);
                                            obj.setStatus(cb_status.getSelectedItem().toString());
                                            obj.setCliche_criado(txt_data.getText());
                                            obj.setCliche_modificado(dataHora);
                                            obj.setId(Integer.parseInt(txt_idCliche.getText()));

                                            ProdutoClicheDAO dao = new ProdutoClicheDAO();
                                            dao.alterarProdutoCliche(obj);

                                            LimparCampos();
                                            jC_data.setSelected(false);
                                            this.dispose();

                                            //Executa GerarXML
                                            if (gx == null) {
                                                gx = new GerarXML();
                                                gx.setLocationRelativeTo(this);
                                                gx.InfoPadrao();
                                                gx.setVisible(true);
                                            }
                                            gx.InfoPadrao();
                                            gx.setVisible(true);

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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
            java.util.logging.Logger.getLogger(AlterarCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCliche().setVisible(true);
            }
        });
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Alterar_32px.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_cliente;
    private javax.swing.JComboBox<String> cb_destino;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JComboBox<String> cb_tipocliche;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jC_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_faca;
    private javax.swing.JTextField txt_ft;
    private javax.swing.JTextField txt_idCliche;
    private javax.swing.JTextField txt_rp;
    // End of variables declaration//GEN-END:variables
}
