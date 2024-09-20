
package dao;

import jdbc.ConnectionFactory;
import model.Status;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gmg
 */
public class StatusDAO {

private Connection con;

    public StatusDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    // Metodo Cadastrar Status
    public void CadastrarStatus(Status obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "insert into status (nome, criado, modificado) "
                    + " values (?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCriado());
            stmt.setString(3, obj.getModificado());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }
    }

//Metodo AlterarStatus
    public void alterarStatus(Status obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "update status set nome=?, criado=?, modificado=? where id=?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCriado());
            stmt.setString(3, obj.getModificado());
            stmt.setInt(4, obj.getId());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

//Metodo ExcluirStatus
    public void excluirStatus(Status obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "delete from status where id=?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

//Metodo ListarStatus
    public List<Status> listarStatus() {

        try {

            // Passo 1 criar a lista
            List<Status> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "select * from status";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Status obj = new Status();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setCriado(rs.getString("criado"));
                obj.setModificado(rs.getString("modificado"));

                lista.add(obj);

            }
            con.close();
            return lista;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }

    }
    
}
