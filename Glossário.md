*Revisão*
  - Listas
    - Dicionários -> par de atributos: 1° é uma chave; 2° é o valor
    - Lista de: tipos primitivos; listas; dicionários; objetos
  - Pilhas
  - Filas
  - Árvores
  - Grafos

*Lista, Dicionário e Lista em dicionário:*

### 1. **Lista (ArrayList)**
Em Java, uma lista pode ser representada pela classe `ArrayList`, que faz parte do framework `java.util`. Ela armazena uma coleção ordenada e mutável de elementos.

- **Características**:
  - Ordenada: Mantém a ordem de inserção.
  - Mutável: Permite adicionar, remover e modificar elementos.
  - Indexada: Acessa elementos por índices numéricos.

- **Exemplo em Java**:
  ```java
  import java.util.ArrayList;

  public class ExemploLista {
      public static void main(String[] args) {
          // Criando uma lista de inteiros
          ArrayList<Integer> lista = new ArrayList<>();

          // Adicionando elementos
          lista.add(10);
          lista.add(20);
          lista.add(30);

          // Acessando elementos
          System.out.println("Primeiro elemento: " + lista.get(0)); // Saída: 10

          // Modificando um elemento
          lista.set(1, 25); // Altera o segundo elemento para 25
          System.out.println("Lista após modificação: " + lista); // Saída: [10, 25, 30]

          // Removendo um elemento
          lista.remove(2); // Remove o terceiro elemento
          System.out.println("Lista após remoção: " + lista); // Saída: [10, 25]
      }
  }
  ```

---

### 2. **Dicionário (HashMap)**
Em Java, um dicionário pode ser representado pela classe `HashMap`, que armazena pares **chave-valor**. Cada chave é única e mapeia para um valor.

- **Características**:
  - Não ordenado: A ordem de inserção não é garantida.
  - Mutável: Permite adicionar, remover e modificar pares chave-valor.
  - Indexado por chaves: Acessa valores por meio de chaves.

- **Exemplo em Java**:
  ```java
  import java.util.HashMap;

  public class ExemploDicionario {
      public static void main(String[] args) {
          // Criando um dicionário (HashMap)
          HashMap<String, Integer> dicionario = new HashMap<>();

          // Adicionando pares chave-valor
          dicionario.put("João", 25);
          dicionario.put("Maria", 30);
          dicionario.put("Pedro", 22);

          // Acessando valores por chave
          System.out.println("Idade de João: " + dicionario.get("João")); // Saída: 25

          // Modificando um valor
          dicionario.put("Maria", 31); // Atualiza a idade de Maria
          System.out.println("Dicionário após modificação: " + dicionario);

          // Removendo um par chave-valor
          dicionario.remove("Pedro");
          System.out.println("Dicionário após remoção: " + dicionario);
      }
  }
  ```

---

### 3. **Dicionário em Lista**
Em Java, podemos combinar `ArrayList` e `HashMap` para criar uma lista de dicionários. Cada elemento da lista será um `HashMap`.

- **Características**:
  - Cada elemento da lista é um `HashMap`.
  - Útil para armazenar múltiplos registros com a mesma estrutura.

- **Exemplo em Java**:
  ```java
  import java.util.ArrayList;
  import java.util.HashMap;

  public class ExemploDicionarioEmLista {
      public static void main(String[] args) {
          // Criando uma lista de dicionários (HashMap)
          ArrayList<HashMap<String, String>> listaDeDicionarios = new ArrayList<>();

          // Criando o primeiro dicionário
          HashMap<String, String> dicionario1 = new HashMap<>();
          dicionario1.put("nome", "João");
          dicionario1.put("idade", "25");
          dicionario1.put("cidade", "São Paulo");

          // Criando o segundo dicionário
          HashMap<String, String> dicionario2 = new HashMap<>();
          dicionario2.put("nome", "Maria");
          dicionario2.put("idade", "30");
          dicionario2.put("cidade", "Rio de Janeiro");

          // Adicionando os dicionários à lista
          listaDeDicionarios.add(dicionario1);
          listaDeDicionarios.add(dicionario2);

          // Acessando o primeiro dicionário na lista
          System.out.println("Primeiro dicionário: " + listaDeDicionarios.get(0));

          // Acessando o nome do segundo dicionário
          System.out.println("Nome no segundo dicionário: " + listaDeDicionarios.get(1).get("nome"));
      }
  }
  ```

---

### Resumo das Estruturas em Java:
| **Estrutura**       | **Classe em Java** | **Características**                                                                 |
|----------------------|--------------------|-------------------------------------------------------------------------------------|
| **Lista**            | `ArrayList`        | Coleção ordenada e mutável de elementos, acessados por índices numéricos.           |
| **Dicionário**       | `HashMap`          | Coleção de pares chave-valor, acessados por chaves únicas.                          |
| **Dicionário em Lista** | `ArrayList<HashMap>` | Lista onde cada elemento é um `HashMap`, útil para armazenar múltiplos registros. |

---

Esses exemplos mostram como implementar e trabalhar com listas, dicionários e combinações dessas estruturas em Java. Essas estruturas são amplamente utilizadas em programas reais para organizar e manipular dados.
