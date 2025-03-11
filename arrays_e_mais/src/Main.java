import entities.Pessoa;
import entities.Produtos;

import java.util.Arrays;
import java.util.Scanner;

import entities.Rent;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        int N = sc.nextInt();
        double[] posicoes = new double[N];

        for(int i =0; i<3; i++) {
            posicoes[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i<N; i++) {
            sum += posicoes[i];
        }
        double avg = sum/N;

        System.out.println(avg);

         */

        /*
        int N = sc.nextInt();
        Produtos[] vetor = new Produtos[N];

        for(int i = 0; i<vetor.length; i++) {
            System.out.println("Digite o nome do produto: ");
            String name = sc.next();
            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble();
            vetor[i] = new Produtos(name, price);
        }

        double sum = 0;

        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i].getPrice();
        }

        double avg = sum / vetor.length;

        System.out.println("\n" + avg);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("\n" + vetor[i]);
        }

         */

        /*
        System.out.println("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();
        int[] numeros = new int[N];
        for(int i = 0; i<numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

         */

        /*
        int N = sc.nextInt();
        double[] vetor = new double[N];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        System.out.println("\nSoma = " + soma);
        System.out.println("Média = " + media);

         */

        /*
        int N = sc.nextInt();
        String[] pessoas = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Dados da " +(i+1) + " pessoa");
            System.out.println("Digite o nome da pessoa: ");
            pessoas[i] = sc.next();
            System.out.println("Digite a idade da pessoa: ");
            idades[i] = sc.nextInt();
            System.out.println("Digite a altura da pessoa: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAltura = 0;
        for (int i = 0; i < alturas.length; i++) {
            somaAltura += alturas[i];
        }
        double mediaAltura = somaAltura/alturas.length;

        System.out.println("\nAltura média: " + mediaAltura);
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                count++;
            }
        }

        int porcentagemMenores = (count * 100) / idades.length;

        System.out.println("Porcentagem de pessoas menores 16 anos: " + porcentagemMenores + "%");
        for (int i = 0; i < idades.length; i++) {
            if(idades[i] < 16) {
                System.out.println(pessoas[i]);
            }
        }

         */

        /*
        System.out.print("Quantos números você vai digitar: ");
        int N = sc.nextInt();
        int[] numeros = new int[N];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("Números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                count ++;
            }
        }

        System.out.println("\n\nQuantidade de números pares = " + count);

         */

        /*
        System.out.print("Quantos números você vai digitar: ");
        int N = sc.nextInt();
        double[] numeros = new double[N];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }


        //double maiorValor = Arrays.stream(numeros).max().orElse(Double.NaN);

        double maiorValor = numeros[0];
        int posicaoMaior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Posição do maior valor: " + posicaoMaior);

         */

        Rent[] quartos = new Rent[10];

        System.out.println("Quantos quartos você quer alugar: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Rent #" + i + ":");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            quartos[roomNumber] = new Rent(name, email);
        }

        System.out.println("\n-Busy rooms-");
        for (int i = 0; i < 10; i++) {
            if(quartos[i] != null) {
                System.out.println("#" + i + ": " + quartos[i]);
            }
        }

        /*
        Pessoa[] pessoas = new Pessoa[N];
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite o nome da pessoa: ");
            String name = sc.next();
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite a altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(name,idade,altura);
        }
        double somaAltura = 0;
        for (int i = 0; i < pessoas.length; i++) {
            somaAltura += pessoas[i].getAltura();
        }
        double mediaAltura = somaAltura / pessoas.length;

        String pessoasMenores16Anos = "";

        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
                pessoasMenores16Anos += pessoas[i].getNome();
            }
        }

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].getIdade().
        }

         */

        sc.close();
    }
}