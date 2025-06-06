#include <iostream>
#include <cstdlib>

using namespace std;

#include "arvore.h"

int main(){

    Arvore *arvore = NULL;
    arvore = inserir(50, arvore);
    arvore = inserir(35, arvore);
    arvore = inserir(40, arvore);
    arvore = inserir(60, arvore);

    cout << "Total de elementos: " << contar(arvore) << endl;
    cout << "Total de elementos pares: " << contarPares(arvore) << endl;
    cout << "Total de folhas: "<< contarFolhas(arvore) << endl;
    cout << "Folhas: ";
    exibirFolhas(arvore);
    cout << "\nElementos ordenados: ";
    exibirOrdenado(arvore);

    cout << "Elemento existe?\t" << localizar(40, arvore);

    return 1;
}
