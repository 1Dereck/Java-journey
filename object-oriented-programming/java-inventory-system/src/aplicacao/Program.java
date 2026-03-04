package aplicacao;

import entidades.Produtos;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        Produtos produtos = new Produtos();

        System.out.println("Olá! Informe o nome, preço e quantidade em estoque do produto...");
        System.out.print("Nome: ");
        produtos.nome = sc.nextLine();
        System.out.print("Preço: ");
        produtos.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produtos.quantidade = sc.nextInt();

        System.out.println(produtos.nome);
        System.out.println(produtos.preco);
        System.out.println(produtos.quantidade);


        sc.close();
    }
}