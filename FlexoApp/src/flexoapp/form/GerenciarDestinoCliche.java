/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flexoapp.form;

import flexoapp.dao.DestinoClicheDAO;
import flexoapp.model.DestinoCliche;
import flexoapp.model.Utilitarios;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gmg
 */
public class GerenciarDestinoCliche extends javax.swing.JFrame {

//Metodo listar DestinoCliche
    public void listarDestinoCliche() {
        DestinoClicheDAO dao = new DestinoClicheDAO();
        List<DestinoCliche> lista = dao.listarDestinoCliche();
        DefaultTableModel dados = (DefaultTableModel) jT_destinoCliche.getModel();
        dados.setNumRows(0);
        for (DestinoCliche c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCriado(),
                c.getModificado()});
        }
    }

    public GerenciarDestinoCliche() {
        initComponents();
        this.setResizable(false);
        listarDestinoCliche();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_idDestinoCliche = new javax.swing.JTextField();
        txt_nomeDestinoCliche = new javax.swing.JTextField();
        btn_novoDestinoCliche = new javax.swing.JButton();
        btn_alterarDestinoCliche = new javax.swing.JButton();
        btn_excluirDestinoCliche = new javax.swing.JButton();
        btn_limparDestinoCliche = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_destinoCliche = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Destino Clichê");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txt_idDestinoCliche.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_idDestinoCliche.setForeground(new java.awt.Color(63, 63, 63));
        txt_idDestinoCliche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_idDestinoCliche.setBorder(null);
        txt_idDestinoCliche.setEnabled(false);
        txt_idDestinoCliche.setFocusable(false);
        txt_idDestinoCliche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idDestinoClicheActionPerformed(evt);
            }
        });

        txt_nomeDestinoCliche.setBackground(new java.awt.Color(63, 63, 63));
        txt_nomeDestinoCliche.setForeground(new java.awt.Color(255, 255, 255));
        txt_nomeDestinoCliche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nomeDestinoCliche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nomeDestinoClicheKeyPressed(evt);
            }
        });

        btn_novoDestinoCliche.setBackground(new java.awt.Color(22, 22, 22));
        btn_novoDestinoCliche.setForeground(new java.awt.Color(255, 255, 255));
        btn_novoDestinoCliche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flexoapp/img/Adicionar_32px.png"))); // NOI18N
        btn_novoDestinoCliche.setToolTipText("Adicionar novo!");
        btn_novoDestinoCliche.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_novoDestinoCliche.setBorderPainted(false);
        btn_novoDestinoCliche.setEnabled(false);
        btn_novoDestinoCliche.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_novoDestinoCliche.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_novoDestinoCliche.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_novoDestinoCliche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoDestinoClicheActionPerformed(evt);
            }
        });

        btn_alterarDestinoCliche.setBackground(new java.awt.Color(22, 22, 22));
        btn_alterarDestinoCliche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flexoapp/img/Alterar_32px.png"))); // NOI18N
        btn_alterarDestinoCliche.setToolTipText("Alterar!");
        btn_alterarDestinoCliche.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_alterarDestinoCliche.setBorderPainted(false);
        btn_alterarDestinoCliche.setEnabled(false);
        btn_alterarDestinoCliche.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_alterarDestinoCliche.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_alterarDestinoCliche.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_alterarDestinoCliche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarDestinoClicheActionPerformed(evt);
            }
        });

        btn_excluirDestinoCliche.setBackground(new java.awt.Color(22, 22, 22));
        btn_excluirDestinoCliche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flexoapp/img/Remover_32px.png"))); // NOI18N
        btn_excluirDestinoCliche.setToolTipText("Excluir!");
        btn_excluirDestinoCliche.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_excluirDestinoCliche.setBorderPainted(false);
        btn_excluirDestinoCliche.setEnabled(false);
        btn_excluirDestinoCliche.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_excluirDestinoCliche.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_excluirDestinoCliche.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_excluirDestinoCliche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirDestinoClicheActionPerformed(evt);
            }
        });

        btn_limparDestinoCliche.setBackground(new java.awt.Color(22, 22, 22));
        btn_limparDestinoCliche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flexoapp/img/Limpar_32px.png"))); // NOI18N
        btn_limparDestinoCliche.setToolTipText("Limpar!");
        btn_limparDestinoCliche.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparDestinoCliche.setBorderPainted(false);
        btn_limparDestinoCliche.setEnabled(false);
        btn_limparDestinoCliche.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limparDestinoCliche.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limparDestinoCliche.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limparDestinoCliche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparDestinoClicheActionPerformed(evt);
            }
        });

        jT_destinoCliche.setAutoCreateRowSorter(true);
        jT_destinoCliche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Criado", "Modificado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_destinoCliche.setToolTipText("Duplo clicke no registro para alterá-lo!");
        jT_destinoCliche.setFocusable(false);
        jT_destinoCliche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_destinoClicheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_destinoCliche);
        if (jT_destinoCliche.getColumnModel().getColumnCount() > 0) {
            jT_destinoCliche.getColumnModel().getColumn(0).setMinWidth(0);
            jT_destinoCliche.getColumnModel().getColumn(0).setPreferredWidth(0);
            jT_destinoCliche.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_idDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nomeDestinoCliche)
                        .addGap(18, 18, 18)
                        .addComponent(btn_novoDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_alterarDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluirDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limparDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_alterarDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluirDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limparDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novoDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nomeDestinoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idDestinoClicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idDestinoClicheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idDestinoClicheActionPerformed

    private void txt_nomeDestinoClicheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomeDestinoClicheKeyPressed
        if ("".equals(txt_idDestinoCliche.getText())) {
            btn_novoDestinoCliche.setEnabled(true);
            btn_alterarDestinoCliche.setEnabled(false);
            btn_excluirDestinoCliche.setEnabled(false);
            btn_limparDestinoCliche.setEnabled(true);
        }
    }//GEN-LAST:event_txt_nomeDestinoClicheKeyPressed

    private void btn_novoDestinoClicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoDestinoClicheActionPerformed
        // Criar novo registro
        Utilitarios dh = new Utilitarios();
        String dataHora = dh.DH();

        DestinoCliche obj = new DestinoCliche();

        obj.setNome(txt_nomeDestinoCliche.getText());
        obj.setCriado(dataHora);
        obj.setModificado(dataHora);

        DestinoClicheDAO dao = new DestinoClicheDAO();
        dao.CadastrarDestinoCliche(obj);

        txt_idDestinoCliche.setText("");
        txt_nomeDestinoCliche.setText("");

        btn_novoDestinoCliche.setEnabled(false);
        btn_alterarDestinoCliche.setEnabled(false);
        btn_excluirDestinoCliche.setEnabled(false);
        btn_limparDestinoCliche.setEnabled(false);

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_novoDestinoClicheActionPerformed

    private void btn_alterarDestinoClicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarDestinoClicheActionPerformed
        // Alterar novo registro Cliente
        Utilitarios dh = new Utilitarios();
        String dataHora = dh.DH();

        DestinoCliche obj = new DestinoCliche();

        obj.setNome(txt_nomeDestinoCliche.getText());
        obj.setCriado(jT_destinoCliche.getValueAt(jT_destinoCliche.getSelectedRow(), 2).toString());
        obj.setModificado(dataHora);
        obj.setId(Integer.parseInt(txt_idDestinoCliche.getText()));

        DestinoClicheDAO dao = new DestinoClicheDAO();
        dao.alterarDestinoCliche(obj);

        txt_idDestinoCliche.setText("");
        txt_nomeDestinoCliche.setText("");

        btn_novoDestinoCliche.setEnabled(false);
        btn_alterarDestinoCliche.setEnabled(false);
        btn_excluirDestinoCliche.setEnabled(false);
        btn_limparDestinoCliche.setEnabled(false);

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_alterarDestinoClicheActionPerformed

    private void btn_excluirDestinoClicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirDestinoClicheActionPerformed
        // botao Excluir Clientes
        DestinoCliche obj = new DestinoCliche();

        obj.setId(Integer.parseInt(txt_idDestinoCliche.getText()));

        DestinoClicheDAO dao = new DestinoClicheDAO();

        dao.excluirDestinoCliche(obj);

        //Limpa os paineis
        txt_idDestinoCliche.setText("");
        txt_nomeDestinoCliche.setText("");

        //desabilita botões
        btn_novoDestinoCliche.setEnabled(false);
        btn_alterarDestinoCliche.setEnabled(false);
        btn_excluirDestinoCliche.setEnabled(false);
        btn_limparDestinoCliche.setEnabled(false);

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_excluirDestinoClicheActionPerformed

    private void btn_limparDestinoClicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparDestinoClicheActionPerformed

        txt_idDestinoCliche.setText("");
        txt_nomeDestinoCliche.setText("");

        btn_novoDestinoCliche.setEnabled(false);
        btn_alterarDestinoCliche.setEnabled(false);
        btn_excluirDestinoCliche.setEnabled(false);
        btn_limparDestinoCliche.setEnabled(false);
    }//GEN-LAST:event_btn_limparDestinoClicheActionPerformed

    private void jT_destinoClicheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_destinoClicheMouseClicked

        jT_destinoCliche.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    txt_idDestinoCliche.setText(jT_destinoCliche.getValueAt(jT_destinoCliche.getSelectedRow(), 0).toString());
                    txt_nomeDestinoCliche.setText(jT_destinoCliche.getValueAt(jT_destinoCliche.getSelectedRow(), 1).toString());

                    //desabilita botões
                    btn_novoDestinoCliche.setEnabled(false);
                    btn_alterarDestinoCliche.setEnabled(true);
                    btn_excluirDestinoCliche.setEnabled(true);
                    btn_limparDestinoCliche.setEnabled(true);

                }
            }
        });
    }//GEN-LAST:event_jT_destinoClicheMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        listarDestinoCliche();

    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(GerenciarDestinoCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarDestinoCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarDestinoCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarDestinoCliche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarDestinoCliche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterarDestinoCliche;
    private javax.swing.JButton btn_excluirDestinoCliche;
    private javax.swing.JButton btn_limparDestinoCliche;
    private javax.swing.JButton btn_novoDestinoCliche;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_destinoCliche;
    private javax.swing.JTextField txt_idDestinoCliche;
    private javax.swing.JTextField txt_nomeDestinoCliche;
    // End of variables declaration//GEN-END:variables
}
