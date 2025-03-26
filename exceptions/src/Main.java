import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exceções com try catch basico
        /*
        try {

           String[] vect = sc.nextLine().split(" ");
           int n = sc.nextInt();
           System.out.println(vect[n]);

       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Invalid Position");
        }

       catch (InputMismatchException e) {
           System.out.println("Input erroraaaa");
       }

        System.out.println("End of program");

         */


        /*
        method2();

         */

        System.out.println("End of program");


    }
    //Métodos para testar stacktrace
    /*
    public static void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Método start");
        try {


            String[] vect = sc.nextLine().split(" ");
            int n = sc.nextInt();
            System.out.println(vect[n]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
        }

        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("Método end");

        sc.close();
    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Método2 start");
        method();
        System.out.println("Método2 end");

        sc.close();
    }

     */
}