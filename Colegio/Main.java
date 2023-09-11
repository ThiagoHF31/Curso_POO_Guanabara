public class Main {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa("Matheus", 24, "M");
        //Como a classe pessoa agora é abstrata ela não pode gerar objetos 

        Aluno pessoaAluno = new Aluno("thiago", 19, "M", 
            true, "Eng de computação");

        Funcionario pessoaFuncionario = new Funcionario("João",
             34, "M", "zelador", true);

        Professor pessoaProfessor = new Professor("Maria", 34, 
            "F", "Matematica", 2.000);

        Visitante pessoaVisitante = new Visitante("Arnaldo", 38, "M");

        Bolsista pessoaBolsista = new Bolsista("Amanda", 23, "F", 
            true, "Computação", 123);

            
        pessoaVisitante.detalhes();

        pessoaAluno.pagarMensalidade();

        pessoaBolsista.pagarMensalidade();

    }
}
