import java.util.Locale;
import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = 0.0;
        double limiteRestante = 0.0;
        double valorSaque = 0.0;

        limiteDiario = scanner.nextDouble();
        limiteRestante = limiteDiario;

        for (int i = 1; ; i++) {
            if (!scanner.hasNextDouble()) {
                break;
            }
            valorSaque = scanner.nextDouble();
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }
            if (valorSaque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            } else {
                limiteRestante -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteRestante);
            }
        }

        scanner.close();
    }
}

