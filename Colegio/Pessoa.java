public abstract class Pessoa{
    private String nome;
    private int idade;
    private String sexo;

    
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //como ele é final agora, esse metodo não pode ser sobrescrito nas demais classes
    public final void fazerAniversario(){
        this.idade++;
    }

    public void detalhes() {
        System.out.println("Pessoa [nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + "]");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}