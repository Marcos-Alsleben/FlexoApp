
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mrs_a
 */
public class ConnectionFactory {

    public Connection getConnection() {

        try {

            //return DriverManager.getConnection("jdbc:mysql://10.0.72.61:3306/flexo?useSSL=false", "carton", "2574");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/flexo?useSSL=false", "carton", "2574");
            //return DriverManager.getConnection("jdbc:mysql://localhost:3306/flexo", "carton", "2574");

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }

    }

    
     

  
}