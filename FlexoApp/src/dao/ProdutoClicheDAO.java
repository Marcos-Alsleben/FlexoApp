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

            //JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
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

            //JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
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

            // JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
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

//Metodo ListarProdutoClicheEliminado
    public List<ProdutoCliche> ListarProdutoClicheEliminado() {

        try {

            // Passo 1 criar a lista
            List<ProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "SELECT rp_cliche FROM flexo.produtocliche\n"
                    + "WHERE status = 'ELIMINADO' order by abs(rp_cliche) asc";

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                ProdutoCliche obj = new ProdutoCliche();

                obj.setRp_cliche(rs.getString("rp_cliche"));

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
                    + "or status LIKE ? ORDER BY CASE WHEN status = 'ATIVO' THEN 1 ELSE 2 END, abs(rp_cliche) ASC;";
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
            String sql = "SELECT produtocliche.id, rp_cliche, faca, ft, Cliente_id, cliente.nome as cliente,\n"
                    + "TipoCliche_id, tipocliche.nome as tipocliche, DestinoCliche_id, destinocliche.nome as destinocliche,\n"
                    + "status, trabalho_criado, cliche_criado, cliche_modificado FROM flexo.produtocliche\n"
                    + "INNER JOIN flexo.cliente ON produtocliche.Cliente_id = cliente.id\n"
                    + "INNER JOIN flexo.destinocliche ON produtocliche.DestinoCliche_id = destinocliche.id\n"
                    + "INNER JOIN flexo.tipocliche ON produtocliche.TipoCliche_id = tipocliche.id\n"
                    + "INNER JOIN flexo.trabalhoprodutocliche on produtocliche.id = trabalhoprodutocliche.ProdutoCliche_id\n"
                    + " WHERE produtocliche.status = 'ATIVO' \n"
                    + "AND trabalhoprodutocliche.trabalho_criado <= DATE_SUB(NOW(), INTERVAL ? MONTH)\n"
                    + "AND trabalhoprodutocliche.trabalho_criado = (\n"
                    + "      SELECT MAX(trabalhoprodutocliche.trabalho_criado)\n"
                    + "      FROM flexo.trabalhoprodutocliche\n"
                    + "      WHERE trabalhoprodutocliche.ProdutoCliche_id = produtocliche.id\n"
                    + "  )\n"
                    + "order by abs(rp_cliche) asc;";
            PreparedStatement stmt = con.prepareStatement(sql);

            int meses = Integer.parseInt(pesquisa);
            stmt.setInt(1, meses);

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
                obj.setTrabalho_criado(rs.getString("trabalho_criado"));
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

//Metodo ContarClichesAtivos
    public int ContarClichesAtivos(String status, String destino) {

        try {
            // Criar o comando sql, organizar e executar
            String sql = "SELECT COUNT(*) AS QuantidadeClichesAtivos FROM ProdutoCliche pc "
                    + "JOIN DestinoCliche dc ON pc.DestinoCliche_id = dc.id "
                    + "WHERE pc.status = ? AND dc.nome LIKE ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, status);
            stmt.setString(2, "%" + destino + "%"); // Corrigido aqui
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt("QuantidadeClichesAtivos");
                con.close();
                return quantidade;
            } else {
                con.close();
                return 0;
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return -1;
        }
    }

// Método para contar os clichês ativos para eliminar
    public int ContarClichesParaEliminar(String meses) {
        // Verificação da conexão
        if (con == null) {
            throw new IllegalStateException("Conexão não pode ser nula.");
        }

        String sql = "SELECT COUNT(*) AS quantidade_cliches "
                + "FROM flexo.produtocliche "
                + "INNER JOIN flexo.cliente ON produtocliche.Cliente_id = cliente.id "
                + "INNER JOIN flexo.destinocliche ON produtocliche.DestinoCliche_id = destinocliche.id "
                + "INNER JOIN flexo.tipocliche ON produtocliche.TipoCliche_id = tipocliche.id "
                + "INNER JOIN flexo.trabalhoprodutocliche ON produtocliche.id = trabalhoprodutocliche.ProdutoCliche_id "
                + "WHERE produtocliche.status = 'ATIVO' "
                + "AND trabalhoprodutocliche.trabalho_criado <= DATE_SUB(NOW(), INTERVAL ? MONTH) "
                + "AND trabalhoprodutocliche.trabalho_criado = ( "
                + "      SELECT MAX(trabalhoprodutocliche.trabalho_criado) "
                + "      FROM flexo.trabalhoprodutocliche "
                + "      WHERE trabalhoprodutocliche.ProdutoCliche_id = produtocliche.id "
                + ") "
                + "ORDER BY abs(rp_cliche) ASC;";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, meses);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("quantidade_cliches");
                } else {
                    return 0;
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return -1;
        }
    }

