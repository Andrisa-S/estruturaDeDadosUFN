
# Recursão

**Recursão** → Técnica de repetição por empilhamento de processo → o mesmo processo se chamando várias vezes.

## Entendendo a Repetição

- Entender o que compõe uma repetição:

```cpp
for (inicialização da variável de controle; teste de parada com a variável de controle; transformação da variável de controle)
```

Processo - var1, var2 - id4  
Processo - var1, var2 - id3  
Processo - var1, var2 - id2  
Processo - var1, var2 - id1  

```cpp
Objeto.metodo(outroObjeto.metodo(outroDenovoObjeto.atributo))

void  metodoRecursivo(...., variavelControle){
    if (teste de parada){
        //código no empilhamento

        //ponto de recursão, ou chamada recursiva transformando variável de controle

        //código no desempilhamento
    }
}

tipo metodoRecursivo(...., variavelControle){
    if (teste de parada){
        //código no empilhamento

        //ponto de recursão 

        //código no desempilhamento
    }
}
```
