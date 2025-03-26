import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos contribuintes queres cadastrar: ");
        int n = sc.nextInt();
        List<Contribuinte> contribuintes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Dado do contribuinte N #" + (i + 1));
            System.out.println("Pessoa física ou Pessoa jurídica: (i/c)");
            char escolha = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Digite o nome: ");
            String name = sc.nextLine();
            System.out.println("Digite a renda anual: ");
            double rendaAnual = sc.nextDouble();
            if(escolha == 'i') {
                System.out.println("Digite o gasto em saúde: ");
                double gastoSaude = sc.nextDouble();
                Contribuinte contribuinte = new PessoaFisica(name, rendaAnual, gastoSaude);
                contribuintes.add(contribuinte);
            } else if (escolha == 'c') {
                System.out.println("Digite a quantidade de funcionários na empresa: ");
                int quantidade = sc.nextInt();
                Contribuinte contribuinte = new PessoaJuridica(name, rendaAnual, quantidade);
                contribuintes.add(contribuinte);
            }
        }

        double todosImpostos = 0.0;

        System.out.println("Impostos pagos: ");
        for (Contribuinte contribuinte : contribuintes) {
            double tax = contribuinte.calculaImposto();
            System.out.print(contribuinte.getNome() + ": $" + String.format("%.2f",tax) + "\n");
            todosImpostos += tax;
            System.out.println(todosImpostos);
        }

        System.out.println("\nSoma total dos impostos: $" +  todosImpostos);



        /*
        Contribuinte teste1 = new PessoaFisica("João", 50000.00, 2000.00);
        System.out.println(teste1.calculaImposto());


        Contribuinte teste2 = new PessoaJuridica("RBS", 400000.00, 25);
        System.out.printf("%.2f", teste2.calculaImposto());

         */
        sc.close();
    }
}