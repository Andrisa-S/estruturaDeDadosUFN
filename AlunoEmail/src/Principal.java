import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        Aluno tmp;
        String nome;
        int matricula = 1;
        String opcao;

        while (true) {
            System.out.println("\nDigite nome:");
            nome = teclado.nextLine().toUpperCase();
            tmp = new Aluno(matricula, nome); // Use 'new' to create an instance of Aluno

            if (alunos.contains(tmp)) {
                System.out.println("Aluno com este email já cadastrado!");
                System.gc();
            } else {
                alunos.add(tmp);
                System.out.println("Aluno cadastrado com a matricula: " + matricula);
                System.out.println("E com o email: " + tmp.email);
                matricula++;
            }
            System.out.println("\nContinuar? \n[1 - Sim; Outra tecla - Não]");
            opcao = teclado.nextLine();
            if (!opcao.equals("1")) {
                break;
            }

            alunos.sort((aluno1, aluno2) -> {
                return aluno1.nome.compareTo(aluno2.nome);
            });

            System.out.println("Relação de alunos cadastrados:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.toString());
            }
        }

        teclado.close();
    }
}