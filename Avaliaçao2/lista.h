#include <cstdlib>
#include <iostream>
#include <algorithm>

using namespace std;

typedef struct no {
    int dado;
    struct no *prox;
} Celula;

Celula *inserir(int dado, Celula *lista){
    // Alocar memoria
    Celula *novo = (Celula *)malloc(sizeof(Celula));

    // Depositar valores que vem do parametro
    novo -> dado = dado;
    novo -> prox = NULL;

    // Testar se eh o primeiro elemento a ser inserido
    if (lista == NULL){ //if (!lista)
        return novo;
    }

    // Percorrer a estrutura ate o final
    Celula *p;
    for (p = lista; p -> prox != NULL; p = p -> prox) {
        if (dado == p->dado) {
            free(novo);
            return lista; // ou seja, dado ja inserido
        }
    }
    if (dado == p->dado) {
        free(novo);
        return lista; // ou seja, dado ja inserido
    }

    // Encadear e retornar
    p -> prox = novo;
    return lista;
}

Celula* gerarAleatorios(int n, Celula *lista){
    int vetor[100];
    // Preenche vetor com números de 1 a 100
    for (int i = 0; i < 100; i++){
        vetor[i] = i + 1;
    }

    // Embaralha vetor
    for (int i = 99; i > 0; i--){
        int j = rand() % (i + 1);
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    // Insere os primeiros n números únicos na lista
    for (int i = 0; i < n; i++){
        lista = inserir(vetor[i], lista);
    }

    return lista;
}

void exibir(Celula *lista){
    for (Celula *p = lista; p != NULL; p = p -> prox){
        cout << p -> dado << "\t";
    }
    cout << endl;
}

void exibirListas(Celula *lista1, Celula *lista2){
    for (Celula *p1 = lista1; p1 != NULL; p1 = p1 -> prox){
        for (Celula *p2 = lista2; p2 != NULL; p2 = p2->prox){
            if (p1 -> dado == p2 -> dado){
                cout << p1 -> dado << "\t";
                break;
            }
        }
    }
    cout << endl;
}

Celula *remover(int dado, Celula *lista){
    Celula *p, *pR; //*pR = p retaguarda
    for (p = lista, pR = NULL; p != NULL; pR = p, p = p -> prox){
        if (dado == p -> dado){ // remover
            if(p == lista){ // primeiro elemento
                lista = lista -> prox;
                free(p);
                return lista;
            } else if (!p -> prox){
                pR -> prox = NULL;
                free(p);
                return lista;
            }
            pR -> prox = p -> prox;
            free(p);
            return lista;
        }
    }
    return lista;
}

Celula* excluirPares(Celula *lista) {
    for (Celula *p = lista; p != NULL; ){
        if (p -> dado % 2 == 0){
            int valor = p->dado;
            lista = remover(valor, lista);
            p = lista; // reinicia do começo, para não perder referência
        } else {
            p = p -> prox;
        }
    }
    return lista;
}

Celula* unir(Celula *lista1, Celula *lista2){
    Celula *uniao = NULL;

    // Inserir todos os elementos de lista1
    for (Celula *p = lista1; p != NULL; p = p->prox){
        uniao = inserir(p->dado, uniao);
    }

    // Inserir todos os elementos de lista2
    for (Celula *p = lista2; p != NULL; p = p->prox){
        uniao = inserir(p->dado, uniao);
    }

    return uniao;
}

Celula* listaOrdenada(Celula *lista){
    Celula *ordenada = NULL;

    while (lista != NULL){
        Celula *atual = lista;
        lista = lista -> prox;

        if (ordenada == NULL || atual -> dado < ordenada -> dado){
            atual -> prox = ordenada;
            ordenada = atual;
        } else {
            Celula *p = ordenada;
            while (p -> prox != NULL && p -> prox -> dado < atual -> dado){
                p = p -> prox;
            }
            atual -> prox = p -> prox;
            p -> prox = atual;
        }
    }

    return ordenada;
}

Celula* limparLista(Celula *lista) {
    Celula *p = lista;
    while (p != NULL) {
        Celula *tmp = p;
        p = p->prox;
        free(tmp);
    }
    return NULL;  // Retorna NULL para indicar lista vazia
}
