/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import dao.DestinoClicheDAO;
import dao.ProdutoClicheDAO;
import dao.TipoClicheDAO;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DestinoCliche;
import model.ProdutoCliche;
import model.TipoCliche;

/**
 *
 * @author gmg
 */
public class InfoGeral extends javax.swing.JPanel {

//Metodo ResetInfoEliminar
    public void ResetInfoEliminar() {

        txt_meses.setText("24");

        ContaClichesparaEliminar();
    }

    //Metodo listar CbDestinoCliche
    public void listarCbDestinoCliche() {
        DestinoClicheDAO dao = new DestinoClicheDAO();
        List<DestinoCliche> lista = dao.listarDestinoCliche();

        cb_destino1.removeAllItems();
        cb_destino2.removeAllItems();
        cb_destino3.removeAllItems();
        cb_destino4.removeAllItems();
        cb_destino1.addItem("TOTAL");
        cb_destino2.addItem("TOTAL");
        cb_destino3.addItem("TOTAL");
        cb_destino4.addItem("TOTAL");

        for (DestinoCliche c : lista) {
            cb_destino1.addItem(c.getNome());
            cb_destino2.addItem(c.getNome());
            cb_destino3.addItem(c.getNome());
            cb_destino4.addItem(c.getNome());

        }
    }

    //Metodo listar CbTipoCliche
    public void listarCbTipoCliche() {
        TipoClicheDAO dao = new TipoClicheDAO();
        List<TipoCliche> lista = dao.listarTipoCliche();

        cb_tipoCliche.removeAllItems();

        for (TipoCliche c : lista) {
            cb_tipoCliche.addItem(c.getNome());

        }
    }

    //Metodo ContaClichesparaEliminar
    public void ContaClichesparaEliminar() {
        ProdutoClicheDAO dao = new ProdutoClicheDAO();
        int quantidade = dao.ContarClichesParaEliminar(txt_meses.getText());
        txt_eliminar.setText(String.valueOf(quantidade));
    }

    //Metodo AtualizarAnosCliches
    public void AtualizarAnosCliches() {
        ProdutoClicheDAO dao = new ProdutoClicheDAO();
        List<ProdutoCliche> lista = dao.ListarAnosCliche();

        cb_ano.removeAllItems();
        //cb_ano.addItem("*");

        for (ProdutoCliche c : lista) {
            cb_ano.addItem(c.getAno());

        }
    }

    // Metodo pesquisar Cliches Novos
    public void ContarClichesNovos() {
        String mes = cb_mes.getSelectedItem().toString();;
        String ano = cb_ano.getSelectedItem().toString();
        String destino;

        switch (cb_mes.getSelectedItem().toString()) {

            case "TOTAL":
                mes = "%";
                break;

            case "Janeiro":
                mes = "1";
                break;

            case "Fevereiro":
                mes = "2";
                break;

            case "Março":
                mes = "3";
                break;

            case "Abril":
                mes = "4";
                break;

            case "Maio":
                mes = "5";
                break;

            case "Junho":
                mes = "6";
                break;

            case "Julho":
                mes = "7";
                break;

            case "Agosto":
                mes = "8";
                break;

            case "Setembro":
                mes = "9";
                break;

            case "Outubro":
                mes = "10";
                break;

            case "Novembro":
                mes = "11";
                break;

            case "Dezembro":
                mes = "12";
                break;

            default:
                break;
        }

        destino = cb_destino3.getSelectedItem().toString();

        if (destino.equals("TOTAL")) {
            destino = "%";
        }

        ProdutoClicheDAO dao = new ProdutoClicheDAO();
        int quantidade = dao.ContarClichesNovos(ano, mes, destino);
        txt_novos.setText(String.valueOf(quantidade));

    }

//Metodo PesquisarVidaUtilCliche
    public void PesquisarVidaUtilCliche() {

        String destino = cb_destino4.getSelectedItem().toString();
        String tipoCliche = cb_tipoCliche.getSelectedItem().toString();

        if (destino.equals("TOTAL")) {
            destino = "";
        }

        ProdutoClicheDAO dao = new ProdutoClicheDAO();
        int quantidade = dao.ContarVidaUtilCliches(tipoCliche, destino);
        txt_vidaUtil.setText(String.valueOf(quantidade));

    }

