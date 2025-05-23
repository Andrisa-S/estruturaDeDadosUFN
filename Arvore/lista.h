typedef struct no{
    int dado;
    struct no *prox;
} Lista;

Lista *inserir(int dado, Lista *lista){
    if (lista && dado >= lista -> dado){
        if (dado != lista -> dado){
            //avançar na lista
            lista -> prox = inserir(dado, lista -> prox);   
        }
        return lista;
    } else { //cheguei no final da lista
        Lista *novo = (Lista*)malloc(sizeof(Lista));
        novo -> dado = dado;
        if (lista){
            novo -> prox = lista;
        } else{
            novo -> prox = NULL;
        }
        return novo;
    }
}

void exibir(Lista *lista){
    if (lista){
        cout << lista -> dado << endl;
        exibir(lista -> prox);
    }
}

int contar(Lista *lista){
    if (lista){
        return 1 + contar(lista -> prox);
    }
    return 0;
}

Lista *localizar(int numero, Lista *lista){
    if (lista){
        if (numero == lista -> dado){
            return lista;
        }
        return localizar(numero, lista -> prox);
    }
    return NULL;
}
