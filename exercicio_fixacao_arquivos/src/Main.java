import entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo: ");
        String caminhoArquivo = sc.nextLine();

        File file = new File(caminhoArquivo);

        List<Produto> produtos = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();

            while (line != null) {
                String[] lines = line.split(";");
                Produto produto = new Produto(lines[0], Double.parseDouble(lines[1]), Integer.parseInt(lines[2]));
                produtos.add(produto);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String fileDiretorio = file.getParent();
        boolean success = new File(fileDiretorio + "/out").mkdir();
        String novoArquivo = fileDiretorio + "/out/summary.csv";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(novoArquivo))) {
            for(Produto produto : produtos) {
                bw.write(produto.getName() + ";" + String.format("%.2f", produto.precoTotal()));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}