/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import dao.ClienteDAO;
import dao.DestinoClicheDAO;
import dao.ProdutoClicheDAO;
import dao.TipoClicheDAO;
import model.Cliente;
import model.DestinoCliche;
import model.ProdutoCliche;
import model.TipoCliche;
import model.Utilitarios;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gmg
 */
public class NovoCliche extends javax.swing.JFrame {

//Metodo Atualiza campos de textos
    public void setTextField() {

        Utilitarios dh = new Utilitarios();
        String dataHora = dh.DH();

        txt_data.setText(dataHora);
        txt_data.setEnabled(false);
        txt_rp.setText("");
        txt_faca.setText("");
        txt_ft.setText("");

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

    public NovoCliche() {
        initComponents();
        setIconImage();
        this.setResizable(false);
        AtualizarcbClientes();
        AtualizarcbTipoCliche();
        AtualizarcbDestino();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_rp = new javax.swing.JTextField();
        txt_faca = new javax.swing.JTextField();
        txt_ft = new javax.swing.JTextField();
        cb_tipocliche = new javax.swing.JComboBox<>();
        cb_destino = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jC_data = new javax.swing.JCheckBox();
        txt_data = new javax.swing.JTextField();
        cb_cliente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Clichê");
        setMinimumSize(new java.awt.Dimension(250, 374));

        txt_rp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rpKeyTyped(evt);
            }
        });

        txt_faca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_facaFocusLost(evt);
            }
        });
        txt_faca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_facaKeyTyped(evt);
            }
        });

        txt_ft.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ftKeyTyped(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText(" RP");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText(" FACA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText(" FT");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setText(" CLIENTE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText(" TIPO CLICHÊ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setText(" DESTINO");

        jC_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_dataActionPerformed(evt);
            }
        });

        txt_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_rp, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(cb_destino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_tipocliche, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ft, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_faca)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jC_data))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cb_cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jC_data)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_facaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_facaFocusLost

    }//GEN-LAST:event_txt_facaFocusLost

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
                                    obj.setStatus("ATIVO");
                                    obj.setCliche_criado(txt_data.getText());
                                    obj.setCliche_modificado(dataHora);

                                    ProdutoClicheDAO dao = new ProdutoClicheDAO();
                                    dao.cadastrarProdutoCliche(obj);

                                    setTextField();
                                    jC_data.setSelected(false);
                                    this.dispose();

                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jC_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_dataActionPerformed

        txt_data.setEnabled(jC_data.isSelected());

    }//GEN-LAST:event_jC_dataActionPerformed

    private void txt_rpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rpKeyTyped

        String numeros = "0987654321."; // Aceita números
        char tecla = evt.getKeyChar();

        if (tecla == ',') {
            evt.setKeyChar('.'); // Substitui vírgula por ponto
        } else if (numeros.contains(tecla + "")) {
            // Permite números
        } else if (Character.toUpperCase(tecla) == 'P') {
            txt_rp.setText(txt_rp.getText() + "-P"); // Adiciona "-P"
            evt.consume(); // Impede que o caractere original seja inserido
        } else if (Character.toUpperCase(tecla) == 'S') {
            txt_rp.setText(txt_rp.getText() + "-S"); // Adiciona "-S"
            evt.consume(); // Impede que o caractere original seja inserido
        } else {
            evt.consume(); // Ignora caracteres inválidos
        }


    }//GEN-LAST:event_txt_rpKeyTyped

    private void txt_ftKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ftKeyTyped

        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_txt_ftKeyTyped

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
            java.util.logging.Logger.getLogger(NovoCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoCliche().setVisible(true);
            }
        });
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Adicionar_32px.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_cliente;
    private javax.swing.JComboBox<String> cb_destino;
    private javax.swing.JComboBox<String> cb_tipocliche;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jC_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_faca;
    private javax.swing.JTextField txt_ft;
    private javax.swing.JTextField txt_rp;
    // End of variables declaration//GEN-END:variables
}
