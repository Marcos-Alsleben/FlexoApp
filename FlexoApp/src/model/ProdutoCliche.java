package model;

/**
 *
 * @author gmg
 */
public class ProdutoCliche {

//Atrubutos
    private int id;
    private String rp_cliche;
    private String faca;
    private String ft;
    private int Cliente_id;
    private int TipoCliche_id;
    private int DestinoCliche_id;
    private String status;
    private String cliche_criado;
    private String cliche_modificado;

    private String cliente;
    private String tipocliche;
    private String destinocliche;
    private String trabalho_criado;

//Getter e Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRp_cliche() {
        return rp_cliche;
    }

    public void setRp_cliche(String rp_cliche) {
        this.rp_cliche = rp_cliche;
    }

    public String getFaca() {
        return faca;
    }

    public void setFaca(String faca) {
        this.faca = faca;
    }

    public String getFt() {
        return ft;
    }

    public void setFt(String ft) {
        this.ft = ft;
    }

    public int getCliente_id() {
        return Cliente_id;
    }

    public void setCliente_id(int Cliente_id) {
        this.Cliente_id = Cliente_id;
    }

    public int getTipoCliche_id() {
        return TipoCliche_id;
    }

    public void setTipoCliche_id(int TipoCliche_id) {
        this.TipoCliche_id = TipoCliche_id;
    }

    public int getDestinoCliche_id() {
        return DestinoCliche_id;
    }

    public void setDestinoCliche_id(int DestinoCliche_id) {
        this.DestinoCliche_id = DestinoCliche_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCliche_criado() {
        return cliche_criado;
    }

    public void setCliche_criado(String cliche_criado) {
        this.cliche_criado = cliche_criado;
    }

    public String getCliche_modificado() {
        return cliche_modificado;
    }

    public void setCliche_modificado(String cliche_modificado) {
        this.cliche_modificado = cliche_modificado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipocliche() {
        return tipocliche;
    }

    public void setTipocliche(String tipocliche) {
        this.tipocliche = tipocliche;
    }

    public String getDestinocliche() {
        return destinocliche;
    }

    public void setDestinocliche(String destinocliche) {
        this.destinocliche = destinocliche;
    }

    public String getTrabalho_criado() {
        return trabalho_criado;
    }

    public void setTrabalho_criado(String trabalho_criado) {
        this.trabalho_criado = trabalho_criado;
    }



}
