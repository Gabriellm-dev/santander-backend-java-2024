import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("*******************************");
        System.out.println("Seja bem vindo ao BANCO-DIO");
        System.out.println("*******************************");
        System.out.println("Preencha os dados a seguir para criar sua conta no BANCO-DIO");
        System.out.println("*******************************");
        System.out.println();

        nomeCliente = obterNomeCliente(sc);

        System.out.print("Por favor, digite o número da Conta: ");
        numero = obterNumeroConta(sc);
        sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Por favor, digite o saldo atual da Conta: ");
        saldo = obterSaldo(sc);

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        System.out.println();
        sc.close();
    }

    private static String obterNomeCliente(Scanner sc) {
        String nome;
        while (true) {
            System.out.print("Por favor, digite o nome do Cliente: ");
            nome = sc.nextLine();
            if (contemApenasLetras(nome)) {
                return nome;
            } else {
                System.out.println("O nome do cliente deve conter apenas letras. Por favor, tente novamente.");
            }
        }
    }

    private static int obterNumeroConta(Scanner sc) {
        int numero;
        while (true) {
            try {
                numero = sc.nextInt();
                return numero;
            } catch (Exception e) {
                System.out.print("Número de conta inválido. Por favor, digite somente números com separador decimal virgula: ");
                sc.nextLine();
            }
        }
    }

    private static double obterSaldo(Scanner sc) {
        double saldo;
        while (true) {
            try {
                saldo = sc.nextDouble();
                return saldo;
            } catch (Exception e) {
                System.out.print("Saldo inválido. Por favor, digite somente números: ");
                sc.nextLine();
            }
        }
    }

    private static boolean contemApenasLetras(String str) {
        return str.matches("[a-zA-Z\\s]+");
    }
}
