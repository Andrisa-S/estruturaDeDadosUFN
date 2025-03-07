import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Lista{
    public static void main(String[] args) {
        //Popula lista com n números aleatórios inteiros
        ArrayList<Integer> lista = new ArrayList<>();

        Random gerador = new Random();
        int tamanho = gerador.nextInt(10, 15);
        int numero;

        //Inserir
        for(int i = 0; i < tamanho; i++){
            numero = gerador.nextInt(50);
            if(!lista.contains(numero)){
                lista.add(numero);
            }
            
        }

        //Ordenar
        lista.sort(null);

        //Exibir
        /* System.out.println("Exibindo por índices...");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        } */

        System.out.println("Exibindo por objetos...");
        System.out.println("Total de "+ lista.size());
        for(Integer i: lista){
            System.out.println(i);
        }

        /* System.out.println("Lista de inteiros usando Iterator...");
        Iterator<Integer> iterator = lista.iterator();
        while(iterator.hasNext()){
            numero = iterator.next();
            System.out.println(numero);
        } */

        if (lista.remove((Integer)15)){
            System.out.println("Número localizado e excluído");
        } else {
            System.out.println("Número não localizado");
        }

        //Percorrer via índice
        for(int i = 0; i < lista.size(); i++){
            if (lista.get(i) % 2 != 0){
                lista.set(i, -1);
            }
        }

        System.out.println("Exibindo por objetos...");
        System.out.println("Total de "+ lista.size());
        for(Integer i: lista){
            System.out.println(i);
        }
    }
}