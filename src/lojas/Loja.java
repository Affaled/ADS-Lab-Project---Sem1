package src.lojas;

import src.produtos.Produto;
import src.suporte.*;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao, tamanhoEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public double gastosComSalario() {
        if (this.getSalarioBaseFuncionario() == -1) {
            return -1;
        }
        return this.getQuantidadeFuncionarios() * this.getSalarioBaseFuncionario();
    }

    public char tamanhoDaLoja() {
        if (this.getQuantidadeFuncionarios() < 10) {
            return 'P';
        } else if (this.getQuantidadeFuncionarios() <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public void imprimeProdutos() {
        System.out.println("Produtos em estoque:");
        for (Produto produto : this.getEstoqueProdutos()) {
            if (produto != null) {
                System.out.println(produto.toString());
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < this.getEstoqueProdutos().length; i++) {
            if (this.getEstoqueProdutos()[i] == null) {
                this.getEstoqueProdutos()[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < this.getEstoqueProdutos().length; i++) {
            if (this.getEstoqueProdutos()[i] != null && this.getEstoqueProdutos()[i].getNome().equals(nomeProduto)) {
                this.getEstoqueProdutos()[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\nQuantidade de funcionários: %d\nSalário base de funcionários: %.2f\nGastos com salaário: %.2f \nEndereço: %s\nData de fundação: %s\nQuantidade de produtos em estoque: %d\nTamanho da loja: %c",
                this.getNome(), this.getQuantidadeFuncionarios(), this.getSalarioBaseFuncionario(),
                this.gastosComSalario(), this.getEndereco(),
                this.getDataFundacao(), this.getEstoqueProdutos().length, this.tamanhoDaLoja());
    }
}
