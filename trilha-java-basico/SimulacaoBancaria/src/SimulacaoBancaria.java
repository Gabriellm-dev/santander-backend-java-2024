import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double saldo = 0;
        double saque = 0;
        boolean loop = true;

        while (loop) {
            int opcao = scanner.nextInt();

            switch (opcao) {

                case 0:
                    loop = false;
                    System.out.println("Programa encerrado.");
                    break;
                case 1:
                    saldo = scanner.nextDouble();
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;

                case 2:
                    saque = scanner.nextDouble();
                    if (saldo >= saque) {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente." );
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;

                default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}