//Metodo ListarAnosCliche
    public List<ProdutoCliche> ListarAnosCliche() {

        try {

            // Passo 1 criar a lista
            List<ProdutoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "SELECT DISTINCT YEAR(pc.cliche_criado) AS ano\n"
                    + "FROM ProdutoCliche AS pc\n"
                    + "WHERE pc.status = 'Ativo'\n"
                    + "ORDER BY ano DESC;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                ProdutoCliche obj = new ProdutoCliche();

                obj.setAno(rs.getString("ano"));

                lista.add(obj);

            }
            con.close();
            return lista;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return null;
        }

    }

//Metodo ContarClichesAtivos
    public int ContarClichesNovos(String ano, String mes, String destino) {

        try {
            // Criar o comando sql, organizar e executar
            String sql = "SELECT COUNT(*) AS total_cliches_novos\n"
                    + "FROM TrabalhoProdutoCliche AS tpc\n"
                    + "JOIN ProdutoCliche AS pc ON tpc.ProdutoCliche_id = pc.id\n"
                    + "JOIN DestinoCliche AS dc ON pc.DestinoCliche_id = dc.id\n"
                    + "WHERE tpc.condicao_uso = 'novo' \n"
                    + "  AND YEAR(tpc.trabalho_criado) = ? \n"
                    + "  AND MONTH(tpc.trabalho_criado) LIKE ?\n"
                    + "  AND dc.nome LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ano);
            stmt.setString(2, "%" + mes + "%");
            stmt.setString(3, "%" + destino + "%");
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt("total_cliches_novos");
                con.close();
                return quantidade;
            } else {
                con.close();
                return 0;
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return -1;
        }
    }

