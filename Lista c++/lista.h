#include <cstdlib>
#include <algorithm>

typedef struct no {
    int dado;
    struct no *prox;
} Celula;

Celula *inserir(int dado, Celula *lista){
    //Alocar mem�ria
    Celula *novo = (Celula *)malloc(sizeof(Celula));

    //Depositar valores que v�m do par�metro
    novo -> dado = dado;
    novo -> prox = NULL;


    //Testar se � o primeiro elemento a ser inserido
    if (lista == NULL){ //if (!lista)
        return novo;
    }

    //Percorrer a estrutura at� o final
    Celula *p;
    for (p = lista; p -> prox != NULL; p = p -> prox) {
        if (dado == p->dado) {
            free(novo);
            return lista; //ou seja, dado j� inserido
        }
    }

    //Encadear e retornar
    p -> prox = novo;
    return lista;

}

void exibir(Celula *lista){
    for (Celula *p = lista; p != NULL; p = p -> prox){
        cout << p -> dado << "\t";
    }

    cout << endl;
}

int contarLista(Celula *lista){
    int total = 0 ;
    for (Celula *p = lista; p != NULL; p = p -> prox){
        total++;
    }

    return total;
}

bool estaNaLista(int dado, Celula *lista){
    for (Celula *p = lista; p != NULL; p = p -> prox){
        if (dado == p -> dado){
            return true;
        }
    }
    return false;
}

int numeroOcorre(int dado, Celula *lista){
    int ocorrencia = 0;
    for (Celula *p = lista; p != NULL; p = p -> prox){
        if (dado == p -> dado){
            ocorrencia ++;
        }
    }
    return ocorrencia;
}

bool estaOrdenada(Celula *lista){
    for (Celula *p = lista; p != NULL; p = p -> prox){
        if (p -> dado > p -> prox -> dado){
            return false;
        }
    }
    return true;
}

double media(Celula *lista){
    int total = 0;
    for (Celula *p = lista; p != NULL; p = p -> prox){
        total += p -> dado;
    }

    double media = (total/(sizeof(Celula)));
    return media;
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
