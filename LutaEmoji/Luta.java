import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
   // private int rounds;
    private boolean aprovado;

    Random random = new Random();

    public void marcaLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(this.aprovado == true){
            desafiado.apresentar();
            desafiante.apresentar();
            int numeroAleatorio = random.nextInt(3);
            System.out.println();
            System.out.println("Numero que decide a vitoria: "+numeroAleatorio);
           // rounds++;

            if(numeroAleatorio == 0){
                System.out.println("A luta Empatou!");
                desafiado.getEmpates();
                desafiante.getEmpates();
            }else if (numeroAleatorio == 1){
                System.out.println("O desafiante(lutador 1) venceu! ");
                desafiante.ganhaluta();
                desafiado.perderLuta();
            }else{
                System.out.println("O desafiado (lutador 2) venceu! ");
                desafiante.perderLuta();
                desafiado.ganhaluta();
            }
        }else{
            System.out.println("A luta não pode acontecer");
        }
    }
}
