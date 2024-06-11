package src.suporte;

public class Endereco {
    private String numero;
    private String nomeDaRua;
    private String complemento;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

    public Endereco(String numero, String nomeDaRua, String complemento, String cidade, String estado, String pais,
            String cep) {
        this.numero = numero;
        this.nomeDaRua = nomeDaRua;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s - %s, %s - %s", numero, nomeDaRua,
                complemento, cidade, estado, pais, cep);
    }
}
