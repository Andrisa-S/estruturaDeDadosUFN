//Criação da lista
List<String> listaNomes = new List<string>();
string opcao;
string nome;

do
{
    Console.WriteLine("\nDigite um nome completo: ");
    nome = Console.ReadLine();
    nome = nome.ToUpper();

    //Adicionar nomes não cadastrados
    if (!listaNomes.Contains(nome))
    {
        listaNomes.Add(nome);
    } else
    {
        Console.WriteLine("Nome já cadastrado!");
    }

    Console.WriteLine("\n1 - Continua;\n2 - Finaliza:");
    opcao = Console.ReadLine();
} while (opcao != "2");

//Ordenar
listaNomes.Sort();

//Exibir quantia de nomes
Console.WriteLine("A lista contém: "+ listaNomes.Count + " nomes\n");

//Exibir lista ordenada
foreach (var i in listaNomes)
{
    Console.WriteLine(i);
}
