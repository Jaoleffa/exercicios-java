import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccounts;

public class Main {
    public static void main(String[] args) {
        //Heranças
        /*
        Account conta1 = new Account(1001, "Alex", 0);
        BusinessAccount contaBusinees = new BusinessAccount(1002, "João", 0.0, 500);
        SavingAccounts contaSavings = new SavingAccounts(1003, "Topperson", 0.0, 0.01);

        //Upcasting
        Account acc1 = contaBusinees; //Aqui funciona pois uma conta empresarial é uma conta
        Account acc2 = new BusinessAccount(1004, "Topsd", 0.0, 1000);
        Account acc3 = new SavingAccounts(1005, "Alexis", 0, 0.02); //Conta savings é uma conta

        //Downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2; //Aqui é imcompatível, então precisa fazer um casting manual
        //BusinessAccount acc5 = (BusinessAccount) acc3; //Não é permitida
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3; //Aqui verifica como acc3 é uma instancia de savings não realiza
            acc5.loan(200);
            System.out.println("Loan!");
        };
        if (acc2 instanceof BusinessAccount) {
            BusinessAccount acc6 = (BusinessAccount) acc2; //Aqui funcionou pois acc2 é instancia da businessaccount
            acc6.loan(200);
            System.out.println("Loan!");
        };
        if(acc3 instanceof SavingAccounts) {
            SavingAccounts acc5 = (SavingAccounts)acc3; //Realiza esse IF
            acc5.updateBalance();
            System.out.println("Update!");
        };

         */

        //Teste de sobreposição
        /*
        Account acc1 = new Account(1001, "João", 500);
        Account scc1 = new SavingAccounts(1001, "Jp", 500, 0.01);
        Account bcc1 = new BusinessAccount(1001,"Leffa", 500.00, 1000);

        acc1.withdraw(50);
        scc1.withdraw(50);
        bcc1.withdraw(50);
        System.out.println(acc1.getBalance());
        System.out.println(scc1.getBalance());
        System.out.println(bcc1.getBalance());

         */




    }
}