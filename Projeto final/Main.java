public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        Vizuali visualizacao[] = new Vizuali[3];

        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");

        System.out.println(v[0].toString());

        g[0] = new Gafanhoto("João", 34, "M", "senha1234");
        g[1] = new Gafanhoto("Maria", 26, "F", "maria1234");

        System.out.println(g[0].toString());

        visualizacao[0] = new Vizuali(g[0], v[1]);
        System.out.println(visualizacao[0].toString());

        visualizacao[1] = new Vizuali(g[0], v[2]);
        System.out.println(visualizacao[1].toString());
        
    }
}
