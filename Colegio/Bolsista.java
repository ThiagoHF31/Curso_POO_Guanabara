public class Bolsista extends Aluno{
    private int bolsa;

    public Bolsista(String nome, int idade, String sexo, boolean matriculaAtiva, String curso, int bolsa) {
        super(nome, idade, sexo, matriculaAtiva, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Bolsa de "+this.getNome()+" renovada");
    }

    @Override
    public void pagarMensalidade() {
        // TODO Auto-generated method stub
        super.pagarMensalidade();
        System.out.println(this.getNome() + "é bolsista pagamento facilitado");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }



}
