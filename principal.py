from aluno import Aluno

def main():
    alunos = [] # alunos = list(Aluno)
    matricula = 1

    while True:
        nome = input("\nDigite nome: ").upper()
        tmp = Aluno(matricula, nome)

        if tmp in alunos:
            print("Aluno com este email já cadastrado!")
        else:
            alunos.append(tmp)
            print(f"Aluno cadastrado com a matricula: {matricula}") # print("Aluno cadastrado com a matricula", matricula)
            print(f"E com o email: {tmp.email}") # print("E com o email", tmp.email)
            matricula += 1

        opcao = input("\nContinuar? \n[1 - Sim; Outra tecla - Não]: ")
        if opcao != "1":
            break

        alunos.sort(key=lambda aluno: aluno.nome)

        print("Relação de alunos cadastrados:")
        for aluno in alunos:
            print(aluno)

if __name__ == "__main__":
    main()