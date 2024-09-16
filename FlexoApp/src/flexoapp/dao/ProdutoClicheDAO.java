package flexoapp.dao;

import flexoapp.jdbc.ConnectionFactory;
import flexoapp.model.ProdutoCliche;
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
public class ProdutoClicheDAO {

    private final Connection con;

    public ProdutoClicheDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //Metodo CadastrarProdutoCliche
    public void cadastrarProdutoCliche(ProdutoCliche obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "insert into produtocliche (rp_cliente, faca, ft, Cliente_id, TipoCliche_id, DestinoCliche_id,"
                    + "status, cliche_criado, cliche_modificado) values (?,?,?,?,?,?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getRp_cliche());
            stmt.setString(2, obj.getFaca());
            stmt.setString(3, obj.getFt());
            stmt.setInt(4, obj.getCliente_id());
            stmt.setInt(5, obj.getTipoCliche_id());
            stmt.setInt(6, obj.getDestinoCliche_id());
            stmt.setString(7, obj.getStatus());
            stmt.setString(8, obj.getCliche_criado());
            stmt.setString(9, obj.getCliche_modificado());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

//Metodo AlterarProdutoCliche
    public void alterarProdutoCliche(ProdutoCliche obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "update produtocliente set rp_cliente, faca, ft, Cliente_id, TipoCliche_id, DestinoCliche_id,"
                    + "status, cliche_criado, cliche_modificado where id=? ";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getRp_cliche());
            stmt.setString(2, obj.getFaca());
            stmt.setString(3, obj.getFt());
            stmt.setInt(4, obj.getCliente_id());
            stmt.setInt(5, obj.getTipoCliche_id());
            stmt.setInt(6, obj.getDestinoCliche_id());
            stmt.setString(7, obj.getStatus());
            stmt.setString(8, obj.getCliche_criado());
            stmt.setString(9, obj.getCliche_modificado());
            stmt.setInt(10, obj.getId());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

//Metodo ExcluirProdutoCliche
    public void excluirProdutoCliche(ProdutoCliche obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "delete from produtocliente where id=?";

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

//Metodo ListarProdutoCliche
    public List<ProdutoCliche> ProdutoCliche() {

        try {

            // Passo 1 criar a lista
            List<ProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "select * from produtocliente order by abs(rp_cliche) asc";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                ProdutoCliche obj = new ProdutoCliche();

                obj.setId(rs.getInt("id"));
                obj.setRp_cliche(rs.getString("rp_cliche"));
                obj.setFaca(rs.getString("faca"));
                obj.setFt(rs.getString("ft"));
                obj.setCliente_id(rs.getInt("Cliente_id"));
                obj.setTipoCliche_id(rs.getInt("TipoCliche_id"));
                obj.setDestinoCliche_id(rs.getInt("DestinoCliche_id"));
                obj.setStatus(rs.getString("status"));
                obj.setCliche_criado(rs.getString("cliche_criado"));
                obj.setCliche_modificado(rs.getString("cliche_modificado"));

                lista.add(obj);

            }
            con.close();
            return lista;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }

    }

//Metodo PesquisarProdutoCliche
    public List<ProdutoCliche> pesquisarProdutoCliche(String rp) {

        try {

            // Passo 1 criar a lista
            List<ProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "select * from produtocliente where rp_cliche like? order by abs(rp_cliche) asc";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, rp);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                ProdutoCliche obj = new ProdutoCliche();

                obj.setId(rs.getInt("id"));
                obj.setRp_cliche(rs.getString("rp_cliche"));
                obj.setFaca(rs.getString("faca"));
                obj.setFt(rs.getString("ft"));
                obj.setCliente_id(rs.getInt("Cliente_id"));
                obj.setTipoCliche_id(rs.getInt("TipoCliche_id"));
                obj.setDestinoCliche_id(rs.getInt("DestinoCliche_id"));
                obj.setStatus(rs.getString("status"));
                obj.setCliche_criado(rs.getString("cliche_criado"));
                obj.setCliche_modificado(rs.getString("cliche_modificado"));

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
