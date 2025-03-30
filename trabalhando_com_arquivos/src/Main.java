import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Base teste para ler um arquivo e imprimir no log
        /*
        File file = new File("C:\\Users\\sklld\\Downloads\\in.txt"); //Criando arquivo
        Scanner sc = null; //Instanciando scanner

        //Base teste para ler um arquivo e imprimir no log
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }

        }

         */


        //Base usando file e buffered readers para ler de maneira otimizada
        /*
        String path = "C:\\Users\\sklld\\Downloads\\ini.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e ) {
            System.out.println("Error: " + e.getMessage() );
        } finally {
            try {
                if (br!=null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch ( IOException e ) {
                e.printStackTrace();
            }

        }

         */


        //Fazendo leitura de maneira que o objeto já se inicializa e garante sua finalização ao final do código
        /*
        String path = "C:\\Users\\sklld\\Downloads\\ini.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e ) {
            System.out.println("Error: " + e.getMessage());
        }

         */


        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\sklld\\Downloads\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //Parâmetro true apenas acrescente o texto novo ao arquivo
            for(String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}