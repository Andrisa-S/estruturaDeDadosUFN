import java.util.ArrayList;
import java.util.Random;

public class glicemia {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Popula lista com números aleatórios entre 50 e 240
        ArrayList<Integer> lista = new ArrayList<>();

        Random gerador = new Random();
        int tamanho = 15;;
        int numero;

        //Inserir
        for(int i = 0; i < tamanho; i++){
            numero = gerador.nextInt(50, 240);
            if(!lista.contains(numero)){
                lista.add(numero);
            }
            
        }

        //Ordenar
        lista.sort(null);

        //Exibir a lista
        for (Integer i: lista){
            System.out.println(i);
        }

        //Média
        int soma = 0;

        for (int i = 0; i < lista.size(); i++){
            soma += lista.get(i);
        }
        int media = soma/lista.size();

        System.out.println("\nMédia = " + media);

        //Mediana
        int mediana = 0;
        int tamanhoLista = lista.size();

        if (tamanhoLista % 2 == 1) {
            // Se o tamanho da lista for ímpar, a mediana é o valor do meio
            mediana = lista.get(tamanhoLista / 2);
        } else {
            // Se o tamanho da lista for par, a mediana é a média dos dois valores centrais
            mediana = (lista.get(tamanhoLista / 2 - 1) + lista.get(tamanhoLista / 2)) / 2;
        }
        System.out.println("\nMediana = " + mediana);

        //Moda
        int moda = lista.get(0);  // Inicializa moda com o primeiro número da lista
        int maxFrequencia = 1; // Frequência mínima é 1, pois pelo menos um número aparece

        int frequenciaAtual = 1;
        boolean tModa = false;

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).equals(lista.get(i - 1))) {
                // Se o número atual for igual ao anterior, incrementa a frequência
                frequenciaAtual++;
            } else {
                // Se o número atual for diferente, verifica se a frequência anterior é a maior
                if (frequenciaAtual > maxFrequencia) {
                    maxFrequencia = frequenciaAtual;
                    moda = lista.get(i - 1);
                }
                frequenciaAtual = 1;
            }
        }
        
        // Verifica a última sequência de números (pois o loop termina antes de comparar o último número)
        if (frequenciaAtual > maxFrequencia) {
            moda = lista.get(lista.size() - 1);
            tModa = true;
        }

        if (tModa) {
            System.out.println("\nModa = " + moda);
        } else {
            System.out.println("\nNão há moda!");
        }
    }
}