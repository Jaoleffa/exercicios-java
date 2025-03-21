import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos quer cadastrar: ");
        int n = sc.nextInt();
        List<Product> produtos = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            System.out.println("Produto número #" + (i + 1));
            System.out.println("Common, used or imported: (c/u/i)");
            char escolha = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            if(escolha == 'c') {
                Product produto = new Product(nome,preco);
                produtos.add(produto);
            } else if (escolha == 'i') {
                System.out.println("Digite o customs fee: ");
                Double customFee = sc.nextDouble();
                Product produto = new ImportedProduct(nome, preco, customFee);
                produtos.add(produto);
            } else if (escolha == 'u'){
                System.out.println("Digite a data que o produto foi feito: (dd/mm/yyyy)");
                sc.nextLine();
                Date data = sdf.parse(sc.nextLine());
                Product produto = new UsedProduct(nome, preco, data);
                produtos.add(produto);
            }
        }

        for(Product produto : produtos) {
            System.out.println(produto.priceTag());
        }
    }
}