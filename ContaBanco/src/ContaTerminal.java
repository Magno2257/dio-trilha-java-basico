import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String agencia;
        int conta;
        String nomeCliente;
        double saldo = 237.48;

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Por favor, digite o número da Agência!");
            agencia = sc.nextLine();

            System.out.println("Por favor, digite o número da Conta!");
            conta = sc.nextInt();

            sc.nextLine();

            System.out.println("Por favor, digite seu nome!");
            nomeCliente = sc.nextLine();
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
