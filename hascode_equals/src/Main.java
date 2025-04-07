import entities.Client;

public class Main {
    public static void main(String[] args) {
        //Teste base para hashcode e equals
        /*
        String a = "Maria";
        String b = "Maria";

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(a.hashCode() == b.hashCode());

         */

        //Hashcode e equals de objetos personalizados
        Client c1 = new Client("João", "joaoapolinario@gmail.com");
        Client c2 = new Client("João", "top@gmail.com");

        System.out.println(c1.equals(c2));
    }
}