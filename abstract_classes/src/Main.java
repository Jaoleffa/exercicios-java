import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccounts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Não pode ser instanciado Account acc1 = new Account(1001, "João", 2000.00);

        List<Account> list = new ArrayList<>();

        list.add(new SavingAccounts(1002,"Alex", 2000, 0.01));
        list.add(new BusinessAccount(1005,"Topperson", 980, 9000));
        list.add(new SavingAccounts(1004,"João", 2000, 0.03));
        list.add(new BusinessAccount(4587,"ToperTopers", 230, 1000));

        double sum = 0.0;

        for(Account acc: list) {
            sum += acc.getBalance();
        }

        for(Account acc: list) {
            acc.loan();
        }

        System.out.println(sum + "\n");

        for (Account acc : list) {
            acc.deposit(500);
        }

        for(Account acc: list) {
            System.out.println(acc.getBalance());
        }
    }
}