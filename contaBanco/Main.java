import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Corrente c1 = new Corrente();
        int n;

        do{
        System.out.println();
        System.out.println("________________________________________________________________");
        System.out.println("Bem vindo ao Banco, oque deseja fazer hoje?");
        System.out.println();
        System.out.println("1 - Abrir conta");
        System.out.println("2 - Fechar conta");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sacar");
        System.out.println("5 - Estado da conta");
        System.out.println("6 - Pagar anuidade");
        System.out.println("7 - Sair");
        System.out.println();
        n = reader.nextInt();
        
        switch (n) {
            case 1:
                c1.AbrirConta();
                break;
            case 2:
                c1.FecharConta();
                break;
            case 3:
                c1.Depositar();
                break;
            case 4:
                c1.Sacar();
            case 5:
                c1.estadoAtual();
                break;
            case 6:
                c1.pagarMensal();
                break;
            case 7:
                break;
            default:
                System.out.println("Opção inválida");  
                }
            }while(n != 7);
    
            reader.close();
    }
}
