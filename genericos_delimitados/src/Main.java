import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\sklld\\Downloads\\ini.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha = br.readLine();
            while (linha != null) {
                String [] fields = linha.split(",");
                Product produto = new Product(fields[0], Double.parseDouble(fields[1]));
                list.add(produto);
                linha = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}