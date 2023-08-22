import java.util.Scanner;

public class Soma {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();
        int resultado = a + b;
        System.out.println("Resultado da soma: " + resultado);
        scanner.close();
    }
}
