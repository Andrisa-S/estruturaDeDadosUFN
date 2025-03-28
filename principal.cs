using System;

public class Aluno
{
    public int Matricula { get; set; }
    public string Nome { get; set; }
    public string Email { get; private set; }

    public Aluno(int matricula, string nome)
    {
        Matricula = matricula;
        Nome = nome;
        Email = GerarEmail();
    }

    private string GerarEmail()
    {
        string[] vetorNomes = Nome.ToLower().Split(" ");
        return $"{vetorNomes[0]}.{vetorNomes[vetorNomes.Length - 1]}@ufn.edu.br";
    }

    public override string ToString()
    {
        return $"Aluno [nome={Nome}, email={Email}]";
    }

    public override bool Equals(object obj)
    {
        if (obj is Aluno aluno)
        {
            return Email.Equals(aluno.Email);
        }
        return false;
    }

    public override int GetHashCode()
    {
        return Email.GetHashCode();
    }
}