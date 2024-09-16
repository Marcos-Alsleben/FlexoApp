package flexoapp.dao;

import flexoapp.jdbc.ConnectionFactory;
import flexoapp.model.TrabalhoProdutoCliche;
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
public class TrabalhoProdutoClicheDAO {

    private Connection con;

    public TrabalhoProdutoClicheDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //Metodo CadastrarTrabalhoProdutoCliche
    public void cadastrarTrabalhoProdutoCliche(TrabalhoProdutoCliche obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "insert into trabalhoprodutocliche (rp_trabalho, condicao_uso, trabalho_criado, trabalho_modificado, ProdutoCliche_id) "
                    + " values (?,?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getRp_trabalho());
            stmt.setString(2, obj.getCondicao_uso());
            stmt.setString(3, obj.getTrabalho_criado());
            stmt.setString(4, obj.getTrabalho_modificado());
            stmt.setInt(5, obj.getProdutoCliche_id());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

//Metodo AlterarTrabalhoProdutoCliche
    public void alterarTrabalhoProdutoCliche(TrabalhoProdutoCliche obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "update trabalhoprodutocliente set rp_trabalho, condicao_uso, trabalho_criado, trabalho_modificado, ProdutoCliche_id where id=? ";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getRp_trabalho());
            stmt.setString(2, obj.getCondicao_uso());
            stmt.setString(3, obj.getTrabalho_criado());
            stmt.setString(4, obj.getTrabalho_modificado());
            stmt.setInt(5, obj.getProdutoCliche_id());
            stmt.setInt(6, obj.getId());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

//Metodo ExcluirTrabalhoProdutoCliche
    public void excluirTrabalhoProdutoCliche(TrabalhoProdutoCliche obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "delete from trabalhoprodutocliente where id=?";

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

//Metodo ListarTrabalhoProdutoCliche
    public List<TrabalhoProdutoCliche> TrabalhoProdutoCliche() {

        try {

            // Passo 1 criar a lista
            List<TrabalhoProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "select * from trabalhoprodutocliente order by abs(rp_trabalho) asc";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                TrabalhoProdutoCliche obj = new TrabalhoProdutoCliche();

                obj.setId(rs.getInt("id"));
                obj.setRp_trabalho(rs.getString("rp_trabalho"));
                obj.setCondicao_uso(rs.getString("condicao_uso"));
                obj.setTrabalho_criado(rs.getString("trabalho_criado"));
                obj.setTrabalho_modificado(rs.getString("trabalho_modificado"));
                obj.setProdutoCliche_id(rs.getInt("ProdutoCliente_id"));

                lista.add(obj);

            }
            con.close();
            return lista;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }

    }

//Metodo PesquisarTrabalhoProdutoCliche
    public List<TrabalhoProdutoCliche> pesquisarTrabalhoProdutoCliche(String rp) {

        try {

            // Passo 1 criar a lista
            List<TrabalhoProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "select * from trabalhoprodutocliente where rp_trabalho like? order by abs(rp_trabalho) asc";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, rp);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                TrabalhoProdutoCliche obj = new TrabalhoProdutoCliche();

                obj.setId(rs.getInt("id"));
                obj.setRp_trabalho(rs.getString("rp_trabalho"));
                obj.setCondicao_uso(rs.getString("condicao_uso"));
                obj.setTrabalho_criado(rs.getString("trabalho_criado"));
                obj.setTrabalho_modificado(rs.getString("trabalho_modificado"));
                obj.setProdutoCliche_id(rs.getInt("ProdutoCliente_id"));

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
