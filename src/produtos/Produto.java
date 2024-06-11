package src.produtos;

import src.suporte.*;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

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

    @Override
    public String toString() {
        return String.format("Nome: %s\nPreço: %.2f\nData de validade: %s\nVencido: %b", this.getNome(),
                this.getPreco(), this.getDataValidade(), this.estaVencido(this.getDataValidade()));
    }
}
