import java.util.ArrayList;

public class listaLista {

    public static void main(String[] args) {
        ArrayList <Integer> lista1 = new ArrayList<>();
        ArrayList <Integer> lista2 = new ArrayList<>();
        ArrayList <Integer> lista3 = new ArrayList<>();
        ArrayList <ArrayList> listaGlicemia = new ArrayList<>();

        lista1.add(126);
        lista1.add(14);
        listaGlicemia.add(lista1);

        lista2.add(189);
        lista2.add(29);
        listaGlicemia.add(lista2);

        lista3.add(89);
        lista3.add(170);
        listaGlicemia.add(lista3);

        //listaGlicemia = [[126, 14], [189, 29], [89, 170]]

        for(ArrayList lista : listaGlicemia){
            System.out.println(lista);
        }

        //Exibindo a lista inteira da primeira posição
        System.out.println("Exibindo lista inteira primeira posição:");
        System.out.println(listaGlicemia.get(0));

        //Exibindo item a item da lista principal na primeira posição
        System.out.println("Exibindo item a item lista primeira posição");
        for(Object i : listaGlicemia.get(0)){
            System.out.println(i);
        }

        //Exibindo os pares da lista principal, analisando item a item das listas internas
        System.out.println("Exibindo os pares item a item");
        for(ArrayList lista : listaGlicemia){
            for(Object i : lista){
                System.out.println(i);
            }
        }


    }
}