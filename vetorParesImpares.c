#include <stdio.h>
#define n 50

void lerVetor();
void mostrarVetor(int *p);
void separarVetores();


int v[n]; //Variável global
int pares[n]; //Vetor pares
int impares[n]; //Vetor impares
int qtdPares = 0; // Quantidade de pares
int qtdImpares = 0; // Quantidade de impares

//Função para leitura do vetor
void lerVetor (){
    int i;
    int min = 0;
    int max = 500;

    for(i = 0; i < n; i++){
        v[i] = (rand()% (max - min +1)) + min;
    }

    return 0;
}

//Função para exibir o vetor
void mostrarVetor (int *p){
    int i;

    for(i = 0; i < n; i++){
        printf("%d\t", *(p+i));
    }
    printf("\n");

    return;
}

//Função para separar pares e impares
void separarVetores (int *p){
    int i;

    for(i = 0; i < n; i++){
        if (v[i]%2 == 0){
            pares[qtdPares] = v[i];
            qtdPares++;
        }
        else {
            impares[qtdImpares] = v[i];
            qtdImpares++;
        }
    }
    return;
}

// Função para mostrar o vetor de pares
void mostrarPares() {

    for(int i = 0; i < qtdPares; i++) {
        printf("%d\t", pares[i]);
    }
    printf("\n");
}

// Função para mostrar o vetor de impares
void mostrarImpares() {

    for(int i = 0; i < qtdImpares; i++) {
        printf("%d\t", impares[i]);
    }
    printf("\n");
}

int main(){
    lerVetor();
    printf("Vetor v:\n");
    mostrarVetor(v);
    printf("\n");
    separarVetores(v);
    printf("Vetor pares:\n");
    mostrarPares();
    printf("Vetor impares:\n");
    mostrarImpares();

    return 0;

}
