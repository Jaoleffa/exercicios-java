import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos figuras você quer criar: ");
        int n = sc.nextInt();
        List<Shape> figuras = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da figura #" + (i + 1));
            System.out.println("Círculo ou retangulo: (r/c)");
            char escolha = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Digite a cor: (BLACK/BLUE/RED)");
            Color cor = Color.valueOf(sc.nextLine());
            if(escolha == 'r') {
                System.out.println("Digite a largura: ");
                double largura = sc.nextDouble();
                System.out.println("Digite a altura: ");
                double altura = sc.nextDouble();
                Shape figura = new Rectangle(largura, altura, cor);
                figuras.add(figura);
            }
            else if (escolha == 'c') {
                System.out.println("Digite o raio: ");
                double raio = sc.nextDouble();
                Shape figura = new Circle(cor, raio);
                figuras.add(figura);
            }
        }

        System.out.println("Areas das figuras: ");
        for(Shape figura : figuras) {
            System.out.printf("Área: %.2f \n", figura.area());
            System.out.println("Cores: " + figura.getColor() + "\n");
        }




        sc.close();
    }
}