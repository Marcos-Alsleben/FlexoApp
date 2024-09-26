package dao;

import jdbc.ConnectionFactory;
import model.TrabalhoProdutoCliche;
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
            String sql = "insert into trabalhoprodutocliche (rp_trabalho, condicao_uso, ProdutoCliche_id, trabalho_criado, trabalho_modificado) "
                    + " values (?,?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getRp_trabalho());
            stmt.setString(2, obj.getCondicao_uso());
            stmt.setInt(3, obj.getProdutoCliche_id());
            stmt.setString(4, obj.getTrabalho_criado());
            stmt.setString(5, obj.getTrabalho_modificado());

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
            String sql = "update trabalhoprodutocliche set rp_trabalho=?, condicao_uso=?, ProdutoCliche_id=?, trabalho_criado=?, trabalho_modificado=? where id=? ";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getRp_trabalho());
            stmt.setString(2, obj.getCondicao_uso());
            stmt.setInt(3, obj.getProdutoCliche_id());
            stmt.setString(4, obj.getTrabalho_criado());
            stmt.setString(5, obj.getTrabalho_modificado());
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
            String sql = "delete from trabalhoprodutocliche where id=?";

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
    public List<TrabalhoProdutoCliche> ListarTrabalhoProdutoCliche() {

        try {

            // Passo 1 criar a lista
            List<TrabalhoProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "SELECT trabalhoprodutocliche.id, rp_trabalho, faca, \n"
                    + "destinocliche.nome as destinocliche, tipocliche.nome as tipocliche,\n"
                    + "produtocliche.id as id_cliche, rp_cliche, condicao_uso, \n"
                    + "trabalho_criado, trabalho_modificado\n"
                    + "FROM flexo.trabalhoprodutocliche\n"
                    + "INNER JOIN flexo.produtocliche\n"
                    + "on trabalhoprodutocliche.ProdutoCliche_id = produtocliche.id\n"
                    + "INNER JOIN flexo.destinoCliche\n"
                    + "ON produtocliche.DestinoCliche_id = destinocliche.id\n"
                    + "INNER JOIN flexo.tipocliche\n"
                    + "ON produtocliche.TipoCliche_id = tipocliche.id\n"
                    + "WHERE rp_trabalho LIKE '%%'\n"
                    + "OR condicao_uso LIKE '%%'\n"
                    + "OR rp_cliche LIKE '%%'\n"
                    + "order by abs(rp_trabalho) asc;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                TrabalhoProdutoCliche obj = new TrabalhoProdutoCliche();

                obj.setId(rs.getInt("id"));
                obj.setRp_trabalho(rs.getString("rp_trabalho"));
                obj.setFaca(rs.getString("faca"));
                obj.setDestinocliche(rs.getString("destinocliche"));
                obj.setTipocliche(rs.getString("tipocliche"));
                obj.setId_Cliche(rs.getString("id_cliche"));
                obj.setRp_Cliche(rs.getString("rp_cliche"));
                obj.setCondicao_uso(rs.getString("condicao_uso"));
                obj.setTrabalho_criado(rs.getString("trabalho_criado"));
                obj.setTrabalho_modificado(rs.getString("trabalho_modificado"));

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
    public List<TrabalhoProdutoCliche> pesquisarTrabalhoProdutoCliche(String pesquisa) {

        try {

            // Passo 1 criar a lista
            List<TrabalhoProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "SELECT trabalhoprodutocliche.id, rp_trabalho, faca, \n"
                    + "destinocliche.nome as destinocliche, tipocliche.nome as tipocliche,\n"
                    + "produtocliche.id as id_cliche, rp_cliche, condicao_uso, \n"
                    + "trabalho_criado, trabalho_modificado\n"
                    + "FROM flexo.trabalhoprodutocliche\n"
                    + "INNER JOIN flexo.produtocliche\n"
                    + "on trabalhoprodutocliche.ProdutoCliche_id = produtocliche.id\n"
                    + "INNER JOIN flexo.destinoCliche\n"
                    + "ON produtocliche.DestinoCliche_id = destinocliche.id\n"
                    + "INNER JOIN flexo.tipocliche\n"
                    + "ON produtocliche.TipoCliche_id = tipocliche.id\n"
                    + "WHERE rp_trabalho LIKE ?\n"
                    + "OR condicao_uso LIKE ?\n"
                    + "OR rp_cliche LIKE ?\n"
                    + "order by abs(rp_trabalho) asc;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pesquisa);
            stmt.setString(2, pesquisa);
            stmt.setString(3, pesquisa);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                TrabalhoProdutoCliche obj = new TrabalhoProdutoCliche();

                obj.setId(rs.getInt("id"));
                obj.setRp_trabalho(rs.getString("rp_trabalho"));
                obj.setFaca(rs.getString("faca"));
                obj.setDestinocliche(rs.getString("destinocliche"));
                obj.setTipocliche(rs.getString("tipocliche"));
                obj.setId_Cliche(rs.getString("id_cliche"));
                obj.setRp_Cliche(rs.getString("rp_cliche"));
                obj.setCondicao_uso(rs.getString("condicao_uso"));
                obj.setTrabalho_criado(rs.getString("trabalho_criado"));
                obj.setTrabalho_modificado(rs.getString("trabalho_modificado"));

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
