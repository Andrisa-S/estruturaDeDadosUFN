import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno{
    int matricula;
    String nome;
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

}

public class ListaObjeto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        int matricula;
        String nome;
        Aluno tmp;
        
        for(int i = 0; i < 3; i++){
            System.out.println("Matrícula: ");
            matricula = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Nome: ");
            nome = teclado.nextLine();
            tmp = new Aluno(matricula, nome);
            alunos.add(tmp);

        }

        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
}