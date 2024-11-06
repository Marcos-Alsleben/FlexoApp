/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import com.lowagie.text.DocumentException;
import dao.ProdutoClicheDAO;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ProdutoCliche;
import model.Utilitarios;

/**
 *
 * @author gmg
 */
public class EliminarCliches extends javax.swing.JPanel {

    private GerarXML gx;

//Metodo Pesquisar FilmeFaca
    public void PesquisarEliminarCliche() {

        String pesquisa = txt_pesquisa.getText();

        ProdutoClicheDAO dao = new ProdutoClicheDAO();
        List<ProdutoCliche> lista = dao.pesquisarEliminarCliche(pesquisa);
        DefaultTableModel dados = (DefaultTableModel) jT_eliminarCliches.getModel();
        dados.setNumRows(0);
        for (ProdutoCliche c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getRp_cliche(),
                c.getFaca(),
                c.getFt(),
                c.getCliente_id(),
                c.getCliente(),
                c.getTipoCliche_id(),
                c.getTipocliche(),
                c.getDestinoCliche_id(),
                c.getDestinocliche(),
                c.getStatus(),
                c.getTrabalho_criado(),
                c.getCliche_criado(),
                c.getCliche_modificado()
            });

        }

    }

    public EliminarCliches() {
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

        txt_pesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_eliminarCliches = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        txt_pesquisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pesquisa.setText("24");
        txt_pesquisa.setToolTipText("Pesquisar");
        txt_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pesquisaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pesquisaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ELIMINAR CLICHÊS");

        jLabel3.setText(" Intervalo (meses):");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf_32px.png"))); // NOI18N
        jButton1.setToolTipText("Gerar PDF");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar_32px.png"))); // NOI18N
        jButton2.setToolTipText("Eliminar Clichê");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jT_eliminarCliches.setAutoCreateRowSorter(true);
        jT_eliminarCliches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "RP Clichê", "Faca", "FT", "Cliente_id", "Cliente", "TipoCliche_id", "Tipo Clichê", "Destino_id", "Destino", "Status", "Trabalho Criado", "Clichê Criado", "Clichê Modificado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_eliminarCliches.setToolTipText("");
        jT_eliminarCliches.setFocusable(false);
        jScrollPane1.setViewportView(jT_eliminarCliches);
        if (jT_eliminarCliches.getColumnModel().getColumnCount() > 0) {
            jT_eliminarCliches.getColumnModel().getColumn(0).setMinWidth(20);
            jT_eliminarCliches.getColumnModel().getColumn(0).setPreferredWidth(50);
            jT_eliminarCliches.getColumnModel().getColumn(0).setMaxWidth(150);
            jT_eliminarCliches.getColumnModel().getColumn(1).setMinWidth(100);
            jT_eliminarCliches.getColumnModel().getColumn(1).setPreferredWidth(50);
            jT_eliminarCliches.getColumnModel().getColumn(2).setMinWidth(100);
            jT_eliminarCliches.getColumnModel().getColumn(2).setPreferredWidth(50);
            jT_eliminarCliches.getColumnModel().getColumn(3).setMinWidth(50);
            jT_eliminarCliches.getColumnModel().getColumn(3).setPreferredWidth(50);
            jT_eliminarCliches.getColumnModel().getColumn(4).setMinWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(4).setPreferredWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(4).setMaxWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(5).setMinWidth(150);
            jT_eliminarCliches.getColumnModel().getColumn(5).setPreferredWidth(100);
            jT_eliminarCliches.getColumnModel().getColumn(6).setMinWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(6).setPreferredWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(6).setMaxWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(7).setMinWidth(100);
            jT_eliminarCliches.getColumnModel().getColumn(7).setPreferredWidth(100);
            jT_eliminarCliches.getColumnModel().getColumn(8).setMinWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(8).setPreferredWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(8).setMaxWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(9).setMinWidth(50);
            jT_eliminarCliches.getColumnModel().getColumn(9).setPreferredWidth(30);
            jT_eliminarCliches.getColumnModel().getColumn(10).setMinWidth(100);
            jT_eliminarCliches.getColumnModel().getColumn(10).setPreferredWidth(100);
            jT_eliminarCliches.getColumnModel().getColumn(11).setMinWidth(150);
            jT_eliminarCliches.getColumnModel().getColumn(11).setPreferredWidth(150);
            jT_eliminarCliches.getColumnModel().getColumn(12).setMinWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(12).setPreferredWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(12).setMaxWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(13).setMinWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(13).setPreferredWidth(0);
            jT_eliminarCliches.getColumnModel().getColumn(13).setMaxWidth(0);
        }

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AtualizarDados_32px.png"))); // NOI18N
        jButton3.setToolTipText("Carregar dados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xml_32px.png"))); // NOI18N
        jButton4.setToolTipText("Gerar XML");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jT_eliminarCliches.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "A tabela está vazia!", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Utilitarios utl = new Utilitarios();
        try {
            utl.gerarPDF(jT_eliminarCliches, "TB_EliminarCliche.pdf", Arrays.asList("RP Clichê", "Faca", "FT", "Cliente", "Tipo Clichê",
                    "Destino", "Status", "Trabalho Criado"), "FlexoApp/Tabela Eliminar Cliches");
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(EliminarCliches.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PesquisarEliminarCliche();
        jButton2.setEnabled(true);
        jButton1.setEnabled(true);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_pesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PesquisarEliminarCliche();
        }

    }//GEN-LAST:event_txt_pesquisaKeyPressed

    private void txt_pesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisaKeyTyped

        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_pesquisaKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (jT_eliminarCliches.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "A tabela está vazia!", "", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja alterar o status para 'ELIMINADO' de "
                + "todos os elementos da tabela 'Eliminar Clichê'?", "", JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {

            try {
                for (int row = 0; row < jT_eliminarCliches.getRowCount(); row++) {

                    ProdutoCliche obj = new ProdutoCliche();

                    obj.setRp_cliche(jT_eliminarCliches.getValueAt(row, 1).toString());
                    obj.setFaca(jT_eliminarCliches.getValueAt(row, 2).toString());
                    obj.setFt(jT_eliminarCliches.getValueAt(row, 3).toString());
                    obj.setCliente_id(Integer.parseInt(jT_eliminarCliches.getValueAt(row, 4).toString()));
                    obj.setTipoCliche_id(Integer.parseInt(jT_eliminarCliches.getValueAt(row, 6).toString()));
                    obj.setDestinoCliche_id(Integer.parseInt(jT_eliminarCliches.getValueAt(row, 8).toString()));
                    obj.setStatus("ELIMINADO");
                    obj.setCliche_criado(jT_eliminarCliches.getValueAt(row, 12).toString());
                    obj.setCliche_modificado(new Utilitarios().DH());
                    obj.setId(Integer.parseInt(jT_eliminarCliches.getValueAt(row, 0).toString()));

                    ProdutoClicheDAO dao = new ProdutoClicheDAO();
                    dao.alterarProdutoCliche(obj);

                }

//Executa GerarXML
                if (gx == null) {
                    gx = new GerarXML();
                    gx.setLocationRelativeTo(this);
                    gx.InfoPadrao();
                    gx.setVisible(true);
                }
                gx.InfoPadrao();
                gx.setVisible(true);

                // Limpa a tabela 
                DefaultTableModel model = (DefaultTableModel) jT_eliminarCliches.getModel();
                model.setRowCount(0);

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao atualizar banco de dados: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (gx == null) {
            gx = new GerarXML();
            gx.setLocationRelativeTo(this);
            gx.InfoPadrao();
            gx.setVisible(true);
        }
        gx.InfoPadrao();
        gx.setVisible(true);

//JOptionPane.showMessageDialog(null, "Este recurso está em desenvolvimento!", "", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_eliminarCliches;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}
