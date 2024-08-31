import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        int contador = contarLetrasA(entrada);

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }

    public static int contarLetrasA(String texto) {
        int contador = 0;

        String textoMinusculo = texto.toLowerCase();

        for (int i = 0; i < textoMinusculo.length(); i++) {
            if (textoMinusculo.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }
}
