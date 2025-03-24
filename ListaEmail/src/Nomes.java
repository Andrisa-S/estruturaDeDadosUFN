
import java.util.Scanner;
import java.util.Set;

public class Nomes {
    String nomeCompleto;
    Scanner teclado = new Scanner(System.in);
    String vetorNome[];
    String email;

    public String gerarEmail(Set<String> emailsExistentes) {
        System.out.println("Nome completo: ");
        nomeCompleto = teclado.nextLine();
        nomeCompleto = nomeCompleto.toUpperCase();
        vetorNome = nomeCompleto.split(" ");

        // Gera o email base
        String emailBase = vetorNome[0] + "." + vetorNome[vetorNome.length - 1] + "@ufn.edu.br";
        emailBase = emailBase.toLowerCase();

        // Adiciona números sequenciais em caso de repetição
        email = emailBase;
        int contador = 1;
        while (emailsExistentes.contains(email)) {
            email = emailBase.replace("@ufn.edu.br", "") + contador + "@ufn.edu.br";
            contador++;
        }

        // Adiciona o e-mail único ao conjunto
        emailsExistentes.add(email);
        System.out.println("E-mail gerado: " + email + "\n");
        return email;
    }

}
