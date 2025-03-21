import java.util.Scanner;

public class Nomes {

    public static void main(String[] args) {
        String nomeCompleto;
        Scanner teclado = new Scanner(System.in);
        String vetorNome[];

        do{
            System.out.println("Nome completo: ");
            nomeCompleto = teclado.nextLine();
            nomeCompleto = nomeCompleto.toUpperCase();
            vetorNome = nomeCompleto.split(" ");
        } while (vetorNome.length < 2);

        String email = vetorNome[0] + "." + vetorNome[vetorNome.length - 1] + "@ufn.edu.br";
        email = email.toLowerCase();
        System.out.println(email);
    }
}