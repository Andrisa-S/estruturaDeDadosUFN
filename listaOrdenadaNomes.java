import java.util.ArrayList;
import java.util.Scanner;

public class ExercícioED {
    public static void main(String[] args) {

        //Criação de lista
        ArrayList<String> lista = new ArrayList<>();

        int tamanho = 5;
        String nome;

        //Ler teclado
        Scanner teclado = new Scanner(System.in);

        //Inserir
        for(int i = 0; i < tamanho; i++){
            System.out.println("Insira um nome: ");
            nome = teclado.nextLine();
            if(!lista.contains(nome)){
                lista.add(nome);
            }
            
        }

        //Ordenar
        lista.sort(null);

        //Exibir
        System.out.println("\nLista de nomes ordenada:");
        for(String nomeNaLista : lista) { // Loop para exibir todos os nomes da lista
            System.out.println(nomeNaLista);
        }

        //Pesquise e exclua um nome
        System.out.println("\nExclua um nome: ");
        nome = teclado.nextLine();

        if(lista.remove((String)nome)){
            System.out.println("\nNome localizado e excluído!");
        } else {
            System.out.println("\nNome não localizado!");
        }

        //Lista atualizada
        System.out.println("\nLista de nomes atualizada:");
        for(String nomeNaLista : lista) {
            System.out.println(nomeNaLista);
        }

        teclado.close();
    }
}
