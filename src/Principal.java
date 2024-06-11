package src;

import java.util.Scanner;
import src.lojas.*;
import src.produtos.*;
import src.suporte.*;

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
                    System.out.println("Digite o salário base de cada funcionário:");
                    double salarioBaseFuncionario = scanner.nextDouble();
                    System.out.println(
                            "Digite o endereço da loja (formato: numero, nome da rua, complemento, cidade, estado, país, CEP):");
                    String numero = scanner.nextLine();
                    String nomeRua = scanner.nextLine();
                    String complemento = scanner.nextLine();
                    String cidade = scanner.nextLine();
                    String estado = scanner.nextLine();
                    String pais = scanner.nextLine();
                    String cep = scanner.nextLine();
                    Endereco enderecoLoja = new Endereco(numero, nomeRua, complemento, cidade, estado, pais, cep);
                    System.out.println("Digite a data de fundação da loja (formato: dd mm aaaa):");
                    int diaFundacao = scanner.nextInt();
                    int mesFundacao = scanner.nextInt();
                    int anoFundacao = scanner.nextInt();
                    Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);
                    System.out.println("Digite a o tamanho do estoque em produtos:");
                    int estoqueProdutos = scanner.nextInt();
                    loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja,
                            dataFundacao, estoqueProdutos);
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