/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flexoapp.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gmg
 */
public class Utilitarios {

// Metodo Pegar Data e Hora
    public String DH() {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dataFormatada = formatar.format(data);
        
        //JOptionPane.showMessageDialog(null, dataFormatada);
        
        return dataFormatada;
        
    }
    
}
