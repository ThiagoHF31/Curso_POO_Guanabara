import java.util.Scanner;
public class Corrente{
    public int numConta = 0;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;


    Scanner reader = new Scanner(System.in);

    public Corrente(){
        this.saldo = 0;
        this.status = false;
    }
    public void estadoAtual(){
        System.out.println("________________________________________________________________");
        System.out.println("Numero da Conta: "+ this.getNumConta());
        System.out.println("Tipo:  "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.isStatus());
        System.out.println("________________________________________________________________");
    }

    void AbrirConta(){

        System.out.println("________________________________________________________________");
        System.out.println("\033[32mDigite o nome do dono da conta: \033[0m");
        this.dono = reader.nextLine();

        do{
        System.out.println("\033[32mDigite o tipo de conta que deseja abrir\033[0m\n[CC] Conta corrente\n[CP] Conta poupança");
        this.tipo = reader.nextLine();

// this.nome.equals(nome) == nome 

        if(this.tipo.equals("CC")){
            numConta += 1;
            this.setSaldo(50);
            this.status = true;
            break;
        }
        else if(this.tipo.equals("CP")){
            numConta += 2;
            this.setSaldo(150);
            this.status = true;
            break;
        }
        else{
            System.out.println("\033[31mTipo invalido!\033[0m");
            this.status = false;
        }
    }while(this.tipo!= "CC" || this.tipo != "CP");
    System.out.println("________________________________________________________________");

    System.out.println("\033[32mTudo certo Conta criada!\033[0m");
    }

    void FecharConta(){
        if(this.saldo > 0){
            System.out.println("\033[31mConta não pode ser fechada, ha saldo disponivel\033[0m");
        }
        else if(this.saldo < 0){
            System.out.println("\033[31mConta não pode ser fechada, há debitos a serem pagos.\033[0m");
        }
        else if(this.saldo == 0){
            System.out.println("Digite o nome do dono da conta: ");
            String dono = reader.nextLine();
            if(this.dono.equals(dono)){
                System.out.println("\033[35mConta encontrada!\033[0m");
                this.status = false;
                System.out.println("\033[33mConta fechada com sucesso\033[0m");
            }
            else{
                System.out.println("\033[31mConta não encontrada\033[0m");
            }
        }
    }
    void Sacar(){

        double valor=0;
        if(this.status == true){
            System.out.println("Digite o valor a sacar: ");
            valor = reader.nextDouble();
            reader.nextLine();
            if(this.saldo >= valor){
                this.saldo -= valor;
                System.out.println("\033[32mSaque realizado com sucesso na conta\033[0m "+getDono());
            }
            else{
                System.out.println("\033[31mSaldo insuficiente\033[0m");
            }
        }else{
            System.out.println("Sua conta está inativa.");
        }
    }
    void Depositar(){
        double valor=0;
        if(this.status == true){
            System.out.println("Digite o valor a depositar: ");
            valor = reader.nextDouble();
            reader.nextLine();
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso na conta de: "+getDono());
        }
        else{
            System.out.println("Sua conta está inativa!");
        }
    }
    public void pagarMensal(){
        if(this.status == true){
            if(this.tipo == "CC" && this.saldo >= 12){
                this.saldo -= 12;
            }else if(this.tipo == "CP" && this.saldo >= 20){
                this.saldo -= 20;
            }
            else{
                System.out.println("Saldo insuficiente");
            }
            System.out.println("Mensalidade paga com sucesso na conta de: "+getDono());
        }
        else{
            System.out.println("Conta inativa!");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
} 