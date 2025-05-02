# Recursão

Recursão é uma técnica de programação que substitui os laços/loops tradicionais:
- `for`, `while`, `do-while`
- Técnica baseada em **empilhamento** do mesmo processo:
  - O mesmo método chama a si mesmo de forma recursiva.

## Estrutura básica de uma repetição
1. **Inicialização** da variável de controle
2. **Teste de parada** (condição base)
3. **Transformação** da variável de controle (incremento/decremento/modificação)

### Exemplos com loops tradicionais:
```java
// For
for (int i = 0; i < 10; i++) { }

// While
int i = 0;
while (i < 10) { i++; }

// Do-While
int j = 0;
do { j++; } while(j < 10);
```
## Tipos de Recursão

### - Recursão sem retorno (métodos `void`)
```java
void metodoExemplo(int variavelControle) {
    if (testeDeParada) {  // Condição base
        // Chamada recursiva com transformação do parâmetro
        metodoExemplo(variavelControleTransformada);
    }
}
```
### - Recursão com retorno -> via métodos com retorno com um tipo de dado
