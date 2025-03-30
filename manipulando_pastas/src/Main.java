import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caminho: ");
        String diretorioPasta = sc.nextLine();

        File diretorio = new File(diretorioPasta);

        File[] diretorios = diretorio.listFiles(File::isDirectory); //Cria vetor das pastas contidos no caminho que for digitado em path
        System.out.println("Folders: ");
        for (File folder : diretorios) {
            System.out.println(folder);
        }

        File[] arquivos = diretorio.listFiles(File::isFile);//Cria vetor para exibir apenas os arquivos
        System.out.println("Files: ");
        for(File file : arquivos) {
            System.out.println(file);
        }

        System.out.println("Digite o nome da pasta que você quer criar: ");
        String subPasta = sc.nextLine();
        boolean success = new File(diretorioPasta + "\\" + subPasta).mkdir(); //Criando diretório
    }
}