import java.util.Scanner;

public class Contador {


    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se parametroum é maior que parametro dois e lançar a excecao
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}


