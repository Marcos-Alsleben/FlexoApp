package flexoapp.model;

/**
 *
 * @author gmg
 */
public class TrabalhoProdutoCliche {

//Atributos
    private int id;
    private String rp_trabalho;
    private String condicao_uso;
    private String trabalho_criado;
    private String trabalho_modificado;
    private int ProdutoCliche_id;

//Getter e Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRp_trabalho() {
        return rp_trabalho;
    }

    public void setRp_trabalho(String rp_trabalho) {
        this.rp_trabalho = rp_trabalho;
    }

    public String getCondicao_uso() {
        return condicao_uso;
    }

    public void setCondicao_uso(String condicao_uso) {
        this.condicao_uso = condicao_uso;
    }

    public String getTrabalho_criado() {
        return trabalho_criado;
    }

    public void setTrabalho_criado(String trabalho_criado) {
        this.trabalho_criado = trabalho_criado;
    }

    public String getTrabalho_modificado() {
        return trabalho_modificado;
    }

    public void setTrabalho_modificado(String trabalho_modificado) {
        this.trabalho_modificado = trabalho_modificado;
    }

    public int getProdutoCliche_id() {
        return ProdutoCliche_id;
    }

    public void setProdutoCliche_id(int ProdutoCliche_id) {
        this.ProdutoCliche_id = ProdutoCliche_id;
    }
    

}
