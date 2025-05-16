#include <iostream>
using namespace std;

#include "lista.h"

int main(){
    Celula *lista = NULL;

    lista = inserir(7, lista);
    lista = inserir(10, lista);
    lista = inserir(5, lista);
    lista = inserir(70, lista);
    lista = inserir(101, lista);
    lista = inserir(7, lista);
    lista = inserir(55, lista);
    lista = inserir(5, lista);

    cout << "Lista contem " << contarLista(lista) << " elementos\n";
    exibir(lista);

    int numero;
    cout << "Digite numero para pesquisa: ";
    cin >> numero;

    cout << numero << " esta na lista?\n" << estaNaLista(numero, lista) << endl;

    //contar ocorr�ncias de um n�mero
    cout << numero << " aparece " << numeroOcorre(numero, lista) << " vezes" << endl;

    //verificar se a lista est� ou n�o ordenada
    cout << "A lista esta ordenada?\t" << estaOrdenada(lista) << endl;

    //calcular a m�dia dos elemento da lista
    cout << "Media da lista: " << media(lista) << endl;

    //alterar o inserir para que controle duplicados

    //criar m�todo de ordeena��o da lista encadeada
    cout << "\nLista ordenada:" << endl;
    exibir(listaOrdenada(lista));

    return 1;
}
