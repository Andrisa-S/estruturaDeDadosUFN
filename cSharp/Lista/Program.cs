//Criação de lista
List<int> lista = new List<int>();

//Randomização
Random gerador = new Random();

int qtd = gerador.Next(10, 20);
for (int i = 0; i < qtd; i++)
{
    lista.Add(gerador.Next(1000));
}

//Ordenar
lista.Sort();

//Exibir por índice
//for (int i = 0; i < lista.Count; i++)
//{
//    Console.WriteLine(lista[i]);
//}

//Exibir por objeto
/* foreach (var i  in lista)
{
    Console.WriteLine(i);
} */

//Exibir por iteração
for (var i = lista.GetEnumerator(); i.MoveNext(); )
{
    int numero = i.Current;
    Console.WriteLine(numero);
}