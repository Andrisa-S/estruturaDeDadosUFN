#include <iostream>
#include <ctime>
#include "lista.h"

using namespace std;

int main(){
    srand(time(NULL)); // Inicializa o gerador aleatório

    Celula *lista1 = NULL;
    Celula *lista2 = NULL;

    lista1 = gerarAleatorios(25, lista1);
    lista2 = gerarAleatorios(27, lista2);

    cout << "Lista 1: ";
    exibir(lista1);
    cout << "\n";

    cout << "Lista 2: ";
    exibir(lista2);
    cout << "\n";

    cout << "Numeros em ambas as listas: ";
    exibirListas(lista1, lista2);

    lista1 = excluirPares(lista1);
    cout << "Lista 1 apos remocao de pares: ";
    exibir(lista1);
    cout << "\n";

    Celula *listaUnificada = unir(lista1, lista2);
    cout << "Lista unificada (lista1 + lista2): ";
    exibir(listaUnificada);

     cout << "\nLista ordenada:" << endl;
    exibir(listaOrdenada(listaUnificada));

    listaUnificada = limparLista(listaUnificada);

    return 0;
}
