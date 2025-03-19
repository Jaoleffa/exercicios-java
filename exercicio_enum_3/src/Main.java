import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do cliente: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birthday date: ");
        Date date = sdf.parse(sc.nextLine());

        Client cliente = new Client(name, email, date);

        System.out.println();
        System.out.println("Entre os dados do pedido: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        System.out.print("Quantos itens terão no pedido: ");
        int n = sc.nextInt();

        Order ordem = new Order(new Date(), status, cliente);

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Digite os dados do item Nº" + (i + 1));
            System.out.print("\nNome do produto: ");
            String produtoName = sc.nextLine();
            System.out.print("Preço do produto: ");
            Double produtoPreco = sc.nextDouble();
            System.out.print("Digite a quantia desse produto: ");
            Integer quantiaProduto = sc.nextInt();
            Product produto = new Product(produtoName, produtoPreco);
            OrderItem it = new OrderItem(quantiaProduto, produtoPreco, produto);
            ordem.addItem(it);
        }



        System.out.println("\nOrder summary: \n" + ordem);


    }
}