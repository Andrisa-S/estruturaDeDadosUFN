class Aluno:
    def __init__(self, matricula, nome):
        self.matricula = matricula
        self.nome = nome
        self.email = self.gerar_email()

    def gerar_email(self):
        nomes = self.nome.lower().split(" ")
        return f"{nomes[0]}.{nomes[-1]}@ufn.edu.br"

    def __str__(self):
        return f"Aluno [nome={self.nome}, email={self.email}]"

    def __eq__(self, other):
        if isinstance(other, Aluno):
            return self.email == other.email
        return False
    