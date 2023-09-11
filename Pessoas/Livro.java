public class Livro implements publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private boolean fechado;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.fechado = true;
        this.pagAtual = 0;
    }



    public void detalhes(){
        System.out.println("___________________________________________________");
        System.out.println("Detalhes do livro:");
        System.out.println("Quem está lendo: "+this.leitor.getNome());
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Total de paginas: "+this.totPaginas);
        System.out.println("Pagina atual: "+this.pagAtual);
        System.out.println("___________________________________________________");
    }

        public void detalhesTotais(){
        System.out.println("___________________________________________________");
        System.out.println("Detalhes do livro:");
        System.out.println("Quem está lendo: "+this.leitor.getNome());
        System.out.println("Idade: "+this.leitor.getIdade());
        System.out.println("Sexo: "+this.leitor.getSexo());
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Total de paginas: "+this.totPaginas);
        System.out.println("Pagina atual: "+this.pagAtual);
        System.out.println("Está aberto: "+this.aberto);

        System.out.println("___________________________________________________");
    }



    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean isFechado() {
        return fechado;
    }
    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

       public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }



    @Override
    public void abrir() {
        this.aberto = true;
    }



    @Override
    public void fechar() {
        this.fechado = true;
    }



    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            this.pagAtual = 0;
        }else{
        this.pagAtual = p;
        }
    }



    @Override
    public void avançarPag() {
        this.pagAtual++;
    }



    @Override
    public void voltaPag() {
        this.pagAtual--;
    }


}
