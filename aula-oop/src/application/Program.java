package application;

import entities.Product;

import entities.BancoAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantityAdicional = sc.nextInt();
        product.addProducts(quantityAdicional);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantityAdicional = sc.nextInt();
        product.removeProducts(quantityAdicional);
        System.out.println();
        System.out.println("Updated data: " + product);

         */
        BancoAccount conta1;

        System.out.println("-Digite os dados da conta-");
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o nome do titular da conta:");
        String titularConta = sc.next();

        System.out.println("Tem um depósito inicial ? y/n");
        char escolha = sc.next().charAt(0);
        if (escolha == 'y') {
            System.out.println("Digite um valor que deseja depositar para a conta: ");
            double valor = sc.nextDouble();
            conta1 = new BancoAccount(numeroConta, titularConta, valor);
        } else {
            conta1 = new BancoAccount(numeroConta, titularConta);
        }

        System.out.println(conta1);

        System.out.println("\nDigite o valor que quer depositar: ");
        double valor = sc.nextDouble();
        conta1.adicionarValor(valor);
        System.out.println("Valor da conta atualizado: R$" + conta1.getValorConta());

        System.out.println("\nDigite o valor que quer retirar: ");
        valor = sc.nextDouble();
        conta1.realizarSaque(valor);
        System.out.println("Valor da conta atualizado: R$" + conta1.getValorConta());
        sc.close();
    }
}
