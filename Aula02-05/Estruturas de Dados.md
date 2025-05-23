# Estruturas de Dados
## Abstratas
### Lineares
- Lista
- Dicionário
- Pilha
- Fila

### Operações clássicas das ED lineares
- `add` (`Add`, `append`) | `push`, `Push` (pilha) | `offer`, `Enqueue` (fila)
- `remove` (`Remove`, `remove`) | `pop`, `Pop` (pilha) | `poll`, `Dequeue` (fila)
- `contains` (`Contains`, `in`)
- `isEmpty` (`Empty`, `empty`)
- `size` (`Count`, `len`)
- Pilha/Fila -> `peek`

### ED lineares em Java, C# e Python são baseadas na teoria da orientação a objetos
- Há objetos e classes que atendem serviços solicitados

### Contudo, há implementações dessas estruturas sem se basear na orientação a objetos
- São implementações procedurais, geralmente em C para atender necessidades em dispositivos ou recursos computacionais com baixo recurso (processador, memória, etc.)

- Possibilidade de trabalhar com estrutura de dados e suas operações via programação própria:
  - Criar a estrutura de dados usando `struct` em C
  - Criar todos os métodos:
    - `inserir`
    - `remover`
    - `estaContido`
    - `estaVazio`
    - `tamanho`

- Alocação dinâmica de memória:
  - Solicitar (SO) e usar memória em tempo de execução:
    - `malloc` - solicitar
    - `free` - liberar