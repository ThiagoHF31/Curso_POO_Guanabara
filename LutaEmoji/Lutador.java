public class Lutador{
    private String nome;
    private int idade;
    private String nacionalidade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

  public Lutador(String nome, int idade, String nacionalidade, double altura, double peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("_________________________________________________________");
        System.out.println("Chegou a Hora! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de : " + this.getNacionalidade());
        System.out.println("com "+ this.getPeso() + "kg e " + this.getIdade()+" anos e com " + this.getAltura()+" metros");
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates()+" Empates");
        System.out.println("_________________________________________________________");
    }

    public void status(){
        System.out.println(this.getNome() + "É um peso "+ this.getCategoria());
        System.out.println("Ganhou" +this.getVitorias() + "vezes");
        System.out.println("Perdeu "+this.getDerrotas() +" vezes");
        System.out.println("Empatou" +this.getEmpates() +" vezes");

    }

    public void ganhaluta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setVitorias(this.getVitorias() - 1);

    }
    public void empateLuta(){
        this.setEmpates(this.getEmpates() + 1);
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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();

    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            System.out.println("Inválido para lutar");
        }else if(this.peso <= 73.3){
            this.categoria = "Peso Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Peso Médio";
        }else if (this.peso <= 120.2) {
            this.categoria = "Peso Pesado";
        }else {
            this.categoria = "Inválido para lutar";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}