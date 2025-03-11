import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        String nome = "João";
        double altura = 1.86;
        double peso = 2.5;
        int idade = 19;
        String sexo = "M";

        System.out.printf("%s tem %.2f de altura, pesa %.2f, tem %d e é do sexo %s\n", nome, altura, peso, idade, sexo);

        String product1 = "Computer";
        String product2 = "Desktop";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1= 2100.0;
        double price2= 650.50;
        double measure = 53.234567;

        System.out.println("Products: " + product1 + ", " + product2);
        System.out.printf("%s, which price is $%.2f\n", product1, price1);
        System.out.printf("%s, which price is $%.2f\n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);

        System.out.printf("Measured with eight decimal places: %.8f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);

         */
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite um char: ");
        char caractere = sc.next().charAt(0)
         */


        /*
        String s1,s2,s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

         */
        /*
        double pi = 3.14159;

        System.out.println("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        double soma = valor1 + valor2;
        System.out.println("A soma dos valores é: " + soma);

        System.out.println("Digite o valor do raio do seu círculo: ");
        double raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);

         */
        /*
        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();
        System.out.println("Digite o quarto valor: ");
        int valor4 = sc.nextInt();

        int difProduto = (valor1 * valor2) - (valor3 * valor4);
        System.out.println("A diferença de produtos é: " + difProduto);

         */

        /*
        System.out.println("Digite o seu número de funcionário: ");
        int funcionario = sc.nextInt();

        System.out.println("Digite quantas horas você trabalhou: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Quanto você recebe por hora: ");
        double horaRecebe = sc.nextDouble();

        double salarioFuncionario = horasTrabalhadas * horaRecebe;

        System.out.println("Número do funcionário: " + funcionario);
        System.out.println("Salário do funcionário: " + salarioFuncionario);

         */

        /*

        double codigoPeca = sc.nextDouble();
        double quantPeca = sc.nextDouble();
        double valorPeca = sc.nextDouble();

        double codigoPeca2 = sc.nextDouble();
        double quantPeca2 = sc.nextDouble();
        double valorPeca2 = sc.nextDouble();

        double valorTotal = (valorPeca * quantPeca) + (valorPeca2 * quantPeca2);

        System.out.println("Valor total a pagar: " + valorTotal);

         */
        /*
        System.out.println("Quantas horas ?");
        int horas = sc.nextInt();

        if (horas <12) {
            System.out.println("Bom dia");
        } else if (horas > 18 ) {
            System.out.println("Boa noite");
        } else {
            System.out.println("Boa tarde");
        }

         */

        /*
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero < 0 ) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }

         */

        /*

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 ==0 ) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número impar");
        }


         */

        /*
        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite um segundo número: ");
        int numero2 = sc.nextInt();

        if (numero2 % numero1 == 0 || numero1 % numero2 == 0) {
            System.out.println("Número é múltiplo");
        } else {
            System.out.println("Não é múltiplo");
        }

         */

        /*
        int duracaoJogo = 0;

        System.out.println("Digite um número: ");
        int horaInicial = sc.nextInt();

        System.out.println("Digite um segundo número: ");
        int horaFinal = sc.nextInt();

        if (horaInicial > horaFinal || horaInicial == horaFinal) {
            duracaoJogo = 24 - horaInicial + horaFinal;
        } else {
            duracaoJogo = horaFinal - horaInicial;
        }

        if (duracaoJogo >= 1 || duracaoJogo == 24) {
            System.out.println("O jogo durou " + Math.abs(duracaoJogo) + " hora(s)");
        } else {
            System.out.println("Jogo teve uma duração menor que 1 hora");
        }

         */


        /*
        double valorConta = 0;

        System.out.println("Digite o código do item: ");
        int codigoItem = sc.nextInt();

        System.out.println("Digite a quantidade que você comprou: ");
        int quantItem = sc.nextInt();

        if (codigoItem == 1) {
            valorConta = quantItem * 4;
        } else if (codigoItem == 2) {
            valorConta = quantItem * 4.50;
        }
        else if (codigoItem == 3) {
            valorConta = quantItem * 5;
        }
        else if (codigoItem == 4) {
            valorConta = quantItem * 2;
        }
        else if (codigoItem == 2) {
            valorConta = quantItem * 1.50;
        }

        System.out.println("Total: R$ " + valorConta);

         */

        /*
        System.out.println("Digite um valor de 0 a 100: ");
        int valor = sc.nextInt();

        if (valor <= 25 && valor >= 0) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo [25,50]");
        }
         else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo [50,75]");
        }
        else if (valor < 0 || valor > 100) {
            System.out.println("Fora de intervalo");
        } else {
            System.out.println("Intervalo [75,100]");
        }

         */

        /*
        System.out.println("Escreva um valor x: ");
        int x = sc.nextInt();

        System.out.println("Escreva um valor y:");
        int y = sc.nextInt();

        if(x > 0 && y > 0) {
            System.out.println("Quadrante Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante Q3");
        } else {
            System.out.println("Quadrante Origem");
        }

         */

        /*
        double taxaTotal = 0;
        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();


        if(salario <= 2000) {
            System.out.println("Isento");
        } else if (salario <= 3000) {
            taxaTotal = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            taxaTotal = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else if (salario > 4500) {
            taxaTotal = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        System.out.println(taxaTotal);

         */

        /*
        double preco = 34.5;
        double desconto = preco < 20.0 ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

         */

        /*

        System.out.println("Tente adivinhar a senha de 4 digitos: ");
        double senha = sc.nextDouble();

        while (senha != 2002) {
            System.out.println("Senha Invalida, tente novamente: ");
            senha = sc.nextDouble();
        }

        System.out.println("Acesso Permitido");

         */

        /*

        System.out.println("Digite um código de combustível: (de 1 a 3 ou 4 para sair)");
        int codigoCombustivel = sc.nextInt();
        int quantAlcool = 0;
        int quantGasol = 0;
        int quantDiesel = 0;

        while (codigoCombustivel != 4) {
            if (codigoCombustivel == 1) {
                quantAlcool += 1;
                codigoCombustivel = sc.nextInt();
            }

            else if (codigoCombustivel == 2) {
                quantGasol += 1;
                codigoCombustivel = sc.nextInt();
            }

            else if (codigoCombustivel == 3) {
                quantDiesel += 1;
                codigoCombustivel = sc.nextInt();
            } else {
                System.out.println("Código inválido, digite novamente: ");
                codigoCombustivel = sc.nextInt();
            }
        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + quantAlcool);
        System.out.println("Gasolina: " + quantGasol);
        System.out.println("Diesel: " + quantDiesel);
         */

        /*

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

         */

        /*
        int N = sc.nextInt();
        int numerosDentro = 0;
        int numerosFora = 0;

        for (int i = 0; i<N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20 ) {
                numerosDentro++;
            } else {
                numerosFora++;
            }
        }

        System.out.println(numerosDentro + " in");
        System.out.println(numerosFora + " out");

         */

        /*
        int N = sc.nextInt();
        for(int i = 0; i<N; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
            System.out.printf("Média: %.1f%n", media);


        }

         */

        /*

        int N = sc.nextInt();

        for(int i = 0; i<N; i++) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            if (num2 == 0 ) {
                System.out.println("Divisão impossível");
            }

            double resultado = num1 / num2;



            System.out.println(resultado);
        }

         */

        /*

        int N = sc.nextInt();
        int soma = 0;

        for(int i = 1; i<=N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }

        }

         */


        /*
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++) {
            System.out.println(i + " " + (int)Math.pow(i,2) + " " + (int)Math.pow(i,3));
        }

         */

        /*
        String original = "WAFAWFWAasdasdasdasAWKODWAKDWA";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.substring(2); //Limita a string a começar à partir do terceiro caractere

         */

        /*
        String s = "potato apple lemon outra palavra mais uma caralho fodaaaaaaaaa";

        String[] vect = s.split(" ");
        for(int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

         */

        int higher = max(1,6,3);
        showResult(higher);



        sc.close();



    }
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int number) {
        System.out.println("Higher = " + number);
    }
}