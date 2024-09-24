/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import dao.ClienteDAO;
import java.awt.Toolkit;
import model.Cliente;
import model.Utilitarios;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gmg
 */
public class GerenciarClientes extends javax.swing.JFrame {

    //Metodo listar Clientes
    public void listarClientes() {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> lista = dao.listarCliente();
        DefaultTableModel dados = (DefaultTableModel) jT_cliente.getModel();
        dados.setNumRows(0);
        for (Cliente c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCriado(),
                c.getModificado()});
        }
    }

    public GerenciarClientes() {
        initComponents();
        setIconImage();
        this.setResizable(false);
        listarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jT_cliente = new javax.swing.JTable();
        btn_novoCliente = new javax.swing.JButton();
        btn_alterarCliente = new javax.swing.JButton();
        btn_excluirCliente = new javax.swing.JButton();
        btn_limparCliente = new javax.swing.JButton();
        txt_nomeCliente = new javax.swing.JTextField();
        txt_idCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jT_cliente.setAutoCreateRowSorter(true);
        jT_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jT_cliente.setToolTipText("Duplo clicke no registro para alterá-lo!");
        jT_cliente.setFocusable(false);
        jT_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_cliente);
        if (jT_cliente.getColumnModel().getColumnCount() > 0) {
            jT_cliente.getColumnModel().getColumn(0).setMinWidth(0);
            jT_cliente.getColumnModel().getColumn(0).setPreferredWidth(0);
            jT_cliente.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btn_novoCliente.setBackground(new java.awt.Color(22, 22, 22));
        btn_novoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_novoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adicionar_32px.png"))); // NOI18N
        btn_novoCliente.setToolTipText("Adicionar novo!");
        btn_novoCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_novoCliente.setBorderPainted(false);
        btn_novoCliente.setEnabled(false);
        btn_novoCliente.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_novoCliente.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_novoCliente.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_novoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoClienteActionPerformed(evt);
            }
        });

        btn_alterarCliente.setBackground(new java.awt.Color(22, 22, 22));
        btn_alterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Alterar_32px.png"))); // NOI18N
        btn_alterarCliente.setToolTipText("Alterar!");
        btn_alterarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_alterarCliente.setBorderPainted(false);
        btn_alterarCliente.setEnabled(false);
        btn_alterarCliente.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_alterarCliente.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_alterarCliente.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_alterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarClienteActionPerformed(evt);
            }
        });

        btn_excluirCliente.setBackground(new java.awt.Color(22, 22, 22));
        btn_excluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Remover_32px.png"))); // NOI18N
        btn_excluirCliente.setToolTipText("Excluir!");
        btn_excluirCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_excluirCliente.setBorderPainted(false);
        btn_excluirCliente.setEnabled(false);
        btn_excluirCliente.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_excluirCliente.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_excluirCliente.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_excluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirClienteActionPerformed(evt);
            }
        });

        btn_limparCliente.setBackground(new java.awt.Color(22, 22, 22));
        btn_limparCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpar_32px.png"))); // NOI18N
        btn_limparCliente.setToolTipText("Limpar!");
        btn_limparCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limparCliente.setBorderPainted(false);
        btn_limparCliente.setEnabled(false);
        btn_limparCliente.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_limparCliente.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_limparCliente.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_limparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparClienteActionPerformed(evt);
            }
        });

        txt_nomeCliente.setBackground(new java.awt.Color(63, 63, 63));
        txt_nomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        txt_nomeCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nomeClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nomeClienteKeyTyped(evt);
            }
        });

        txt_idCliente.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_idCliente.setForeground(new java.awt.Color(63, 63, 63));
        txt_idCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_idCliente.setBorder(null);
        txt_idCliente.setEnabled(false);
        txt_idCliente.setFocusable(false);
        txt_idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nomeCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btn_novoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_alterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_alterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoClienteActionPerformed
        // Criar novo registro Cliente
        Utilitarios dh = new Utilitarios();
        String dataHora = dh.DH();

        Cliente obj = new Cliente();

        obj.setNome(txt_nomeCliente.getText());
        obj.setCriado(dataHora);
        obj.setModificado(dataHora);

        ClienteDAO dao = new ClienteDAO();
        dao.CadastrarCliente(obj);

        txt_idCliente.setText("");
        txt_nomeCliente.setText("");

        btn_novoCliente.setEnabled(false);
        btn_alterarCliente.setEnabled(false);
        btn_excluirCliente.setEnabled(false);
        btn_limparCliente.setEnabled(false);

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_novoClienteActionPerformed

    private void btn_alterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarClienteActionPerformed
        // Alterar novo registro Cliente
        Utilitarios dh = new Utilitarios();
        String dataHora = dh.DH();

        Cliente obj = new Cliente();

        obj.setNome(txt_nomeCliente.getText());
        obj.setCriado(jT_cliente.getValueAt(jT_cliente.getSelectedRow(), 2).toString());
        obj.setModificado(dataHora);
        obj.setId(Integer.parseInt(txt_idCliente.getText()));

        ClienteDAO dao = new ClienteDAO();
        dao.alterarCliente(obj);

        txt_idCliente.setText("");
        txt_nomeCliente.setText("");

        btn_novoCliente.setEnabled(false);
        btn_alterarCliente.setEnabled(false);
        btn_excluirCliente.setEnabled(false);
        btn_limparCliente.setEnabled(false);

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_alterarClienteActionPerformed

    private void btn_excluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirClienteActionPerformed
        // botao Excluir Clientes
        Cliente obj = new Cliente();

        obj.setId(Integer.parseInt(txt_idCliente.getText()));

        ClienteDAO dao = new ClienteDAO();

        dao.excluirCliente(obj);

        //Limpa os paineis
        txt_idCliente.setText("");
        txt_nomeCliente.setText("");

        //desabilita botões
        btn_novoCliente.setEnabled(false);
        btn_alterarCliente.setEnabled(false);
        btn_excluirCliente.setEnabled(false);
        btn_limparCliente.setEnabled(false);

        //AtualizarcbClientes();
    }//GEN-LAST:event_btn_excluirClienteActionPerformed

    private void btn_limparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparClienteActionPerformed

        txt_idCliente.setText("");
        txt_nomeCliente.setText("");

        btn_novoCliente.setEnabled(false);
        btn_alterarCliente.setEnabled(false);
        btn_excluirCliente.setEnabled(false);
        btn_limparCliente.setEnabled(false);
    }//GEN-LAST:event_btn_limparClienteActionPerformed

    private void txt_nomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomeClienteKeyPressed
        if ("".equals(txt_idCliente.getText())) {
            btn_novoCliente.setEnabled(true);
            btn_alterarCliente.setEnabled(false);
            btn_excluirCliente.setEnabled(false);
            btn_limparCliente.setEnabled(true);
        }
    }//GEN-LAST:event_txt_nomeClienteKeyPressed

    private void txt_idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarClientes();
    }//GEN-LAST:event_formWindowActivated

    private void jT_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_clienteMouseClicked

        jT_cliente.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    txt_idCliente.setText(jT_cliente.getValueAt(jT_cliente.getSelectedRow(), 0).toString());
                    txt_nomeCliente.setText(jT_cliente.getValueAt(jT_cliente.getSelectedRow(), 1).toString());

                    //desabilita botões
                    btn_novoCliente.setEnabled(false);
                    btn_alterarCliente.setEnabled(true);
                    btn_excluirCliente.setEnabled(true);
                    btn_limparCliente.setEnabled(true);

                }
            }
        });

    }//GEN-LAST:event_jT_clienteMouseClicked

    private void txt_nomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomeClienteKeyTyped
      

String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0987654321-_";
        char keyChar = evt.getKeyChar();

         if (Character.isLetter(keyChar)) {
            keyChar = Character.toUpperCase(keyChar);
            evt.setKeyChar(keyChar);
        } else if (!caracteres.contains(Character.toUpperCase(keyChar) + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_txt_nomeClienteKeyTyped

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
            java.util.logging.Logger.getLogger(GerenciarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarClientes().setVisible(true);
            }
        });
    }
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/engrenagem_32px.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterarCliente;
    private javax.swing.JButton btn_excluirCliente;
    private javax.swing.JButton btn_limparCliente;
    private javax.swing.JButton btn_novoCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_cliente;
    private javax.swing.JTextField txt_idCliente;
    private javax.swing.JTextField txt_nomeCliente;
    // End of variables declaration//GEN-END:variables
}
