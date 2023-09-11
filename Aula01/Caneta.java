public class Caneta {
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //METODOS
    void status(){
        System.out.println("Uma caneta: "+ this.cor);
        System.out.println("Está tampada? "+ this.tampada);
        System.out.println("Modelo da ponta: "+ this.ponta);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("A carga: "+ this.carga);
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, não posso rabiscar, estou tampada");
        }
        else{
            System.out.println("Estou rabiscando! ");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}

