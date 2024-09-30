package dao;

import jdbc.ConnectionFactory;
import model.ProdutoCliche;
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
            String sql = "insert into produtocliche (rp_cliche, faca, ft, Cliente_id, TipoCliche_id, DestinoCliche_id,"
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
            String sql = "update produtocliche set rp_cliche=?, faca=?, ft=?, Cliente_id=?, TipoCliche_id=?, DestinoCliche_id=?,"
                    + "status=?, cliche_criado=?, cliche_modificado=? where id=? ";

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
            String sql = "delete from produtocliche where id=?";

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
    public List<ProdutoCliche> ListarProdutoCliche() {

        try {

            // Passo 1 criar a lista
            List<ProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            //String sql = "select * from produtocliche order by abs(rp_cliche) asc";
            String sql = "SELECT produtocliche.id, rp_cliche, faca, ft, Cliente_id, cliente.nome as cliente, \n"
                    + "TipoCliche_id, tipocliche.nome as tipocliche, DestinoCliche_id, destinocliche.nome as destinocliche, \n"
                    + "status, cliche_criado, cliche_modificado FROM flexo.produtocliche\n"
                    + "INNER JOIN flexo.cliente ON produtocliche.Cliente_id = cliente.id\n"
                    + "INNER JOIN flexo.destinocliche ON produtocliche.DestinoCliche_id = destinocliche.id\n"
                    + "INNER JOIN flexo.tipocliche ON produtocliche.TipoCliche_id = tipocliche.id\n"
                    + "WHERE rp_cliche LIKE '%%'\n"
                    + "or faca LIKE '%%'\n"
                    + "or ft LIKE '%%'\n"
                    + "or cliente.nome LIKE '%%'\n"
                    + "or destinocliche.nome LIKE '%%'\n"
                    + "or tipocliche.nome LIKE '%%'\n"
                    + "or status LIKE '%%' order by abs(rp_cliche) asc;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                ProdutoCliche obj = new ProdutoCliche();

                obj.setId(rs.getInt("id"));
                obj.setRp_cliche(rs.getString("rp_cliche"));
                obj.setFaca(rs.getString("faca"));
                obj.setFt(rs.getString("ft"));
                obj.setCliente_id(rs.getInt("Cliente_id"));
                obj.setCliente(rs.getString("cliente"));
                obj.setTipoCliche_id(rs.getInt("TipoCliche_id"));
                obj.setTipocliche(rs.getString("Tipocliche"));
                obj.setDestinoCliche_id(rs.getInt("DestinoCliche_id"));
                obj.setDestinocliche(rs.getString("Destinocliche"));
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
    public List<ProdutoCliche> pesquisarProdutoCliche(String pesquisa) {

        try {

            // Passo 1 criar a lista
            List<ProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            //String sql = "select * from produtocliente where rp_cliche like '%?%' order by abs(rp_cliche) asc";
            String sql = "SELECT produtocliche.id, rp_cliche, faca, ft, Cliente_id, cliente.nome as cliente, \n"
                    + "TipoCliche_id, tipocliche.nome as tipocliche, DestinoCliche_id, destinocliche.nome as destinocliche, \n"
                    + "status, cliche_criado, cliche_modificado FROM flexo.produtocliche\n"
                    + "INNER JOIN flexo.cliente ON produtocliche.Cliente_id = cliente.id\n"
                    + "INNER JOIN flexo.destinocliche ON produtocliche.DestinoCliche_id = destinocliche.id\n"
                    + "INNER JOIN flexo.tipocliche ON produtocliche.TipoCliche_id = tipocliche.id\n"
                    + "WHERE rp_cliche LIKE ?\n"
                    + "or faca LIKE ?\n"
                    + "or ft LIKE ?\n"
                    + "or cliente.nome LIKE ?\n"
                    + "or destinocliche.nome LIKE ?\n"
                    + "or tipocliche.nome LIKE ?\n"
                    + "or status LIKE ? order by abs(rp_cliche) asc;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pesquisa);
            stmt.setString(2, pesquisa);
            stmt.setString(3, pesquisa);
            stmt.setString(4, pesquisa);
            stmt.setString(5, pesquisa);
            stmt.setString(6, pesquisa);
            stmt.setString(7, pesquisa);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                ProdutoCliche obj = new ProdutoCliche();

                obj.setId(rs.getInt("id"));
                obj.setRp_cliche(rs.getString("rp_cliche"));
                obj.setFaca(rs.getString("faca"));
                obj.setFt(rs.getString("ft"));
                obj.setCliente_id(rs.getInt("Cliente_id"));
                obj.setCliente(rs.getString("cliente"));
                obj.setTipoCliche_id(rs.getInt("TipoCliche_id"));
                obj.setTipocliche(rs.getString("Tipocliche"));
                obj.setDestinoCliche_id(rs.getInt("DestinoCliche_id"));
                obj.setDestinocliche(rs.getString("Destinocliche"));
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

//Metodo PesquisarEliminarCliche
    public List<ProdutoCliche> pesquisarEliminarCliche(String pesquisa) {

        try {

            // Passo 1 criar a lista
            List<ProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            //String sql = "select * from produtocliente where rp_cliche like '%?%' order by abs(rp_cliche) asc";
            String sql = "SELECT produtocliche.id, rp_cliche, faca, ft, Cliente_id, cliente.nome as cliente, \n"
                    + "TipoCliche_id, tipocliche.nome as tipocliche, DestinoCliche_id, destinocliche.nome as destinocliche, \n"
                    + "status, cliche_criado, cliche_modificado FROM flexo.produtocliche\n"
                    + "INNER JOIN flexo.cliente ON produtocliche.Cliente_id = cliente.id\n"
                    + "INNER JOIN flexo.destinocliche ON produtocliche.DestinoCliche_id = destinocliche.id\n"
                    + "INNER JOIN flexo.tipocliche ON produtocliche.TipoCliche_id = tipocliche.id\n"
                    + "WHERE rp_cliche LIKE ?\n"
                    + "or faca LIKE ?\n"
                    + "or ft LIKE ?\n"
                    + "or cliente.nome LIKE ?\n"
                    + "or destinocliche.nome LIKE ?\n"
                    + "or tipocliche.nome LIKE ?\n"
                    + "or status LIKE ? order by abs(rp_cliche) asc;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pesquisa);
            stmt.setString(2, pesquisa);
            stmt.setString(3, pesquisa);
            stmt.setString(4, pesquisa);
            stmt.setString(5, pesquisa);
            stmt.setString(6, pesquisa);
            stmt.setString(7, pesquisa);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                ProdutoCliche obj = new ProdutoCliche();

                obj.setId(rs.getInt("id"));
                obj.setRp_cliche(rs.getString("rp_cliche"));
                obj.setFaca(rs.getString("faca"));
                obj.setFt(rs.getString("ft"));
                obj.setCliente_id(rs.getInt("Cliente_id"));
                obj.setCliente(rs.getString("cliente"));
                obj.setTipoCliche_id(rs.getInt("TipoCliche_id"));
                obj.setTipocliche(rs.getString("Tipocliche"));
                obj.setDestinoCliche_id(rs.getInt("DestinoCliche_id"));
                obj.setDestinocliche(rs.getString("Destinocliche"));
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

//Metodo ResgatarId
    public List<ProdutoCliche> RetornaId(String rp) {

        try {
            //Cria a Lista
            List<ProdutoCliche> lista = new ArrayList<>();

            //Cria comando sql
            String sql = "SELECT * FROM flexo.produtocliche\n"
                    + "WHERE rp_cliche = ?\n"
                    + "order by cliche_criado asc limit 1;";

            //Conecta ao banco de dados e organiza o comando sql
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
                obj.setCliente(rs.getString("cliente"));
                obj.setTipoCliche_id(rs.getInt("TipoCliche_id"));
                obj.setTipocliche(rs.getString("Tipocliche"));
                obj.setDestinoCliche_id(rs.getInt("DestinoCliche_id"));
                obj.setDestinocliche(rs.getString("Destinocliche"));
                obj.setStatus(rs.getString("status"));
                obj.setCliche_criado(rs.getString("cliche_criado"));
                obj.setCliche_modificado(rs.getString("cliche_modificado"));

                //Executa
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
