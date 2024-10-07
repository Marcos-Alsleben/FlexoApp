/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import dao.ClienteDAO;
import dao.ProdutoClicheDAO;
import dao.TrabalhoProdutoClicheDAO;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.ProdutoCliche;
import model.TrabalhoProdutoCliche;
import model.Utilitarios;

/**
 *
 * @author gmg
 */
public class NovoTrabalho extends javax.swing.JFrame {

//Metodo Atualiza campos de textos
    public void setTextField() {

        Utilitarios dh = new Utilitarios();
        String dataHora = dh.DH();

        txt_data.setText(dataHora);
        txt_data.setEnabled(false);
        txt_rp.setText("");
        txt_idcliche.setText("");
        txt_pesquisa.setText("");
        cb_condicaouso.setSelectedItem("");
    }

//Metodo Pesquisar Trabalhos
    public void PesquisarProdutoCliche() {

        String pesquisa = "%" + txt_pesquisa.getText() + "%";

        ProdutoClicheDAO dao = new ProdutoClicheDAO();
        List<ProdutoCliche> lista = dao.pesquisarProdutoCliche(pesquisa);
        DefaultTableModel dados = (DefaultTableModel) jT_produtocliche.getModel();
        dados.setNumRows(0);
        for (ProdutoCliche c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getRp_cliche(),
                c.getFaca(),
                c.getTipocliche(),
                c.getDestinocliche()
            });

        }

    }

    public NovoTrabalho() {
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

        jLabel1 = new javax.swing.JLabel();
        txt_rp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_condicaouso = new javax.swing.JComboBox<>();
        txt_data = new javax.swing.JTextField();
        jC_data = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_produtocliche = new javax.swing.JTable();
        txt_pesquisa = new javax.swing.JTextField();
        txt_idcliche = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Trabalho");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText(" RP do Trabalho");

        txt_rp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rpKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setText(" Condição de Uso");

        cb_condicaouso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "REUTILIZADO", "NOVO" }));

        txt_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jC_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_dataActionPerformed(evt);
            }
        });

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jT_produtocliche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "RP Cliche", "Faca", "Tipo Cliche", "Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_produtocliche.setToolTipText("Duplo clicke para adicionar id clichê!");
        jT_produtocliche.setFocusable(false);
        jT_produtocliche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_produtoclicheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_produtocliche);

        txt_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pesquisaKeyReleased(evt);
            }
        });

        txt_idcliche.setEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pesquisar_16px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText(" RP do Clichê");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setText(" id do Clichê");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_idcliche, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_idcliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_rp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_condicaouso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jC_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(cb_condicaouso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(txt_rp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jC_data)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rpKeyTyped

        String caracteres = "0987654321.";
        if (evt.getKeyChar() == ',') {
            evt.setKeyChar('.');
        } else if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_txt_rpKeyTyped

    private void jC_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_dataActionPerformed

        txt_data.setEnabled(jC_data.isSelected());
    }//GEN-LAST:event_jC_dataActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if ("".equals(txt_rp.getText())) {
            JOptionPane.showMessageDialog(null, "RP do Trabalho Inválido!", "", 2);
        } else {
            if (!txt_rp.getText().contains(".")) {
                JOptionPane.showMessageDialog(null, "RP do Trabalho Inválido!", "", 2);
            } else {
                if ("".equals(cb_condicaouso.getSelectedItem().toString())) {
                    JOptionPane.showMessageDialog(null, "Condição de Uso Inválido!", "", 2);
                } else {
                    if ("".equals(txt_idcliche.getText())) {
                        JOptionPane.showMessageDialog(null, "Id do Clichê Inválido!", "", 2);
                    } else {

                        Utilitarios dh = new Utilitarios();
                        String dataHora = dh.DH();

                        //int idcliente = ApontaIdCliente();
                        //int idtipocliche = ApontaIdTipoCliche();
                        //int iddestinocliche = ApontaIdDestinoCliente();
                        TrabalhoProdutoCliche obj = new TrabalhoProdutoCliche();

                        obj.setRp_trabalho(txt_rp.getText());
                        obj.setCondicao_uso(cb_condicaouso.getSelectedItem().toString());
                        obj.setProdutoCliche_id(Integer.parseInt(txt_idcliche.getText()));
                        obj.setTrabalho_criado(txt_data.getText());
                        obj.setTrabalho_modificado(dataHora);

                        TrabalhoProdutoClicheDAO dao = new TrabalhoProdutoClicheDAO();
                        dao.cadastrarTrabalhoProdutoCliche(obj);

                        setTextField();
                        this.dispose();
                    }
                }
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jT_produtoclicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_produtoclicheMouseClicked

        jT_produtocliche.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    txt_idcliche.setText(jT_produtocliche.getValueAt(jT_produtocliche.getSelectedRow(), 0).toString());

                }
            }
        });


    }//GEN-LAST:event_jT_produtoclicheMouseClicked

    private void txt_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisaKeyReleased

        PesquisarProdutoCliche();

    }//GEN-LAST:event_txt_pesquisaKeyReleased

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
            java.util.logging.Logger.getLogger(NovoTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoTrabalho().setVisible(true);
            }
        });
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Adicionar_32px.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_condicaouso;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jC_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_produtocliche;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_idcliche;
    private javax.swing.JTextField txt_pesquisa;
    private javax.swing.JTextField txt_rp;
    // End of variables declaration//GEN-END:variables
}
