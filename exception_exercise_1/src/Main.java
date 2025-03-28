import models.entities.Account;
import models.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o número da conta");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome do titular: ");
            String name = sc.nextLine();
            System.out.println("Digite o saldo em conta: ");
            double balance = sc.nextDouble();
            System.out.println("Digite qual o limite de saque da conta: ");
            double withdrawLimit = sc.nextDouble();
            Account conta = new Account(number,name,balance,withdrawLimit);
            conta.withdraw(201);
        } catch (DomainException e) {
            System.out.println("Exceção de erro: " + e.getMessage());
        } catch (RuntimeException e ) {
            System.out.println("Unexpected error");
        }



    }
}