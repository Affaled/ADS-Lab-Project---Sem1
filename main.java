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
    };

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
    };
};

class Data {

    //Atributos
    private int dia;
    private int mes;
    private int ano;

    //Construtor
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    };

    //Validação da data
    private boolean validaData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        } else if (mes == 2) {
            //Ano bissexto
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                if (dia > 29) {
                    return false;
                }
            } else if (dia > 28) {
                return false;
            }
        }
        return true;
    };

    //Getters
    public int getDia() {
        return this.dia;
    };

    public int getMes() {
        return this.mes;
    };

    public int getAno() {
        return this.ano;
    };

    //Setters
    public void setDia(int dia) {
        this.dia = dia;
    };

    public void setMes(int mes) {
        this.mes = mes;
    };

    public void setAno(int ano) {
        this.ano = ano;
    };

    //toString
    public String toString() {
        return String.format("Dia: %d\nMês: %d\nAno: %d", this.getDia(), this.getMes(), this.getAno());
    };
}
