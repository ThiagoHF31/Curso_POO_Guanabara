public class Video implements AcoesVideo{
    private String titulo;
    private double avaliação;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliação = 0.0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo =  false;
    }


    @Override
    public void play() {
        this.reproduzindo = true;
    }
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    @Override
    public void like() {
        this.curtidas ++;
    }




    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", avaliação=" + avaliação + ", views=" + views + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo + "]";
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getAvaliação() {
        return avaliação;
    }
    public void setAvaliação(double avaliação) {
        double nova;
        nova = (this.avaliação + avaliação)/this.views;
        this.avaliação = nova;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    
}