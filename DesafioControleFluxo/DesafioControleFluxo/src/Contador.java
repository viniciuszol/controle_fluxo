import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        try {
            if (primeiroNumero >= segundoNumero) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            contar(primeiroNumero, segundoNumero);

        } 
        catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
         finally {
        scanner.close();
    }
    }

    public static void contar(int primeiroNumero, int segundoNumero) {
        int quantidadeInteracoes = segundoNumero - primeiroNumero;
        for (int i = 1; i <= quantidadeInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}