//Metodo ContarVidaUtilCliches
    public int ContarVidaUtilCliches(String tipoCliche, String destino) {

        try {
            // Criar o comando sql, organizar e executar
            String sql = "-- Contar quantidade de \"NOVO\" por rp_cliche e filtrar os que têm mais de um \"NOVO\"\n"
                    + "WITH novo_counts AS (\n"
                    + "    SELECT \n"
                    + "        p.rp_cliche,\n"
                    + "        COUNT(*) AS quantidade_novo\n"
                    + "    FROM \n"
                    + "        ProdutoCliche p\n"
                    + "    JOIN \n"
                    + "        TrabalhoProdutoCliche t ON p.id = t.ProdutoCliche_id\n"
                    + "    JOIN \n"
                    + "        DestinoCliche d ON p.DestinoCliche_id = d.id\n"
                    + "    JOIN \n"
                    + "        TipoCliche tc ON p.TipoCliche_id = tc.id\n"
                    + "    WHERE \n"
                    + "        t.condicao_uso = 'NOVO' AND \n"
                    + "        d.nome LIKE ? AND \n"
                    + "        tc.nome LIKE ? \n"
                    + "    GROUP BY \n"
                    + "        p.rp_cliche\n"
                    + "    HAVING \n"
                    + "        COUNT(*) > 1\n"
                    + "),\n"
                    + "\n"
                    + "-- Preparar a contagem dos serviços entre os ciclos \"NOVO\"\n"
                    + "validos AS (\n"
                    + "    SELECT \n"
                    + "        p.rp_cliche,\n"
                    + "        t.condicao_uso,\n"
                    + "        t.trabalho_criado,\n"
                    + "        @num := IF(@grupo = p.rp_cliche, @num + (t.condicao_uso = 'NOVO'), 1) AS quantidade_novo,\n"
                    + "        @grupo := p.rp_cliche,\n"
                    + "        COUNT(*) OVER (PARTITION BY p.rp_cliche, @num) - 1 AS count_servicos\n"
                    + "    FROM \n"
                    + "        ProdutoCliche p\n"
                    + "    JOIN \n"
                    + "        TrabalhoProdutoCliche t ON p.id = t.ProdutoCliche_id\n"
                    + "    JOIN \n"
                    + "        DestinoCliche d ON p.DestinoCliche_id = d.id\n"
                    + "    JOIN \n"
                    + "        TipoCliche tc ON p.TipoCliche_id = tc.id,\n"
                    + "        (SELECT @num := 0, @grupo := '') AS vars\n"
                    + "    WHERE \n"
                    + "        d.nome LIKE ? AND \n"
                    + "        tc.nome LIKE ? \n"
                    + "    ORDER BY \n"
                    + "        p.rp_cliche, t.trabalho_criado\n"
                    + "),\n"
                    + "\n"
                    + "-- Contar os registros válidos entre os ciclos \"NOVO\"\n"
                    + "contagens AS (\n"
                    + "    SELECT\n"
                    + "        subquery.rp_cliche,\n"
                    + "        MAX(CASE \n"
                    + "            WHEN subquery.quantidade_novo = 2 THEN subquery.count_servicos\n"
                    + "            ELSE 0 \n"
                    + "        END) AS registros_entre_primeiro_e_segundo_novo,\n"
                    + "        MAX(CASE \n"
                    + "            WHEN subquery.quantidade_novo = 3 THEN subquery.count_servicos\n"
                    + "            ELSE 0 \n"
                    + "        END) AS registros_entre_segundo_e_terceiro_novo,\n"
                    + "        MAX(CASE \n"
                    + "            WHEN subquery.quantidade_novo = 4 THEN subquery.count_servicos\n"
                    + "            ELSE 0 \n"
                    + "        END) AS registros_entre_terceiro_e_quarto_novo\n"
                    + "    FROM validos AS subquery\n"
                    + "    WHERE subquery.rp_cliche IN (SELECT rp_cliche FROM novo_counts)\n"
                    + "    GROUP BY \n"
                    + "        subquery.rp_cliche\n"
                    + ")\n"
                    + "\n"
                    + "-- Calcular a média dos registros válidos ou retornar o único valor válido arredondado para cima\n"
                    + "SELECT \n"
                    + "    CASE \n"
                    + "        WHEN COUNT(*) > 1 THEN CEIL(AVG(registros_validos))\n"
                    + "        ELSE CEIL(MAX(registros_validos))\n"
                    + "    END AS media_registros\n"
                    + "FROM (\n"
                    + "    SELECT \n"
                    + "        registros_entre_primeiro_e_segundo_novo AS registros_validos\n"
                    + "    FROM contagens\n"
                    + "    WHERE registros_entre_primeiro_e_segundo_novo > 0\n"
                    + "    \n"
                    + "    UNION ALL\n"
                    + "    \n"
                    + "    SELECT \n"
                    + "        registros_entre_segundo_e_terceiro_novo AS registros_validos\n"
                    + "    FROM contagens\n"
                    + "    WHERE registros_entre_segundo_e_terceiro_novo > 0\n"
                    + "    \n"
                    + "    UNION ALL\n"
                    + "    \n"
                    + "    SELECT \n"
                    + "        registros_entre_terceiro_e_quarto_novo AS registros_validos\n"
                    + "    FROM contagens\n"
                    + "    WHERE registros_entre_terceiro_e_quarto_novo > 0\n"
                    + ") AS validos_registros;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + destino + "%");
            stmt.setString(2, "%" + tipoCliche + "%");
            stmt.setString(3, "%" + destino + "%");
            stmt.setString(4, "%" + tipoCliche + "%");
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int quantidade = rs.getInt("media_registros");
                con.close();
                return quantidade;
            } else {
                con.close();
                return 0;
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
            return -1;
        }
    }


}
