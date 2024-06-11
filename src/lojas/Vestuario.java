package src.lojas;

import src.suporte.*;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, boolean produtosImportados, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    };

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.getProdutosImportados();
    }

    @Override
    public String toString() {
        return String.format("%s\nProdutos Importados: %s", super.toString(), this.getProdutosImportados());
    }
}
