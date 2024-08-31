import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numeroInformado = scanner.nextInt();

        calcularEExibirFibonacci(numeroInformado);

        if (pertenceFibonacci(numeroInformado)) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static void calcularEExibirFibonacci(int limite) {
        int fib1 = 0;
        int fib2 = 1;

        System.out.print("Sequência de Fibonacci até " + limite + ": ");
        System.out.print(fib1 + ", " + fib2);

        int fibAtual = fib1 + fib2;

        while (fibAtual <= limite) {
            System.out.print(", " + fibAtual);
            fib1 = fib2;
            fib2 = fibAtual;
            fibAtual = fib1 + fib2;
        }
        
        System.out.println();
    }

    public static boolean pertenceFibonacci(int numero) {
        if (numero < 0) {
            return false;
        }

        int fib1 = 0;
        int fib2 = 1;

        if (numero == fib1 || numero == fib2) {
            return true;
        }

        int fibAtual = fib1 + fib2;

        while (fibAtual <= numero) {
            if (fibAtual == numero) {
                return true;
            }

            fib1 = fib2;
            fib2 = fibAtual;
            fibAtual = fib1 + fib2;
        }

        return false;
    }
}
