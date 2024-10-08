
package dao;

import jdbc.ConnectionFactory;
import model.TipoCliche;
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
public class TipoClicheDAO {

private Connection con;

    public TipoClicheDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    // Metodo Cadastrar TipoCliche
    public void CadastrarTipoCliche(TipoCliche obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "insert into tipocliche (nome, criado, modificado) "
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

            //JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }
    }

//Metodo AlterarTipoCliche
    public void alterarTipoCliche(TipoCliche obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "update tipocliche set nome=?, criado=?, modificado=? where id=?";

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

            //JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

//Metodo ExcluirTipoCliche
    public void excluirTipoCliche(TipoCliche obj) {
        try {

            //1 passo  - criar o comando sql
            String sql = "delete from tipocliche where id=?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();
            con.close();

            //JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }

    }

//Metodo ListarTipoCliche
    public List<TipoCliche> listarTipoCliche() {

        try {

            // Passo 1 criar a lista
            List<TipoCliche> lista = new ArrayList<>();

            // Passo 2 criar o comando sql, organizar e executar
            String sql = "select * from tipocliche";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                TipoCliche obj = new TipoCliche();

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

//Metodo ResgatarId
    public List<TipoCliche> RetornaId(String nome){
        
        try {
            //Cria a Lista
            List<TipoCliche> lista = new ArrayList<>();
            
            //Cria comando sql
            String sql = "SELECT * FROM tipocliche where "
                    + "nome =? order by criado asc limit 1;";
            
            //Conecta ao banco de dados e organiza o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);                      
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                                       
                TipoCliche obj = new TipoCliche();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("Nome"));
                obj.setCriado(rs.getString("Criado"));
                obj.setModificado(rs.getString("Modificado"));
                                
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
