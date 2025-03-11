package application;

import entities.Produto;

import entities.Triangle;

import entities.Funcionario;

import entities.Rectangle;

import util.Calculator;

import util.CurrencyConverter;

import entities.Aluno;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

        Produto produto1 = new Produto();

        System.out.println("-Digite os dados do seu produto- ");
        System.out.print("Nome:");
        produto1.name = sc.next();

        System.out.print("Price: ");
        produto1.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        produto1.stock = sc.nextInt();
        System.out.println(produto1);

        System.out.println("Quantos produtos você quer adicionar no estoque: ");
        int quantity = sc.nextInt();
        produto1.adicionarEstoque(quantity);
        System.out.println("Dados atualizados: \n" + produto1);

        System.out.println("Quantos produtos você quer remover no estoque: ");
        quantity = sc.nextInt();
        produto1.removerEstoque(quantity);
        System.out.println("Dados atualizados: \n" + produto1);

         */

        /*
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calculaArea();
        double areaY = y.calculaArea();

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle Y area: " + areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

         */

        /*
        Rectangle retangulo1 = new Rectangle();

        System.out.print("Digite a base do retangulo: ");
        retangulo1.width = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        retangulo1.heigth = sc.nextDouble();

        System.out.println(retangulo1.calculaArea());
        System.out.println(retangulo1.calculaDiagonal());
        System.out.println(retangulo1.calculaPerimetro());

         */

        /*

        Funcionario funcionario1 = new Funcionario();

        System.out.print("Digite o nome do funcionário: ");
        funcionario1.nome = sc.next();

        System.out.print("Digite o salário bruto do funcionario: ");
        funcionario1.salarioBruto = sc.nextDouble();

        System.out.print("Digite a quantia de descontos totais do funcionario: ");
        funcionario1.Impostos = sc.nextDouble();

        System.out.println(funcionario1);

         */

        /*
        Aluno aluno1 = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno1.name = sc.next();

        System.out.println("Digite a nota do primeiro semestre: ");
        aluno1.notaSemestre1 = sc.nextDouble();
        System.out.println("Digite a nota do segundo semestre: ");
        aluno1.notaSemestre2 = sc.nextDouble();
        System.out.println("Digite a nota do terceiro semestre: ");
        aluno1.notaSemestre3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f", aluno1.notaFinal());
        if(aluno1.notaFinal() >= 60) {
            System.out.println("\nPASS");
        } else {
            System.out.println("\nFAILED");
            if (aluno1.missingPoints() > 0) {
                System.out.println("Nota que faltou para aprovação: " + aluno1.missingPoints());
            }
        }

         */

        /*

        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double circu = Calculator.circumference(raio);
        double volume = Calculator.volume(raio);

        System.out.println(circu);
        System.out.println(volume);

         */

        System.out.println("Digite o valor do dollar: ");
        double valor = sc.nextDouble();
        System.out.println("Digite quantos dolares você vai comprar: ");
        double quantidade = sc.nextDouble();

        double valorEmReais = CurrencyConverter.dollarConverter(valor, quantidade);
        System.out.println(valorEmReais);

        sc.close();
    }
}
