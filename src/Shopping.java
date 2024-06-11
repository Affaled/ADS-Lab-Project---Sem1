package src;

import java.text.Normalizer;

import src.lojas.*;
import src.suporte.*;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return this.lojas;
    }

    private String normalize(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .toLowerCase();
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < this.getLojas().length; i++) {
            if (this.getLojas()[i] == null) {
                this.getLojas()[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < this.getLojas().length; i++) {
            if (this.getLojas()[i] != null && this.getLojas()[i].getNome().equals(nomeLoja)) {
                this.getLojas()[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean validaTipo(String tipo) {
        String tipoNormalizado = normalize(tipo);

        if (tipoNormalizado.equals("alimentacao") || tipoNormalizado
                .equals("bijuteria")
                || tipoNormalizado
                        .equals("cosmetico")
                || tipoNormalizado
                        .equals("informatica")
                || tipoNormalizado.equals("vestuario")) {
            return true;
        } else {
            return false;
        }
    }

    public int quantidadeLojasPorTipo(String tipo) {
        String tipoNormalizado = normalize(tipo);
        int quantidade = 0;

        if (!validaTipo(tipo)) {
            return -1;
        } else {
            for (Loja loja : lojas) {
                if (loja != null && normalize(loja.getClass().getSimpleName()).equals(tipoNormalizado)) {
                    quantidade++;
                }
            }
            return quantidade;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCaro = null;
        double maiorValorSeguro = 0.0;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;
                if (lojaInformatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCaro = lojaInformatica;
                }
            }
        }
        return lojaMaisCaro;
    }
}
