public class Aluno extends Pessoa{
    private boolean matriculaAtiva;
    private String curso;

    public Aluno(String nome, int idade, String sexo, boolean matriculaAtiva, String curso) {
        super(nome, idade, sexo);
        this.matriculaAtiva = matriculaAtiva;
        this.curso = curso;
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade do aluno "+this.getNome()+" paga");
    }

    public void cancelarMatriula(){
        this.matriculaAtiva = false;
        System.out.println("Matriula cancelada! ");
    }

    public boolean getMatricula() {
        return matriculaAtiva;
    }

    public void setMatricula(boolean matriculaAtiva) {
        this.matriculaAtiva = matriculaAtiva;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
