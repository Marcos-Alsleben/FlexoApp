/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import com.lowagie.text.DocumentException;
import dao.ProdutoClicheDAO;
import model.ProdutoCliche;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Utilitarios;

/**
 *
 * @author gmg
 */
public class ListarCliches extends javax.swing.JPanel {

    private NovoCliche nc;
    private AlterarCliche ac;

//Metodo listar ProdutoCliche
    public void listarCliche() {
        ProdutoClicheDAO dao = new ProdutoClicheDAO();
        List<ProdutoCliche> lista = dao.ListarProdutoCliche();
        DefaultTableModel dados = (DefaultTableModel) jT_cliches.getModel();
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
                c.getCliche_criado(),
                c.getCliche_modificado()
            });
        }
    }

    public ListarCliches() {
        initComponents();

    }

//Metodo Pesquisar FilmeFaca
    public void PesquisarCliche() {

        String pesquisa = "%" + txt_pesquisa.getText() + "%";

        ProdutoClicheDAO dao = new ProdutoClicheDAO();
        List<ProdutoCliche> lista = dao.pesquisarProdutoCliche(pesquisa);
        DefaultTableModel dados = (DefaultTableModel) jT_cliches.getModel();
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
                c.getCliche_criado(),
                c.getCliche_modificado()
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jT_cliches = new javax.swing.JTable();
        btn_novoCliche = new javax.swing.JButton();
        txt_pesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 577));

        jT_cliches.setAutoCreateRowSorter(true);
        jT_cliches.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "RP Clichê", "Faca", "FT", "Cliente_id", "Cliente", "TipoCliche_id", "Tipo Clichê", "Destino_id", "Destino", "Status", "Criado", "Modificado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_cliches.setToolTipText("Duplo clicke no registro para alterá-lo!");
        jT_cliches.setFocusable(false);
        jT_cliches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_clichesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_cliches);
        if (jT_cliches.getColumnModel().getColumnCount() > 0) {
            jT_cliches.getColumnModel().getColumn(0).setMinWidth(0);
            jT_cliches.getColumnModel().getColumn(0).setPreferredWidth(0);
            jT_cliches.getColumnModel().getColumn(0).setMaxWidth(0);
            jT_cliches.getColumnModel().getColumn(4).setMinWidth(0);
            jT_cliches.getColumnModel().getColumn(4).setPreferredWidth(0);
            jT_cliches.getColumnModel().getColumn(4).setMaxWidth(0);
            jT_cliches.getColumnModel().getColumn(6).setMinWidth(0);
            jT_cliches.getColumnModel().getColumn(6).setPreferredWidth(0);
            jT_cliches.getColumnModel().getColumn(6).setMaxWidth(0);
            jT_cliches.getColumnModel().getColumn(8).setMinWidth(0);
            jT_cliches.getColumnModel().getColumn(8).setPreferredWidth(0);
            jT_cliches.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        btn_novoCliche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adicionar_32px.png"))); // NOI18N
        btn_novoCliche.setToolTipText("Cadastrar Novo");
        btn_novoCliche.setFocusable(false);
        btn_novoCliche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoClicheActionPerformed(evt);
            }
        });

        txt_pesquisa.setToolTipText("Pesquisar");
        txt_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pesquisaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLICHÊS");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf_32px.png"))); // NOI18N
        jButton1.setToolTipText("Gerar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pesquisar_16px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_novoCliche)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(btn_novoCliche)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoClicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoClicheActionPerformed

        if (nc == null) {
            nc = new NovoCliche();
            nc.setLocationRelativeTo(this);
            nc.setVisible(true);
            nc.setTextField();
            nc.AtualizarcbClientes();
            nc.AtualizarcbTipoCliche();
            nc.AtualizarcbDestino();

        }
        nc.setVisible(true);
        nc.setTextField();
        nc.AtualizarcbClientes();
        nc.AtualizarcbTipoCliche();
        nc.AtualizarcbDestino();
    }//GEN-LAST:event_btn_novoClicheActionPerformed

    private void jT_clichesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_clichesMouseClicked

        jT_cliches.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {

                    if (ac == null) {
                        ac = new AlterarCliche();

                        int x = jT_cliches.getLocationOnScreen().x + (jT_cliches.getWidth() - ac.getWidth()) / 2;
                        int y = jT_cliches.getLocation().y + (ac.getHeight() / 2);

                        ac.setLocation(x, y);

                        ac.AtualizarcbClientes();
                        ac.AtualizarcbDestino();
                        ac.AtualizarcbTipoCliche();
                        ac.AtualizarId(jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 0).toString());
                        ac.AtualizarRp(jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 1).toString());
                        ac.AtualizarFaca((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 2).toString()));
                        ac.AtualizarFt((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 3).toString()));
                        ac.AtualizarCliente((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 5).toString()));
                        ac.AtualizarTipoCliche((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 7).toString()));
                        ac.AtualizarDestino((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 9).toString()));
                        ac.AtualizarStatus((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 10).toString()));
                        ac.AtualizarData((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 11).toString()));
                        ac.setVisible(true);

                    }

                    //ac.AtualizarcbClientes();
                    ac.AtualizarcbDestino();
                    ac.AtualizarcbTipoCliche();
                    ac.AtualizarId(jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 0).toString());
                    ac.AtualizarRp(jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 1).toString());
                    ac.AtualizarFaca((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 2).toString()));
                    ac.AtualizarFt((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 3).toString()));
                    ac.AtualizarCliente((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 5).toString()));
                    ac.AtualizarTipoCliche((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 7).toString()));
                    ac.AtualizarDestino((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 9).toString()));
                    ac.AtualizarStatus((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 10).toString()));
                    ac.AtualizarData((jT_cliches.getValueAt(jT_cliches.getSelectedRow(), 11).toString()));
                    ac.setVisible(true);

                }
            }

        });

    }//GEN-LAST:event_jT_clichesMouseClicked

    private void txt_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisaKeyReleased

        PesquisarCliche();

    }//GEN-LAST:event_txt_pesquisaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Utilitarios utl = new Utilitarios();
        try {
            utl.gerarPDF(jT_cliches, "TB_ListarCliches.pdf", Arrays.asList("RP Clichê", "Faca", "FT", "Cliente", "Tipo Clichê",
                    "Destino", "Status", "Criado", "Modificado"), "FlexoApp/Tabela Clichês");
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(ListarCliches.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_pesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisaKeyTyped

        char keyChar = evt.getKeyChar();

        if (Character.isLetter(keyChar)) {
            keyChar = Character.toUpperCase(keyChar);
            evt.setKeyChar(keyChar);
        } else if (evt.getKeyChar() == ',') {
            evt.setKeyChar('.');
        }

    }//GEN-LAST:event_txt_pesquisaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_novoCliche;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_cliches;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}
