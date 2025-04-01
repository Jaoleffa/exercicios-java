import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\Users\\sklld\\Downloads\\ini.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionario = br.readLine();
            while (funcionario != null) {
                String[] fields = funcionario.split(",");
                list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
                funcionario = br.readLine();
            }
            Collections.sort(list); //Ordena uma coleção
            for(Funcionario fun : list) {
                System.out.println(fun.getName() + "," + fun.getSalario());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}