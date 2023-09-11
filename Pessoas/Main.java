public class Main {
    public static void main(String[] args) {
        Pessoa [] pessoas = new Pessoa[3];
        Livro [] livros = new Livro[3];

        pessoas[0] = new Pessoa("thiago", 19, "M" );
        pessoas[1] = new Pessoa("Maria", 24, "F" );
        pessoas[2] = new Pessoa("João", 54, "M" );

        livros[0] = new Livro("Aprendendo java", "Guanabara", 300, pessoas[0]);
        livros[1] = new Livro("POO em java", "Gustavo Guanabara", 500, pessoas[0]);
        livros[2] = new Livro("Estruturas de dados", "Guanabara novamente", 800, pessoas[2]);
        
        //livros[1].detalhes();
        //livros[0].detalhes();

        livros[1].abrir();
        livros[1].folhear(200);

        livros[1].detalhesTotais();
        livros[0].detalhesTotais();

        
    }
}
