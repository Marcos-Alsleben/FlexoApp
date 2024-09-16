/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flexoapp.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gmg
 */
public class Utilitarios {

// Metodo Pegar Data e Hora (dd/mm/yyyy hh:mm)
    public String DH() {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat();
        String dataFormatada = formatar.format(data);
        
        //JOptionPane.showMessageDialog(null, dataFormatada);
        
        return dataFormatada;
        
    }
    
}
