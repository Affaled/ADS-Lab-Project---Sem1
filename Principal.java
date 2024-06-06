import java.util.Scanner;

class Loja {

    // Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    // Construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    };

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao);
    };

    // Getters
    public String getNome() {
        return this.nome;
    };

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    };

    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    };

    public Endereco getEndereco() {
        return this.endereco;
    };

    public Data getDataFundacao() {
        return this.dataFundacao;
    };

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    };

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    };

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    };

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    };

    // toString
    public String toString() {
        return String.format(
                "Nome: %s\nQuantidade de funcionários: %d\nSalário base de funcionários: %.2f\nEndereço: %s\nData de fundação: %s",
                this.getNome(), this.getQuantidadeFuncionarios(), this.getSalarioBaseFuncionario(), this.getEndereco(),
                this.getDataFundacao());
    };

    // gastos com salário
    public double gastosComSalario() {
        if (this.getSalarioBaseFuncionario() == -1) {
            return -1;
        }
        return this.getQuantidadeFuncionarios() * this.getSalarioBaseFuncionario();
    };

    // tamanho da loja
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

    // Atributos
    private String nome;
    private double preco;
    private Data dataValidade;

    // Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    };

    // Getters
    public String getNome() {
        return this.nome;
    };

    public double getPreco() {
        return this.preco;
    };

    public Data getDataValidade() {
        return this.dataValidade;
    };

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setPreco(double preco) {
        this.preco = preco;
    };

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    };

    // Vencimento
    public boolean estaVencido(Data data) {
        if (this.getDataValidade().getAno() < 2023) {
            return true;
        } else if (this.getDataValidade().getAno() == 2023) {
            if (this.getDataValidade().getMes() < 10) {
                return true;
            } else if (this.getDataValidade().getMes() == 10) {
                if (this.getDataValidade().getDia() < 20) {
                    return true;
                }
            }
        }
        return false;
    }

    // toString
    public String toString() {
        return String.format("Nome: %s\nPreço: %.2f\nData de validade: %s\nVencido: %b", this.getNome(),
                this.getPreco(), this.getDataValidade().toString(), this.estaVencido(this.getDataValidade()));
    };
};

class Endereco {

    // Atributos
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    // Construtor
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero,
            String complemento) {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    };

    // Getters
    public String getNomeDaRua() {
        return this.nomeDaRua;
    };

    public String getCidade() {
        return this.cidade;
    };

    public String getEstado() {
        return this.estado;
    };

    public String getPais() {
        return this.pais;
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

    // Setters
    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    };

    public void setCidade(String cidade) {
        this.cidade = cidade;
    };

    public void setEstado(String estado) {
        this.estado = estado;
    };

    public void setPais(String pais) {
        this.pais = pais;
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

    // toString
    public String toString() {
        return String.format("Nome da Rua: %s\nCidade: %s\nEstado: %s\nPaís: %s\nCEP: %s\nNúmero: %s\nComplemento: %s",
                this.getNomeDaRua(), this.getCidade(), this.getEstado(), this.getPais(), this.getCep(),
                this.getNumero(), this.getComplemento());
    };
};

class Data {

    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Construtor
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

    // Validação da data
    private boolean validaData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        } else if (mes == 2) {
            if (verificaAnoBissexto()) {
                if (dia > 29) {
                    return false;
                }
            } else if (dia > 28) {
                return false;
            }
        }
        return true;
    };

    // Ano bissexto
    public boolean verificaAnoBissexto() {
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    };

    // Getters
    public int getDia() {
        return this.dia;
    };

    public int getMes() {
        return this.mes;
    };

    public int getAno() {
        return this.ano;
    };

    // Setters
    public void setDia(int dia) {
        this.dia = dia;
    };

    public void setMes(int mes) {
        this.mes = mes;
    };

    public void setAno(int ano) {
        this.ano = ano;
    };

    // toString
    public String toString() {
        return String.format("Dia: %d\nMês: %d\nAno: %d", this.getDia(), this.getMes(), this.getAno());
    };
};

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        while (true) {
            System.out.println("Menu:\n1. Criar uma loja\n2. Criar um produto\n3. Sair\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da loja:");
                    String nomeLoja = scanner.nextLine();
                    System.out.println("Digite a quantidade de funcionários:");
                    int quantidadeFuncionarios = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o endereço da loja:");
                    System.out.println("Nome da rua:");
                    String nomeRua = scanner.nextLine();
                    System.out.println("Cidade:");
                    String cidade = scanner.nextLine();
                    System.out.println("Estado:");
                    String estado = scanner.nextLine();
                    System.out.println("País:");
                    String pais = scanner.nextLine();
                    System.out.println("CEP:");
                    String cep = scanner.nextLine();
                    System.out.println("Número:");
                    String numero = scanner.nextLine();
                    System.out.println("Complemento:");
                    String complemento = scanner.nextLine();
                    Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
                    System.out.println("Digite a data de fundação da loja (formato: dd mm aaaa):");
                    int diaFundacao = scanner.nextInt();
                    int mesFundacao = scanner.nextInt();
                    int anoFundacao = scanner.nextInt();
                    scanner.nextLine();
                    Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);
                    loja = new Loja(nomeLoja, quantidadeFuncionarios, enderecoLoja, dataFundacao);
                    System.out.println("Loja criada com sucesso!");
                    if (loja != null) {
                        System.out.println(loja.toString());
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = scanner.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double precoProduto = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a data de validade do produto (formato: dd mm aaaa):");
                    int diaValidade = scanner.nextInt();
                    int mesValidade = scanner.nextInt();
                    int anoValidade = scanner.nextInt();
                    scanner.nextLine();
                    Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
                    produto = new Produto(nomeProduto, precoProduto, dataValidade);
                    System.out.println("Produto criado com sucesso!");
                    if (produto != null) {
                        System.out.println("Produto está vencido? "
                                + (produto.estaVencido(new Data(20, 10, 2023)) ? "PRODUTO VENCIDO"
                                        : "PRODUTO NÃO VENCIDO"));
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}