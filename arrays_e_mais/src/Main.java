import entities.Employee;
import entities.Pessoa;
import entities.Produtos;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        /*
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

         */

        /*
        String[] vect = new String[] {"Maria", "João", "Alex"};

        for(String nome : vect) {
            System.out.println(nome);
        }

         */

        //Programa de ler arraylist de empregados
        /* Programa de ler arraylist de empregados
        List<Employee> funcionarios = new ArrayList<>();

        System.out.println("Quantos empregados vão ser registrados: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(funcionarios, id)) {
                System.out.println("ID já existente, tente novamente ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            Employee emp = new Employee(id, name, salario);
            funcionarios.add(emp);
        }


        System.out.println("Digite o empregado que você quer mudar o salário: ");
        int novoId = sc.nextInt();
        Employee emp = funcionarios.stream().filter(x -> x.getId() == novoId).findFirst().orElse(null); //Procura se o novo id é igual id do funcionario
        if(emp == null) {
            System.out.println("Esse ID não existe!");
        } else {
            System.out.println("Digite a porcentagem de aumento: ");
            double porcentagem = sc.nextDouble();
            emp.increaseSalario(porcentagem);
            System.out.println("Salário atualizado: R$" + emp.getSalary());
        }

        System.out.println("\nLista de empregados: ");
        for (Employee emp1 : funcionarios) {
            System.out.println(emp1);
        }

         */

        /*

        list.add("Maria");
        list.add("Bob");
        list.add("João");
        list.add("Alexs");
        list.add("Atomus");
        list.add(2, "Toperson");

        System.out.println(list.size());

        list.remove("Maria");

        for(String nome: list) {
            System.out.println(nome);
        }

        list.removeIf(x -> x.charAt(0) == 'T');

        System.out.println("-------------------------------------------------");
        for(String nome: list) {
            System.out.println(nome);
        }

        System.out.println("-------------------------------------------------");

        System.out.println(list.indexOf("João"));

        System.out.println("-------------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String nome: result) {
            System.out.println(nome);
        }

        System.out.println("-------------------------------------------------");

        String name = list.stream().filter(x->x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

         */

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

        //Matrizes
        System.out.println("Digite o tamanho que você quer sua matriz: ");
        System.out.print("Linhas: ");
        int N = sc.nextInt();
        System.out.print("Colunas: ");
        int M = sc.nextInt();
        int[][] matriz = new int[N][M];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Linha: " + (i) + " Coluna: " + (j));
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\nDigite um número inteiro: ");
        int numeroX = sc.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == numeroX) {
                    System.out.println("Posição: " + i + "," + j + ":" );
                    if (j > 0) {
                        System.out.println("Left: " + (matriz[i][j - 1]));
                    }
                    if(i > 0) {
                        System.out.println("Up: " + (matriz[i - 1][j]));
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + (matriz[i][j + 1]));
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + (matriz[i + 1][j]));
                    }

                }
            }
        }

        /*
        System.out.print("Qual o tamanho da sua matriz: ");
        int N = sc.nextInt();
        int[][] matriz = new int[N][N]; //Criando matriz bidimensional
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o valor que quer adicionar na Linha " + (i) + " e na Coluna " + (j));
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }


        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("\n\nQuantidade de números negativos: " + count );

        //Imprimindo todos os elementos
        /*
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }

         */

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp5 = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp5 != null;
    }
}