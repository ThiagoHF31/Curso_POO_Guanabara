public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Canguru c = new Canguru();

        System.out.println("_________________________");
        //Aqui referece a classe mamifero
        System.out.println("_____Mamifero____");
        m.setPeso(85);
        m.setIdade(2);
        m.setMembros(4);

        m.locomover();
        m.alimentar();
        m.emitirsom();

        System.out.println("_________________________");
        System.out.println("Peso "+ m.getPeso() + "\nIdade: " + m.getIdade() + " anos" +
            "\nQuantidade de membros; " + m.getMembros());

        //Peixe
        System.out.println("_________________________");
        System.out.println("_____Peixe_____");
        p.setPeso(0.35);
        p.setIdade(1);
        p.setMembros(0);

        p.locomover();
        p.alimentar();
        p.emitirsom();

        System.out.println("________________________");
        System.out.println("Peso "+ p.getPeso() + "\nIdade: " + p.getIdade() + " anos" +
            "\nQuantidade de membros; " + p.getMembros());

        //canguro
        System.out.println("________________________");
        System.out.println("_____Canguro_____");
        c.setPeso(55.30);
        c.setIdade(3);
        c.setMembros(4);

        c.locomover();
        c.alimentar();
        c.emitirsom();
        c.usarBolsa();

        System.out.println("________________________");
        System.out.println("Peso "+ c.getPeso() + "\nIdade: " + c.getIdade() + " anos" +
            "\nQuantidade de membros; " + c.getMembros());
        
    }
}