    //Construtor
    public InfoGeral() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_ativos = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cb_destino1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_eliminados = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        cb_destino2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_eliminar = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txt_meses = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_novos = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        cb_destino3 = new javax.swing.JComboBox<>();
        cb_mes = new javax.swing.JComboBox<>();
        cb_ano = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_vidaUtil = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        cb_destino4 = new javax.swing.JComboBox<>();
        cb_tipoCliche = new javax.swing.JComboBox<>();

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(526, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ATIVOS");

        txt_ativos.setEditable(false);
        txt_ativos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_ativos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ativos.setText("####");

        cb_destino1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maquina" }));
        cb_destino1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_destino1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(cb_destino1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_destino1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ativos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txt_ativos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ELIMINADOS");

        txt_eliminados.setEditable(false);
        txt_eliminados.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_eliminados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_eliminados.setText("####");

        jPanel6.setPreferredSize(new java.awt.Dimension(389, 34));

        cb_destino2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maquina" }));
        cb_destino2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_destino2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(cb_destino2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_destino2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_eliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txt_eliminados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ELIMINAR");

        txt_eliminar.setEditable(false);
        txt_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_eliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_eliminar.setText("####");

        txt_meses.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_meses.setText("24");
        txt_meses.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Meses", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10))); // NOI18N
        txt_meses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_mesesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mesesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(txt_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("NOVOS");

        txt_novos.setEditable(false);
        txt_novos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_novos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_novos.setText("####");

        jPanel9.setPreferredSize(new java.awt.Dimension(389, 34));

        cb_destino3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maquina" }));
        cb_destino3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_destino3ItemStateChanged(evt);
            }
        });

        cb_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TOTAL", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        cb_mes.setToolTipText("");
        cb_mes.setAutoscrolls(true);
        cb_mes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_mesItemStateChanged(evt);
            }
        });
        cb_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_mesActionPerformed(evt);
            }
        });

        cb_ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano" }));
        cb_ano.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_anoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cb_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cb_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cb_destino3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_destino3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_novos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txt_novos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("VIDA ÚTIL");

        txt_vidaUtil.setEditable(false);
        txt_vidaUtil.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_vidaUtil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_vidaUtil.setText("####");

        jPanel10.setPreferredSize(new java.awt.Dimension(389, 34));

        cb_destino4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maquina" }));
        cb_destino4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_destino4ItemStateChanged(evt);
            }
        });

        cb_tipoCliche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TipoCliche" }));
        cb_tipoCliche.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipoClicheItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(cb_destino4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(cb_tipoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_destino4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tipoCliche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_vidaUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(txt_vidaUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cb_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_mesActionPerformed

    private void cb_destino1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_destino1ItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String destino = cb_destino1.getSelectedItem().toString();

            if (destino.equals("TOTAL")) {
                destino = "";
            }

            ProdutoClicheDAO dao = new ProdutoClicheDAO();
            int quantidade = dao.ContarClichesAtivos("ATIVO", destino);
            txt_ativos.setText(String.valueOf(quantidade));
        }


    }//GEN-LAST:event_cb_destino1ItemStateChanged

    private void cb_destino2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_destino2ItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String destino = cb_destino2.getSelectedItem().toString();

            if (destino.equals("TOTAL")) {
                destino = "";
            }

            ProdutoClicheDAO dao = new ProdutoClicheDAO();
            int quantidade = dao.ContarClichesAtivos("ELIMINADO", destino);
            txt_eliminados.setText(String.valueOf(quantidade));
        }


    }//GEN-LAST:event_cb_destino2ItemStateChanged

    private void txt_mesesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mesesKeyReleased

        ContaClichesparaEliminar();

    }//GEN-LAST:event_txt_mesesKeyReleased

    private void txt_mesesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mesesKeyTyped

        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_txt_mesesKeyTyped

    private void cb_anoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_anoItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {

            ContarClichesNovos();
        }

    }//GEN-LAST:event_cb_anoItemStateChanged

    private void cb_mesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_mesItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {

            ContarClichesNovos();
        }

    }//GEN-LAST:event_cb_mesItemStateChanged

    private void cb_destino3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_destino3ItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {

            ContarClichesNovos();
        }

    }//GEN-LAST:event_cb_destino3ItemStateChanged

    private void cb_tipoClicheItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipoClicheItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {

            PesquisarVidaUtilCliche();

        }


    }//GEN-LAST:event_cb_tipoClicheItemStateChanged

    private void cb_destino4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_destino4ItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {

            PesquisarVidaUtilCliche();
        }


    }//GEN-LAST:event_cb_destino4ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_ano;
    private javax.swing.JComboBox<String> cb_destino1;
    private javax.swing.JComboBox<String> cb_destino2;
    private javax.swing.JComboBox<String> cb_destino3;
    private javax.swing.JComboBox<String> cb_destino4;
    private javax.swing.JComboBox<String> cb_mes;
    private javax.swing.JComboBox<String> cb_tipoCliche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txt_ativos;
    private javax.swing.JTextField txt_eliminados;
    private javax.swing.JTextField txt_eliminar;
    private javax.swing.JTextField txt_meses;
    private javax.swing.JTextField txt_novos;
    private javax.swing.JTextField txt_vidaUtil;
    // End of variables declaration//GEN-END:variables
}
