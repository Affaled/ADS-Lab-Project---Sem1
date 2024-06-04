class Loja {

    //Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    //Construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    };

    public Loja(String nome, int quantidadeFuncionarios) {
        this(nome, quantidadeFuncionarios, -1);
    };

    //Getters
    public String getNome() {
        return this.nome;
    };

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    };

    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    };

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    };

    public void setSalariobaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    };

    //toString
    public String toString() {
        return String.format("Nome: %s\nQuantidade de funcionários: %d\nSalário base de funcionários: %.2f", this.getNome(), this.getQuantidadeFuncionarios(), this.getSalarioBaseFuncionario());
    };
 
    //gastos com salário 
    public double gastosComSalario() {
        if (this.getSalarioBaseFuncionario() == -1) {
            return -1;
        }
        return this.getQuantidadeFuncionarios() * this.getSalarioBaseFuncionario();
    };

    //tamanho da loja
    public char tamanhoDaLoja() {
        if (this.getQuantidadeFuncionarios() < 10) {
            return 'P';
        } else if (this.getQuantidadeFuncionarios() <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    };
};

class Produto {

    //Atributos
    private String nome;
    private double preco;

    //Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    };

    //Getters
    public String getNome() {
        return this.nome;
    };

    public double getPreco() {
        return this.preco;
    };

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setPreco(double preco) {
        this.preco = preco;
    };

    //toString
    public String toString() {
        return String.format("Nome: %s\nPreço: %.2f", this.getNome(), this.getPreco());
    };
};

class Endereco {

    //Atributos
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String cep;
    private String numero;
    private String complemento;

    //Construtor
    public Endereco(String nomeDaRua, String cidade, String estado, String cep, String numero, String complemento) {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    //Getters
    public String getNomeDaRua() {
        return this.nomeDaRua;
    };

    public String getCidade() {
        return this.cidade;
    };

    public String getEstado() { 
        return this.estado;
    }; 

    public String getCep() {
        return this.cep;
    };

    public String getNumero() {
        return this.numero;
    };

    public String getComplemento() {
        return this.complemento;
    };

    //Setters
    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    };

    public void setCidade(String cidade) {
        this.cidade = cidade;
    };

    public void setEstado(String estado) {
        this.estado = estado;
    };

    public void setCep(String cep) {
        this.cep = cep;
    };

    public void setNumero(String numero) {
        this.numero = numero;
    };

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    };

    //toString
    public String toString() {
        return String.format("Nome da Rua: %s\nCidade: %s\nEstado: %s\nCEP: %s\nNúmero: %s\nComplemento: %s", this.getNomeDaRua(), this.getCidade(), this.getEstado(), this.getCep(), this.getNumero(), this.getComplemento());
    }
}