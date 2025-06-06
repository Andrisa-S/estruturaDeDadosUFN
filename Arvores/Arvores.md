# - Árvores binarias de pesquisa ou Árvores binárias de busca
    - estruturas de dados não lineares ordenadas

            {A: 50}
          / { B|D } \
    {B: 35}         {D: 60}
    { .|C }         { .|. }

        \   {C: 40}  
            { .|. }

## - Percurso
    - Pré-fixado ou RED (visita Raiz, Esquerda, Direita)
        - localizar, contar, inserir
        50, 35, 40, 60
    - In-fixado ou ERD (Esquerda, visita Raiz, Direita)
        - exibir ordenado
        35, 40, 50, 60
    - Pós-fixado ou EDR (Esquerda, Direita, visita Raiz)
        - deletar, calcular fator de balanceamento
        40, 35, 60, 50

Cpp´´´

void red(Arvore *raiz) {
    if (raiz){
        cout << raiz -> dado << endl;
        red(raiz -> esq);
        red(raiz -> dir);
    }
}

void erd(Arvore *raiz) {
    if (raiz){
        erd(raiz -> esq);
        cout << raiz -> dado << endl;
        erd(raiz -> dir);
    }
}

void edr(Arvore *raiz) {
    if (raiz){
        edr(raiz -> esq);
        edr(raiz -> dir);
        cout << raiz -> dado << endl;
    }
}

´´´