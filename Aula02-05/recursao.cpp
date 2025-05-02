#include <iostream>
using namespace std;

int main() {
    int numero;
    cout << "Digite um numero positivo: ";
    cin >> numero;

    for (int i = 0; i <= numero; i++) {
        cout << i << "\n";
    }
    return 1;
}

//-----------

//exibir números entre o numero informado e o zero de forma recursiva

#include <iostream>
using namespace std;

void exibirCrescente(int i) {
    if (i >= 0) {        
        cout << i << "\n";
        exibirCrescente(i-1);
    }
}

int main() {
    int numero;
    numero = 5;
    exibirCrescente(numero);
    return 1;
}