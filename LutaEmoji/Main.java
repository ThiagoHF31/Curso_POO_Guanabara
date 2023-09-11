public class Main {
    public static void main(String[] args) {
        Lutador luta[] = new Lutador[6]; 
        Luta ufc = new Luta();

      
        luta[0] = new Lutador("Pretty boy", 31, "França",
             1.75, 68.9, 11, 2, 1); 

        luta[1] = new Lutador("Putscript", 25, "Brazil",
             1.68, 70.8, 14, 2, 3);

        ufc.marcaLuta(luta[0], luta[1]);
        ufc.lutar();

        luta[0].status();
        luta[1].status();

    }
}
