import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Set<String> emailsGerados = new HashSet<>(); // Armazena e-mails únicos
        List<Map<String, String>> listaDados = new ArrayList<>(); // Armazena os dados dos usuários 

        for (int i = 0; i < 3; i++) {
            Nomes nome = new Nomes();
            String email = nome.gerarEmail(emailsGerados); // Gera o e-mail e retorna
            Map<String, String> dados = new HashMap<>(); //Dicionário para armazenar o nome e e-mail
            dados.put(nome.nomeCompleto, email); 
            listaDados.add(dados);
        }

        //Exibe os dados
        System.out.println("Lista de nomes e e-mails gerados:");
        for (Map<String, String> par : listaDados) {
            for (Map.Entry<String, String> entry : par.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + " | E-mail: " + entry.getValue());
            }
        }


        teclado.close();

    }
}
