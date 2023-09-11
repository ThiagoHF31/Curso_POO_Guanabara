public class Main{
    public static void main(String[] args) {
        Lobo lobo = new Lobo();
        Mamifero mamifero = new Mamifero();
        Cachorro cachorro = new Cachorro();

        mamifero.emitirSom();
        cachorro.emitirSom();
        lobo.emitirSom();

        System.out.println("___________________");

        cachorro.reagir(12, 34);
        cachorro.reagir(15, 3.4);
        cachorro.reagir(true);
        cachorro.reagir("Ola");
    }
}