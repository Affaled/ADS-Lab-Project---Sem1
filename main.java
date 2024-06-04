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
}