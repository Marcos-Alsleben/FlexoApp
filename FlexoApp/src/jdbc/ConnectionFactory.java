package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mrs_a
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://10.0.72.61:3306/flexo?useSSL=false", "carton", "2574");
            //return DriverManager.getConnection("jdbc:mysql://localhost:3306/flexo?useSSL=false", "carton", "2574");
            //return DriverManager.getConnection("jdbc:mysql://localhost:3306/flexo", "carton", "2574");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + erro.getMessage());
            System.exit(1); // Encerra o programa
            return null; // Este retorno nunca será alcançado, mas é necessário para compilar sem erros.
        }
    }
}
