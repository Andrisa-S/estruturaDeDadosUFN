import java.util.ArrayList;

public class exercicioDisciplina {

    public static void main(String[] args) {
        ArrayList<String> estruturaDados = new ArrayList<>();
        ArrayList<String> comunicacaoDados = new ArrayList<>();
        ArrayList<String> bancoDados = new ArrayList<>();
        ArrayList<ArrayList> cienciaComputacao = new ArrayList<>();

        estruturaDados.add("Andrisa");
        estruturaDados.add("Matheus");
        estruturaDados.add("Gabriel");
        estruturaDados.add("Alexandre");
        estruturaDados.sort(null);
        cienciaComputacao.add(estruturaDados);

        comunicacaoDados.add("Andrisa");
        comunicacaoDados.add("Matheus");
        comunicacaoDados.add("João");
        comunicacaoDados.add("Gustavo");
        comunicacaoDados.sort(null);
        cienciaComputacao.add(comunicacaoDados);

        bancoDados.add("Andrisa");
        bancoDados.add("Gabriel");
        bancoDados.add("Alexandre");
        bancoDados.add("Gustavo");
        bancoDados.sort(null);
        cienciaComputacao.add(bancoDados);

        System.out.println("Lista Ciência da Computação:\n");
        for(ArrayList lista : cienciaComputacao){
            System.out.println(lista);
        }

        System.out.println("\nLista alunos das disciplinas:\n");
        ArrayList<String> nomesAvaliados = new ArrayList<>();
        String nomeTmp;
        int contador;
        for(ArrayList lista : cienciaComputacao){
            for(Object aluno : lista){
                nomeTmp = aluno.toString();
                if(!nomesAvaliados.contains(nomeTmp)){
                    nomesAvaliados.add(nomeTmp);
                    contador = 0;
                    for(ArrayList d : cienciaComputacao){
                        for(Object a : d){
                            if(nomeTmp.equals(a.toString())){
                                contador++;
                            }
                        }
                    }
                    System.out.println(nomeTmp + " aparece em " + contador + " disciplina(s)");
                }
            }
        }
    
    }
}