
package flexoapp.jdbc;
import javax.swing.JOptionPane;

/**
 *
 * @author mrs_a
 */
public class TestaConexao {
    
     public static void main(String[] args) {
        
         try {
             
             new ConnectionFactory().getConnection();
             JOptionPane.showMessageDialog(null, "Conectado com sucesso ao Banco de Dados flexo!");             
         } catch (Exception erro) {
              JOptionPane.showMessageDialog(null, "Não foi possível se conectar ao Banco de Dados flexo: "  + erro);    
         }
         
         
     }
    
}