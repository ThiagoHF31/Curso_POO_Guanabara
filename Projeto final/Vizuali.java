public class Vizuali {
    private Gafanhoto espectador;
    private Video filme;

    
    public Vizuali(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    
    @Override
    public String toString() {
        return "Vizuali [espectador=" + espectador + ", filme=" + filme + "]";
    }


    public void avaliar(){
        this.filme.setAvaliação(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliação(nota);
    }

    public void avalir(double porc){
        int tot = 0;
        if(porc <= 20){
            tot =3;
        }else if(porc <= 50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliação(tot);
    }


    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }


    
}
